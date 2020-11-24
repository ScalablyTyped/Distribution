package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dispensing a medication to a named patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationDispense extends DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'whenHandedOver'.
    */
  var _whenHandedOver: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'whenPrepared'.
    */
  var _whenPrepared: js.UndefOr[Element] = js.native
  
  /**
    * Medication order that authorizes the dispense
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Type of medication dispense
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Amount of medication expressed as a timing amount
    */
  var daysSupply: js.UndefOr[Quantity] = js.native
  
  /**
    * Where the medication was sent
    */
  var destination: js.UndefOr[Reference] = js.native
  
  /**
    * Clinical issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * How the medication is to be used by the patient or administered by the caregiver
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.native
  
  /**
    * A list of releveant lifecycle events
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * What medication was supplied
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What medication was supplied
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  
  /**
    * Whether the dispense was or was not performed
    */
  var notDone: js.UndefOr[Boolean] = js.native
  
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * Information about the dispense
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Event that dispense is part of
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who performed event
    */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.native
  
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Who collected the medication
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * preparation | in-progress | on-hold | completed | entered-in-error | stopped
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Who the dispense is for
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * Whether a substitution was performed on the dispense
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.native
  
  /**
    * Information that supports the dispensing of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Trial fill, partial fill, emergency fill, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * When product was given out
    */
  var whenHandedOver: js.UndefOr[dateTime] = js.native
  
  /**
    * When product was packaged and reviewed
    */
  var whenPrepared: js.UndefOr[dateTime] = js.native
}
object MedicationDispense {
  
  @scala.inline
  def apply(): MedicationDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationDispense]
  }
  
  @scala.inline
  implicit class MedicationDispenseOps[Self <: MedicationDispense] (val x: Self) extends AnyVal {
    
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
    def set_notDone(value: Element): Self = this.set("_notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_notDone: Self = this.set("_notDone", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_whenHandedOver(value: Element): Self = this.set("_whenHandedOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_whenHandedOver: Self = this.set("_whenHandedOver", js.undefined)
    
    @scala.inline
    def set_whenPrepared(value: Element): Self = this.set("_whenPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_whenPrepared: Self = this.set("_whenPrepared", js.undefined)
    
    @scala.inline
    def setAuthorizingPrescriptionVarargs(value: Reference*): Self = this.set("authorizingPrescription", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizingPrescription(value: js.Array[Reference]): Self = this.set("authorizingPrescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizingPrescription: Self = this.set("authorizingPrescription", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDaysSupply(value: Quantity): Self = this.set("daysSupply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysSupply: Self = this.set("daysSupply", js.undefined)
    
    @scala.inline
    def setDestination(value: Reference): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDetectedIssueVarargs(value: Reference*): Self = this.set("detectedIssue", js.Array(value :_*))
    
    @scala.inline
    def setDetectedIssue(value: js.Array[Reference]): Self = this.set("detectedIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedIssue: Self = this.set("detectedIssue", js.undefined)
    
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
    def setNotDone(value: Boolean): Self = this.set("notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotDone: Self = this.set("notDone", js.undefined)
    
    @scala.inline
    def setNotDoneReasonCodeableConcept(value: CodeableConcept): Self = this.set("notDoneReasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotDoneReasonCodeableConcept: Self = this.set("notDoneReasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setNotDoneReasonReference(value: Reference): Self = this.set("notDoneReasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotDoneReasonReference: Self = this.set("notDoneReasonReference", js.undefined)
    
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
    def setPerformerVarargs(value: MedicationDispensePerformer*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[MedicationDispensePerformer]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReceiverVarargs(value: Reference*): Self = this.set("receiver", js.Array(value :_*))
    
    @scala.inline
    def setReceiver(value: js.Array[Reference]): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubstitution(value: MedicationDispenseSubstitution): Self = this.set("substitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitution: Self = this.set("substitution", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = this.set("supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = this.set("supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingInformation: Self = this.set("supportingInformation", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWhenHandedOver(value: dateTime): Self = this.set("whenHandedOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenHandedOver: Self = this.set("whenHandedOver", js.undefined)
    
    @scala.inline
    def setWhenPrepared(value: dateTime): Self = this.set("whenPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenPrepared: Self = this.set("whenPrepared", js.undefined)
  }
}
