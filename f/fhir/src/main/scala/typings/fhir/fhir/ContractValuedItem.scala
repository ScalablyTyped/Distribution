package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Valued Item List
  */
@js.native
trait ContractValuedItem extends BackboneElement {
  
  /**
    * Contains extended information for property 'effectiveTime'.
    */
  var _effectiveTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'points'.
    */
  var _points: js.UndefOr[Element] = js.native
  
  /**
    * Contract Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Contract Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Contract Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.native
  
  /**
    * Contract Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.native
  
  /**
    * Contract Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Total Contract Valued Item Value
    */
  var net: js.UndefOr[Money] = js.native
  
  /**
    * Contract Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.native
  
  /**
    * Count of Contract Valued Items
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Contract Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.native
}
object ContractValuedItem {
  
  @scala.inline
  def apply(): ContractValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractValuedItem]
  }
  
  @scala.inline
  implicit class ContractValuedItemMutableBuilder[Self <: ContractValuedItem] (val x: Self) extends AnyVal {
    
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
