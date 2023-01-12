package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic
  extends StObject
     with BackboneElement {
  
  /**
    * The categorization of the specific characteristic that is relevant to the administration guideline (e.g. height, weight, gender).
    */
  var `type`: CodeableConcept
  
  /**
    * The specific characteristic (e.g. height, weight, gender, etc.).
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific characteristic (e.g. height, weight, gender, etc.).
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The specific characteristic (e.g. height, weight, gender, etc.).
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}
object MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic {
  
  inline def apply(`type`: CodeableConcept): MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
