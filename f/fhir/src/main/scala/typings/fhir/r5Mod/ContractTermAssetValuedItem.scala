package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermAssetValuedItem
  extends StObject
     with BackboneElement {
  
  var _effectiveTime: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _payment: js.UndefOr[Element] = js.undefined
  
  var _paymentDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the time during which this Contract ValuedItem information is effective.
    */
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specific type of Contract Valued Item that may be priced.
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specific type of Contract Valued Item that may be priced.
    */
  var entityReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies a Contract Valued Item instance.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Id  of the clause or question text related to the context of this valuedItem in the referenced form or QuestionnaireResponse.
    */
  var linkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * Terms of valuation.
    */
  var payment: js.UndefOr[String] = js.undefined
  
  /**
    * When payment is due.
    */
  var paymentDate: js.UndefOr[String] = js.undefined
  
  /**
    * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
    */
  var points: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Who will receive payment.
    */
  var recipient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who will make payment.
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  
  /**
    * A set of security labels that define which terms are controlled by this condition.
    */
  var securityLabelNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A Contract Valued Item unit valuation measure.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ContractTermAssetValuedItem {
  
  inline def apply(): ContractTermAssetValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermAssetValuedItem]
  }
  
  extension [Self <: ContractTermAssetValuedItem](x: Self) {
    
    inline def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    inline def setEntityCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "entityCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setEntityCodeableConceptUndefined: Self = StObject.set(x, "entityCodeableConcept", js.undefined)
    
    inline def setEntityReference(value: Reference): Self = StObject.set(x, "entityReference", value.asInstanceOf[js.Any])
    
    inline def setEntityReferenceUndefined: Self = StObject.set(x, "entityReference", js.undefined)
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLinkId(value: js.Array[String]): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setLinkIdVarargs(value: String*): Self = StObject.set(x, "linkId", js.Array(value*))
    
    inline def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRecipient(value: Reference): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setResponsible(value: Reference): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setSecurityLabelNumber(value: js.Array[Double]): Self = StObject.set(x, "securityLabelNumber", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelNumberUndefined: Self = StObject.set(x, "securityLabelNumber", js.undefined)
    
    inline def setSecurityLabelNumberVarargs(value: Double*): Self = StObject.set(x, "securityLabelNumber", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_effectiveTime(value: Element): Self = StObject.set(x, "_effectiveTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveTimeUndefined: Self = StObject.set(x, "_effectiveTime", js.undefined)
    
    inline def set_linkId(value: js.Array[Element]): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_linkIdVarargs(value: Element*): Self = StObject.set(x, "_linkId", js.Array(value*))
    
    inline def set_payment(value: Element): Self = StObject.set(x, "_payment", value.asInstanceOf[js.Any])
    
    inline def set_paymentDate(value: Element): Self = StObject.set(x, "_paymentDate", value.asInstanceOf[js.Any])
    
    inline def set_paymentDateUndefined: Self = StObject.set(x, "_paymentDate", js.undefined)
    
    inline def set_paymentUndefined: Self = StObject.set(x, "_payment", js.undefined)
  }
}
