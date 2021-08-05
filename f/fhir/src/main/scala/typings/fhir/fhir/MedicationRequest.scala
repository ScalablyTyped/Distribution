package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ordering of medication for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When request was initially authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Created during encounter/admission/stay
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Clinical Issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Medication supply authorization
    */
  var dispenseRequest: js.UndefOr[MedicationRequestDispenseRequest] = js.undefined
  
  /**
    * How the medication should be taken
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * External ids for this request
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * proposal | plan | order | instance-order
    */
  var intent: code
  
  /**
    * Medication to be taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Medication to be taken
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information about the prescription
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * An order/prescription that is being replaced
    */
  var priorPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * routine | urgent | stat | asap
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Condition or Observation that supports why the prescription is being written
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Person who entered the request
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who/What requested the Request
    */
  var requester: js.UndefOr[MedicationRequestRequester] = js.undefined
  
  /**
    * active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Who or group medication request is for
    */
  var subject: Reference
  
  /**
    * Any restrictions on medication substitution
    */
  var substitution: js.UndefOr[MedicationRequestSubstitution] = js.undefined
  
  /**
    * Information to support ordering of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicationRequest {
  
  inline def apply(intent: code, subject: Reference): MedicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequest]
  }
  
  extension [Self <: MedicationRequest](x: Self) {
    
    inline def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    inline def setDetectedIssue(value: js.Array[Reference]): Self = StObject.set(x, "detectedIssue", value.asInstanceOf[js.Any])
    
    inline def setDetectedIssueUndefined: Self = StObject.set(x, "detectedIssue", js.undefined)
    
    inline def setDetectedIssueVarargs(value: Reference*): Self = StObject.set(x, "detectedIssue", js.Array(value :_*))
    
    inline def setDispenseRequest(value: MedicationRequestDispenseRequest): Self = StObject.set(x, "dispenseRequest", value.asInstanceOf[js.Any])
    
    inline def setDispenseRequestUndefined: Self = StObject.set(x, "dispenseRequest", js.undefined)
    
    inline def setDosageInstruction(value: js.Array[Dosage]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: Dosage*): Self = StObject.set(x, "dosageInstruction", js.Array(value :_*))
    
    inline def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    inline def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    inline def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value :_*))
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPriorPrescription(value: Reference): Self = StObject.set(x, "priorPrescription", value.asInstanceOf[js.Any])
    
    inline def setPriorPrescriptionUndefined: Self = StObject.set(x, "priorPrescription", js.undefined)
    
    inline def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setRequester(value: MedicationRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubstitution(value: MedicationRequestSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
