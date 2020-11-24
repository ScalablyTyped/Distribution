package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Administration of medication to a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationAdministration extends DomainResource {
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Encounter or Episode of Care administered as part of
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Device used to administer
    */
  var device: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Details of how medication was taken
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.native
  
  /**
    * Start and end time of administration
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Start and end time of administration
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * What was administered
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What was administered
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  
  /**
    * True if medication not administered
    */
  var notGiven: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the administration
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who administered substance
    */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.native
  
  /**
    * Request administration performed against
    */
  var prescription: js.UndefOr[Reference] = js.native
  
  /**
    * Reason administration performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Reason administration not performed
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Condition or Observation that supports why the medication was administered
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * in-progress | on-hold | completed | entered-in-error | stopped | unknown
    */
  var status: code = js.native
  
  /**
    * Who received medication
    */
  var subject: Reference = js.native
  
  /**
    * Additional information to support administration
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}
object MedicationAdministration {
  
  @scala.inline
  def apply(status: code, subject: Reference): MedicationAdministration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
  
  @scala.inline
  implicit class MedicationAdministrationOps[Self <: MedicationAdministration] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = this.set("_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_effectiveDateTime: Self = this.set("_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_notGiven(value: Element): Self = this.set("_notGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_notGiven: Self = this.set("_notGiven", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = this.set("definition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDeviceVarargs(value: Reference*): Self = this.set("device", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: js.Array[Reference]): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setDosage(value: MedicationAdministrationDosage): Self = this.set("dosage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDosage: Self = this.set("dosage", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = this.set("effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDateTime: Self = this.set("effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setEventHistoryVarargs(value: Reference*): Self = this.set("eventHistory", js.Array(value :_*))
    
    @scala.inline
    def setEventHistory(value: js.Array[Reference]): Self = this.set("eventHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventHistory: Self = this.set("eventHistory", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setMedicationCodeableConcept(value: CodeableConcept): Self = this.set("medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedicationCodeableConcept: Self = this.set("medicationCodeableConcept", js.undefined)
    
    @scala.inline
    def setMedicationReference(value: Reference): Self = this.set("medicationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedicationReference: Self = this.set("medicationReference", js.undefined)
    
    @scala.inline
    def setNotGiven(value: Boolean): Self = this.set("notGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotGiven: Self = this.set("notGiven", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: MedicationAdministrationPerformer*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[MedicationAdministrationPerformer]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setPrescription(value: Reference): Self = this.set("prescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrescription: Self = this.set("prescription", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    
    @scala.inline
    def setReasonNotGivenVarargs(value: CodeableConcept*): Self = this.set("reasonNotGiven", js.Array(value :_*))
    
    @scala.inline
    def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = this.set("reasonNotGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonNotGiven: Self = this.set("reasonNotGiven", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = this.set("supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = this.set("supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingInformation: Self = this.set("supportingInformation", js.undefined)
  }
}
