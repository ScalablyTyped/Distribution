package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristicDefinitionByTypeAndValue
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueId: js.UndefOr[Element] = js.undefined
  
  /**
    * Device used for determining characteristic.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Method for how the characteristic value was determined.
    */
  var method: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Defines the reference point for comparison when valueQuantity or valueRange is not compared to zero.
    */
  var offset: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Used to express the type of characteristic.
    */
  var `type`: CodeableConcept
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueId: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Defines the characteristic when paired with characteristic.type.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
}
object EvidenceVariableCharacteristicDefinitionByTypeAndValue {
  
  inline def apply(`type`: CodeableConcept): EvidenceVariableCharacteristicDefinitionByTypeAndValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceVariableCharacteristicDefinitionByTypeAndValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableCharacteristicDefinitionByTypeAndValue] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setOffset(value: CodeableConcept): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueId(value: String): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    inline def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    inline def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
  }
}
