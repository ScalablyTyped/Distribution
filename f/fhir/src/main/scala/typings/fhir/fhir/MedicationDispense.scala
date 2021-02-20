package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class MedicationDispenseMutableBuilder[Self <: MedicationDispense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizingPrescription(value: js.Array[Reference]): Self = StObject.set(x, "authorizingPrescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizingPrescriptionUndefined: Self = StObject.set(x, "authorizingPrescription", js.undefined)
    
    @scala.inline
    def setAuthorizingPrescriptionVarargs(value: Reference*): Self = StObject.set(x, "authorizingPrescription", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDaysSupply(value: Quantity): Self = StObject.set(x, "daysSupply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysSupplyUndefined: Self = StObject.set(x, "daysSupply", js.undefined)
    
    @scala.inline
    def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDetectedIssue(value: js.Array[Reference]): Self = StObject.set(x, "detectedIssue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedIssueUndefined: Self = StObject.set(x, "detectedIssue", js.undefined)
    
    @scala.inline
    def setDetectedIssueVarargs(value: Reference*): Self = StObject.set(x, "detectedIssue", js.Array(value :_*))
    
    @scala.inline
    def setDosageInstruction(value: js.Array[Dosage]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    @scala.inline
    def setDosageInstructionVarargs(value: Dosage*): Self = StObject.set(x, "dosageInstruction", js.Array(value :_*))
    
    @scala.inline
    def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    @scala.inline
    def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    @scala.inline
    def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    @scala.inline
    def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "notDoneReasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReasonCodeableConceptUndefined: Self = StObject.set(x, "notDoneReasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setNotDoneReasonReference(value: Reference): Self = StObject.set(x, "notDoneReasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDoneReasonReferenceUndefined: Self = StObject.set(x, "notDoneReasonReference", js.undefined)
    
    @scala.inline
    def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[MedicationDispensePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: MedicationDispensePerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    @scala.inline
    def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSubstitution(value: MedicationDispenseSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWhenHandedOver(value: dateTime): Self = StObject.set(x, "whenHandedOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenHandedOverUndefined: Self = StObject.set(x, "whenHandedOver", js.undefined)
    
    @scala.inline
    def setWhenPrepared(value: dateTime): Self = StObject.set(x, "whenPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenPreparedUndefined: Self = StObject.set(x, "whenPrepared", js.undefined)
    
    @scala.inline
    def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_whenHandedOver(value: Element): Self = StObject.set(x, "_whenHandedOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_whenHandedOverUndefined: Self = StObject.set(x, "_whenHandedOver", js.undefined)
    
    @scala.inline
    def set_whenPrepared(value: Element): Self = StObject.set(x, "_whenPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_whenPreparedUndefined: Self = StObject.set(x, "_whenPrepared", js.undefined)
  }
}
