package model;

import model.enums.Tipo_Produto;

public class Produto {
    private String nome;
    private Double preco;
    private Tipo_Produto tipo;
    private Estoque estoque;

    public Produto(String nome, Double preco, Tipo_Produto tipo, Estoque estoque) {
      this.nome = nome;
      this.preco = preco;
      this.tipo = tipo;
      this.estoque = estoque;
    }

    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public Double getPreco() {
      return preco;
    }
    public void setPreco(Double preco) {
      this.preco = preco;
    }
    public Tipo_Produto getTipo() {
      return tipo;
    }
    public void setTipo(Tipo_Produto tipo) {
      this.tipo = tipo;
    }

    public Estoque getEstoque() {
      return estoque;
    }

    public void setEstoque(Estoque estoque) {
      this.estoque = estoque;
    }
    
    public String toString() {
    	return "Nome: " + nome + "\nPreço: " + preco + "\nEstoque: " + 
    			estoque.getEstoque() + "\nTipo: " + tipo;
    }

}
