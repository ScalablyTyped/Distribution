package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyRequestParameter
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * A code or string that identifies the device detail being asserted.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Range means device should have a value that falls somewhere within the specified range.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Range means device should have a value that falls somewhere within the specified range.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Range means device should have a value that falls somewhere within the specified range.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Range means device should have a value that falls somewhere within the specified range.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}
object SupplyRequestParameter {
  
  inline def apply(): SupplyRequestParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyRequestParameter]
  }
  
  extension [Self <: SupplyRequestParameter](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
