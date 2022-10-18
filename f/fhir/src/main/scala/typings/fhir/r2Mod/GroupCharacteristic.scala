package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCharacteristic
  extends StObject
     with BackboneElement {
  
  var _exclude: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Need a formal way of identifying the characteristic being described.
    */
  var code: CodeableConcept
  
  /**
    * Sometimes group membership is determined by characteristics not possessed.
    */
  var exclude: Boolean
  
  /**
    * The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The value of the characteristic is what determines group membership.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the characteristic is what determines group membership.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The value of the characteristic is what determines group membership.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value of the characteristic is what determines group membership.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}
object GroupCharacteristic {
  
  inline def apply(code: CodeableConcept, exclude: Boolean): GroupCharacteristic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCharacteristic]
  }
  
  extension [Self <: GroupCharacteristic](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
