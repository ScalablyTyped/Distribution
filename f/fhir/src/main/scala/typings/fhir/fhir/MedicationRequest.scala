package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ordering of medication for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * When request was initially authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Created during encounter/admission/stay
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Clinical Issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Medication supply authorization
    */
  var dispenseRequest: js.UndefOr[MedicationRequestDispenseRequest] = js.native
  /**
    * How the medication should be taken
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.native
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * External ids for this request
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * proposal | plan | order | instance-order
    */
  var intent: code = js.native
  /**
    * Medication to be taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Medication to be taken
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * Information about the prescription
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * An order/prescription that is being replaced
    */
  var priorPrescription: js.UndefOr[Reference] = js.native
  /**
    * routine | urgent | stat | asap
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition or Observation that supports why the prescription is being written
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Person who entered the request
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * Who/What requested the Request
    */
  var requester: js.UndefOr[MedicationRequestRequester] = js.native
  /**
    * active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Who or group medication request is for
    */
  var subject: Reference = js.native
  /**
    * Any restrictions on medication substitution
    */
  var substitution: js.UndefOr[MedicationRequestSubstitution] = js.native
  /**
    * Information to support ordering of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object MedicationRequest {
  @scala.inline
  def apply(intent: code, subject: Reference): MedicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequest]
  }
  @scala.inline
  implicit class MedicationRequestOps[Self <: MedicationRequest] (val x: Self) extends AnyVal {
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
    def setIntent(value: code): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    @scala.inline
    def set_intent(value: Element): Self = this.set("_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_intent: Self = this.set("_intent", js.undefined)
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = this.set("authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthoredOn: Self = this.set("authoredOn", js.undefined)
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
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
    def setDetectedIssueVarargs(value: Reference*): Self = this.set("detectedIssue", js.Array(value :_*))
    @scala.inline
    def setDetectedIssue(value: js.Array[Reference]): Self = this.set("detectedIssue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedIssue: Self = this.set("detectedIssue", js.undefined)
    @scala.inline
    def setDispenseRequest(value: MedicationRequestDispenseRequest): Self = this.set("dispenseRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispenseRequest: Self = this.set("dispenseRequest", js.undefined)
    @scala.inline
    def setDosageInstructionVarargs(value: Dosage*): Self = this.set("dosageInstruction", js.Array(value :_*))
    @scala.inline
    def setDosageInstruction(value: js.Array[Dosage]): Self = this.set("dosageInstruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDosageInstruction: Self = this.set("dosageInstruction", js.undefined)
    @scala.inline
    def setEventHistoryVarargs(value: Reference*): Self = this.set("eventHistory", js.Array(value :_*))
    @scala.inline
    def setEventHistory(value: js.Array[Reference]): Self = this.set("eventHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventHistory: Self = this.set("eventHistory", js.undefined)
    @scala.inline
    def setGroupIdentifier(value: Identifier): Self = this.set("groupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIdentifier: Self = this.set("groupIdentifier", js.undefined)
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
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setPriorPrescription(value: Reference): Self = this.set("priorPrescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriorPrescription: Self = this.set("priorPrescription", js.undefined)
    @scala.inline
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    @scala.inline
    def setRecorder(value: Reference): Self = this.set("recorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecorder: Self = this.set("recorder", js.undefined)
    @scala.inline
    def setRequester(value: MedicationRequestRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubstitution(value: MedicationRequestSubstitution): Self = this.set("substitution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitution: Self = this.set("substitution", js.undefined)
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = this.set("supportingInformation", js.Array(value :_*))
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = this.set("supportingInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportingInformation: Self = this.set("supportingInformation", js.undefined)
  }
  
}

