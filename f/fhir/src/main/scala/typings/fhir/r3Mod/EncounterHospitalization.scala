package typings.fhir.r3Mod

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
    * Location to which the patient is discharged.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example a patient may request both a dairy-free and nut-free diet preference (not mutually exclusive).
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    * Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
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
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDietPreference(value: js.Array[CodeableConcept]): Self = StObject.set(x, "dietPreference", value.asInstanceOf[js.Any])
    
    inline def setDietPreferenceUndefined: Self = StObject.set(x, "dietPreference", js.undefined)
    
    inline def setDietPreferenceVarargs(value: CodeableConcept*): Self = StObject.set(x, "dietPreference", js.Array(value*))
    
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
