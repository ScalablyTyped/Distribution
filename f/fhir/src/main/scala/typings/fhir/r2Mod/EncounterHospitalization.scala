package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterHospitalization
  extends StObject
     with BackboneElement {
  
  /**
    * From where patient was admitted (physician referral, transfer).
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter.
    */
  var admittingDiagnosis: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Location to which the patient is discharged.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Used to track patient's diet restrictions and/or preference. For a complete description of the nutrition needs of a patient during their stay, one should use the nutritionOrder resource which links to Encounter.
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The final diagnosis given a patient before release from the hospital after all testing, surgery, and workup are complete.
    */
  var dischargeDiagnosis: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Category or kind of location after discharge.
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location from which the patient came before admission.
    */
  var origin: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pre-admission identifier.
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Whether this hospitalization is a readmission and why if known.
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Wheelchair, translator, stretcher, etc.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Special courtesies (VIP, board member).
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterHospitalization {
  
  inline def apply(): EncounterHospitalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterHospitalization]
  }
  
  extension [Self <: EncounterHospitalization](x: Self) {
    
    inline def setAdmitSource(value: CodeableConcept): Self = StObject.set(x, "admitSource", value.asInstanceOf[js.Any])
    
    inline def setAdmitSourceUndefined: Self = StObject.set(x, "admitSource", js.undefined)
    
    inline def setAdmittingDiagnosis(value: js.Array[Reference]): Self = StObject.set(x, "admittingDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setAdmittingDiagnosisUndefined: Self = StObject.set(x, "admittingDiagnosis", js.undefined)
    
    inline def setAdmittingDiagnosisVarargs(value: Reference*): Self = StObject.set(x, "admittingDiagnosis", js.Array(value*))
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDietPreference(value: js.Array[CodeableConcept]): Self = StObject.set(x, "dietPreference", value.asInstanceOf[js.Any])
    
    inline def setDietPreferenceUndefined: Self = StObject.set(x, "dietPreference", js.undefined)
    
    inline def setDietPreferenceVarargs(value: CodeableConcept*): Self = StObject.set(x, "dietPreference", js.Array(value*))
    
    inline def setDischargeDiagnosis(value: js.Array[Reference]): Self = StObject.set(x, "dischargeDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setDischargeDiagnosisUndefined: Self = StObject.set(x, "dischargeDiagnosis", js.undefined)
    
    inline def setDischargeDiagnosisVarargs(value: Reference*): Self = StObject.set(x, "dischargeDiagnosis", js.Array(value*))
    
    inline def setDischargeDisposition(value: CodeableConcept): Self = StObject.set(x, "dischargeDisposition", value.asInstanceOf[js.Any])
    
    inline def setDischargeDispositionUndefined: Self = StObject.set(x, "dischargeDisposition", js.undefined)
    
    inline def setOrigin(value: Reference): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPreAdmissionIdentifier(value: Identifier): Self = StObject.set(x, "preAdmissionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPreAdmissionIdentifierUndefined: Self = StObject.set(x, "preAdmissionIdentifier", js.undefined)
    
    inline def setReAdmission(value: CodeableConcept): Self = StObject.set(x, "reAdmission", value.asInstanceOf[js.Any])
    
    inline def setReAdmissionUndefined: Self = StObject.set(x, "reAdmission", js.undefined)
    
    inline def setSpecialArrangement(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialArrangement", value.asInstanceOf[js.Any])
    
    inline def setSpecialArrangementUndefined: Self = StObject.set(x, "specialArrangement", js.undefined)
    
    inline def setSpecialArrangementVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialArrangement", js.Array(value*))
    
    inline def setSpecialCourtesy(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialCourtesy", value.asInstanceOf[js.Any])
    
    inline def setSpecialCourtesyUndefined: Self = StObject.set(x, "specialCourtesy", js.undefined)
    
    inline def setSpecialCourtesyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialCourtesy", js.Array(value*))
  }
}
