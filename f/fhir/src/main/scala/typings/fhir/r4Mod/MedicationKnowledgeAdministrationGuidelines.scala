package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeAdministrationGuidelines
  extends StObject
     with BackboneElement {
  
  /**
    * Dosage for the medication for the specific guidelines.
    */
  var dosage: js.UndefOr[js.Array[MedicationKnowledgeAdministrationGuidelinesDosage]] = js.undefined
  
  /**
    * Indication for use that apply to the specific administration guidelines.
    */
  var indicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indication for use that apply to the specific administration guidelines.
    */
  var indicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
    */
  var patientCharacteristics: js.UndefOr[js.Array[MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics]] = js.undefined
}
object MedicationKnowledgeAdministrationGuidelines {
  
  inline def apply(): MedicationKnowledgeAdministrationGuidelines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeAdministrationGuidelines]
  }
  
  extension [Self <: MedicationKnowledgeAdministrationGuidelines](x: Self) {
    
    inline def setDosage(value: js.Array[MedicationKnowledgeAdministrationGuidelinesDosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setDosageVarargs(value: MedicationKnowledgeAdministrationGuidelinesDosage*): Self = StObject.set(x, "dosage", js.Array(value*))
    
    inline def setIndicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "indicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setIndicationCodeableConceptUndefined: Self = StObject.set(x, "indicationCodeableConcept", js.undefined)
    
    inline def setIndicationReference(value: Reference): Self = StObject.set(x, "indicationReference", value.asInstanceOf[js.Any])
    
    inline def setIndicationReferenceUndefined: Self = StObject.set(x, "indicationReference", js.undefined)
    
    inline def setPatientCharacteristics(value: js.Array[MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics]): Self = StObject.set(x, "patientCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setPatientCharacteristicsUndefined: Self = StObject.set(x, "patientCharacteristics", js.undefined)
    
    inline def setPatientCharacteristicsVarargs(value: MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics*): Self = StObject.set(x, "patientCharacteristics", js.Array(value*))
  }
}
