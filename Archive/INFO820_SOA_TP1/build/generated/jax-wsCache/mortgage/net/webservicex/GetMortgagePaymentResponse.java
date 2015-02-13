
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMortgagePaymentResult" type="{http://www.webserviceX.NET/}MortgageResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMortgagePaymentResult"
})
@XmlRootElement(name = "GetMortgagePaymentResponse")
public class GetMortgagePaymentResponse {

    @XmlElement(name = "GetMortgagePaymentResult")
    protected MortgageResults getMortgagePaymentResult;

    /**
     * Obtient la valeur de la propriété getMortgagePaymentResult.
     * 
     * @return
     *     possible object is
     *     {@link MortgageResults }
     *     
     */
    public MortgageResults getGetMortgagePaymentResult() {
        return getMortgagePaymentResult;
    }

    /**
     * Définit la valeur de la propriété getMortgagePaymentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link MortgageResults }
     *     
     */
    public void setGetMortgagePaymentResult(MortgageResults value) {
        this.getMortgagePaymentResult = value;
    }

}
