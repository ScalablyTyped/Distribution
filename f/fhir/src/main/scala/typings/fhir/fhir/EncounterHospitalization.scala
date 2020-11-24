package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the admission to a healthcare service
  */
@js.native
trait EncounterHospitalization extends BackboneElement {
  
  /**
    * From where patient was admitted (physician referral, transfer)
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Location to which the patient is discharged
    */
  var destination: js.UndefOr[Reference] = js.native
  
  /**
    * Diet preferences reported by the patient
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Category or kind of location after discharge
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The location from which the patient came before admission
    */
  var origin: js.UndefOr[Reference] = js.native
  
  /**
    * Pre-admission identifier
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Wheelchair, translator, stretcher, etc.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Special courtesies (VIP, board member)
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object EncounterHospitalization {
  
  @scala.inline
  def apply(): EncounterHospitalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterHospitalization]
  }
  
  @scala.inline
  implicit class EncounterHospitalizationOps[Self <: EncounterHospitalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdmitSource(value: CodeableConcept): Self = this.set("admitSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmitSource: Self = this.set("admitSource", js.undefined)
    
    @scala.inline
    def setDestination(value: Reference): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDietPreferenceVarargs(value: CodeableConcept*): Self = this.set("dietPreference", js.Array(value :_*))
    
    @scala.inline
    def setDietPreference(value: js.Array[CodeableConcept]): Self = this.set("dietPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDietPreference: Self = this.set("dietPreference", js.undefined)
    
    @scala.inline
    def setDischargeDisposition(value: CodeableConcept): Self = this.set("dischargeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDischargeDisposition: Self = this.set("dischargeDisposition", js.undefined)
    
    @scala.inline
    def setOrigin(value: Reference): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPreAdmissionIdentifier(value: Identifier): Self = this.set("preAdmissionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreAdmissionIdentifier: Self = this.set("preAdmissionIdentifier", js.undefined)
    
    @scala.inline
    def setReAdmission(value: CodeableConcept): Self = this.set("reAdmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReAdmission: Self = this.set("reAdmission", js.undefined)
    
    @scala.inline
    def setSpecialArrangementVarargs(value: CodeableConcept*): Self = this.set("specialArrangement", js.Array(value :_*))
    
    @scala.inline
    def setSpecialArrangement(value: js.Array[CodeableConcept]): Self = this.set("specialArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialArrangement: Self = this.set("specialArrangement", js.undefined)
    
    @scala.inline
    def setSpecialCourtesyVarargs(value: CodeableConcept*): Self = this.set("specialCourtesy", js.Array(value :_*))
    
    @scala.inline
    def setSpecialCourtesy(value: js.Array[CodeableConcept]): Self = this.set("specialCourtesy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialCourtesy: Self = this.set("specialCourtesy", js.undefined)
  }
}
