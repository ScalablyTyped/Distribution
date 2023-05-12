package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceRequestOrderDetailParameter
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * A value representing the additional detail or instructions for the order (e.g., catheter insertion, body elevation, descriptive device configuration and/or setting instructions).
    */
  var code: CodeableConcept
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * CodeableConcept values are indented to express concepts that would normally be coded - when a code is not available for a concept, CodeableConcept.text can be used. When the data is a text or not a single identifiable concept, string should be used.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ServiceRequestOrderDetailParameter {
  
  inline def apply(code: CodeableConcept): ServiceRequestOrderDetailParameter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceRequestOrderDetailParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceRequestOrderDetailParameter] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
