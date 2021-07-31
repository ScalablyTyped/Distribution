package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the admission to a healthcare service
  */
trait EncounterHospitalization
  extends StObject
     with BackboneElement {
  
  /**
    * From where patient was admitted (physician referral, transfer)
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Location to which the patient is discharged
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Diet preferences reported by the patient
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Category or kind of location after discharge
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location from which the patient came before admission
    */
  var origin: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pre-admission identifier
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Wheelchair, translator, stretcher, etc.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Special courtesies (VIP, board member)
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterHospitalization {
  
  @scala.inline
  def apply(): EncounterHospitalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterHospitalization]
  }
  
  @scala.inline
  implicit class EncounterHospitalizationMutableBuilder[Self <: EncounterHospitalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmitSource(value: CodeableConcept): Self = StObject.set(x, "admitSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdmitSourceUndefined: Self = StObject.set(x, "admitSource", js.undefined)
    
    @scala.inline
    def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDietPreference(value: js.Array[CodeableConcept]): Self = StObject.set(x, "dietPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDietPreferenceUndefined: Self = StObject.set(x, "dietPreference", js.undefined)
    
    @scala.inline
    def setDietPreferenceVarargs(value: CodeableConcept*): Self = StObject.set(x, "dietPreference", js.Array(value :_*))
    
    @scala.inline
    def setDischargeDisposition(value: CodeableConcept): Self = StObject.set(x, "dischargeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDischargeDispositionUndefined: Self = StObject.set(x, "dischargeDisposition", js.undefined)
    
    @scala.inline
    def setOrigin(value: Reference): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPreAdmissionIdentifier(value: Identifier): Self = StObject.set(x, "preAdmissionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreAdmissionIdentifierUndefined: Self = StObject.set(x, "preAdmissionIdentifier", js.undefined)
    
    @scala.inline
    def setReAdmission(value: CodeableConcept): Self = StObject.set(x, "reAdmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReAdmissionUndefined: Self = StObject.set(x, "reAdmission", js.undefined)
    
    @scala.inline
    def setSpecialArrangement(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialArrangementUndefined: Self = StObject.set(x, "specialArrangement", js.undefined)
    
    @scala.inline
    def setSpecialArrangementVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialArrangement", js.Array(value :_*))
    
    @scala.inline
    def setSpecialCourtesy(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialCourtesy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialCourtesyUndefined: Self = StObject.set(x, "specialCourtesy", js.undefined)
    
    @scala.inline
    def setSpecialCourtesyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialCourtesy", js.Array(value :_*))
  }
}
