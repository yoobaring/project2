package com.delaroystudios.sqliterecyclerview.model;

/**
 * Created by delaroy on 5/10/17.
 */
public class Beneficiary {

    private int id;
    private String name;
    private String address;
    private String country;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}