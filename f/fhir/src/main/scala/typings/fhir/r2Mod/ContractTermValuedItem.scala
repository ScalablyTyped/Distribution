package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermValuedItem
  extends StObject
     with BackboneElement {
  
  var _effectiveTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the time during which this Contract Term ValuedItem information is effective.
    */
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specific type of Contract Provision Valued Item that may be priced.
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specific type of Contract Provision Valued Item that may be priced.
    */
  var entityReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies a Contract Provision Valued Item instance.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Quantity] = js.undefined
  
  /**
    * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
    */
  var points: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A Contract Provision Valued Item unit valuation measure.
    */
  var unitPrice: js.UndefOr[Quantity] = js.undefined
}
object ContractTermValuedItem {
  
  inline def apply(): ContractTermValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermValuedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTermValuedItem] (val x: Self) extends AnyVal {
    
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
    
    inline def setNet(value: Quantity): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setUnitPrice(value: Quantity): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_effectiveTime(value: Element): Self = StObject.set(x, "_effectiveTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveTimeUndefined: Self = StObject.set(x, "_effectiveTime", js.undefined)
  }
}
