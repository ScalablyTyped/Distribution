package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeItemDefinitionPropertyGroup
  extends StObject
     with BackboneElement {
  
  /**
    * The applicability conditions can be used to ascertain whether a billing item is allowed in a specific context. E.g. some billing codes may only be applicable in out-patient settings, only to male/female patients or only to children.
    */
  var applicability: js.UndefOr[js.Array[ChargeItemDefinitionApplicability]] = js.undefined
  
  /**
    * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the prices have been calculated.
    */
  var priceComponent: js.UndefOr[js.Array[ChargeItemDefinitionPropertyGroupPriceComponent]] = js.undefined
}
object ChargeItemDefinitionPropertyGroup {
  
  inline def apply(): ChargeItemDefinitionPropertyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChargeItemDefinitionPropertyGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeItemDefinitionPropertyGroup] (val x: Self) extends AnyVal {
    
    inline def setApplicability(value: js.Array[ChargeItemDefinitionApplicability]): Self = StObject.set(x, "applicability", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityUndefined: Self = StObject.set(x, "applicability", js.undefined)
    
    inline def setApplicabilityVarargs(value: ChargeItemDefinitionApplicability*): Self = StObject.set(x, "applicability", js.Array(value*))
    
    inline def setPriceComponent(value: js.Array[ChargeItemDefinitionPropertyGroupPriceComponent]): Self = StObject.set(x, "priceComponent", value.asInstanceOf[js.Any])
    
    inline def setPriceComponentUndefined: Self = StObject.set(x, "priceComponent", js.undefined)
    
    inline def setPriceComponentVarargs(value: ChargeItemDefinitionPropertyGroupPriceComponent*): Self = StObject.set(x, "priceComponent", js.Array(value*))
  }
}
