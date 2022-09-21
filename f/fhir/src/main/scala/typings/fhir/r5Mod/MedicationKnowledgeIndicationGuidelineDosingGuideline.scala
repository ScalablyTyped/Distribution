package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeIndicationGuidelineDosingGuideline
  extends StObject
     with BackboneElement {
  
  /**
    * The type of the treatment that the guideline applies to, for example, long term therapy, first line treatment, etc.
    */
  var administrationTreatment: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Dosage for the medication for the specific guidelines.
    */
  var dosage: js.UndefOr[js.Array[MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage]] = js.undefined
  
  /**
    * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
    */
  var patientCharacteristic: js.UndefOr[
    js.Array[MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic]
  ] = js.undefined
  
  /**
    * The overall intention of the treatment, for example, prophylactic, supporative, curative, etc.
    */
  var treatmentIntent: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationKnowledgeIndicationGuidelineDosingGuideline {
  
  inline def apply(): MedicationKnowledgeIndicationGuidelineDosingGuideline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeIndicationGuidelineDosingGuideline]
  }
  
  extension [Self <: MedicationKnowledgeIndicationGuidelineDosingGuideline](x: Self) {
    
    inline def setAdministrationTreatment(value: CodeableConcept): Self = StObject.set(x, "administrationTreatment", value.asInstanceOf[js.Any])
    
    inline def setAdministrationTreatmentUndefined: Self = StObject.set(x, "administrationTreatment", js.undefined)
    
    inline def setDosage(value: js.Array[MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setDosageVarargs(value: MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage*): Self = StObject.set(x, "dosage", js.Array(value*))
    
    inline def setPatientCharacteristic(value: js.Array[MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic]): Self = StObject.set(x, "patientCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setPatientCharacteristicUndefined: Self = StObject.set(x, "patientCharacteristic", js.undefined)
    
    inline def setPatientCharacteristicVarargs(value: MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic*): Self = StObject.set(x, "patientCharacteristic", js.Array(value*))
    
    inline def setTreatmentIntent(value: CodeableConcept): Self = StObject.set(x, "treatmentIntent", value.asInstanceOf[js.Any])
    
    inline def setTreatmentIntentUndefined: Self = StObject.set(x, "treatmentIntent", js.undefined)
  }
}
