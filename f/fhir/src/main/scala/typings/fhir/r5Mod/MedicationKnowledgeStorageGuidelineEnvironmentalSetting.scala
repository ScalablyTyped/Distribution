package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeStorageGuidelineEnvironmentalSetting
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies the category or type of setting (e.g., type of location, temperature, humidity).
    */
  var `type`: CodeableConcept
  
  /**
    * Value associated to the setting. E.g., 40° – 50°F for temperature.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Value associated to the setting. E.g., 40° – 50°F for temperature.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Value associated to the setting. E.g., 40° – 50°F for temperature.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}
object MedicationKnowledgeStorageGuidelineEnvironmentalSetting {
  
  inline def apply(`type`: CodeableConcept): MedicationKnowledgeStorageGuidelineEnvironmentalSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeStorageGuidelineEnvironmentalSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeStorageGuidelineEnvironmentalSetting] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
