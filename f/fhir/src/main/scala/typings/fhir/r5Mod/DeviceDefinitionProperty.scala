package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionProperty
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Code that specifies the property.
    */
  var `type`: CodeableConcept
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The usage of CodeableConcept is for concepts that are normally coded but for which a code is not available - for example a device implant size that is not standardized. The property string is for text characteristics, e.g. long descriptions, warnings, etc.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object DeviceDefinitionProperty {
  
  inline def apply(`type`: CodeableConcept): DeviceDefinitionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
