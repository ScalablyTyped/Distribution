package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Term Valued Item List
  */
trait ContractTermValuedItem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'effectiveTime'.
    */
  var _effectiveTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'points'.
    */
  var _points: js.UndefOr[Element] = js.undefined
  
  /**
    * Contract Term Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Contract Term Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contract Term Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Contract Term Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  
  /**
    * Contract Term Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Total Contract Term Valued Item Value
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * Contract Term Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.undefined
  
  /**
    * Contract Term Valued Item Count
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Contract Term Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ContractTermValuedItem {
  
  @scala.inline
  def apply(): ContractTermValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermValuedItem]
  }
  
  @scala.inline
  implicit class ContractTermValuedItemMutableBuilder[Self <: ContractTermValuedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveTime(value: dateTime): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    @scala.inline
    def setEntityCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "entityCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityCodeableConceptUndefined: Self = StObject.set(x, "entityCodeableConcept", js.undefined)
    
    @scala.inline
    def setEntityReference(value: Reference): Self = StObject.set(x, "entityReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityReferenceUndefined: Self = StObject.set(x, "entityReference", js.undefined)
    
    @scala.inline
    def setFactor(value: decimal): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    @scala.inline
    def setPoints(value: decimal): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    @scala.inline
    def set_effectiveTime(value: Element): Self = StObject.set(x, "_effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveTimeUndefined: Self = StObject.set(x, "_effectiveTime", js.undefined)
    
    @scala.inline
    def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
    
    @scala.inline
    def set_points(value: Element): Self = StObject.set(x, "_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pointsUndefined: Self = StObject.set(x, "_points", js.undefined)
  }
}
