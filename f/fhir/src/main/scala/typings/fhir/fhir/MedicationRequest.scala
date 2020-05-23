package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ordering of medication for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationRequest extends DomainResource {
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
  @scala.inline
  def apply(
    intent: code,
    subject: Reference,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    detectedIssue: js.Array[Reference] = null,
    dispenseRequest: MedicationRequestDispenseRequest = null,
    dosageInstruction: js.Array[Dosage] = null,
    eventHistory: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    priorPrescription: Reference = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    recorder: Reference = null,
    requester: MedicationRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    substitution: MedicationRequestSubstitution = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): MedicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (detectedIssue != null) __obj.updateDynamic("detectedIssue")(detectedIssue.asInstanceOf[js.Any])
    if (dispenseRequest != null) __obj.updateDynamic("dispenseRequest")(dispenseRequest.asInstanceOf[js.Any])
    if (dosageInstruction != null) __obj.updateDynamic("dosageInstruction")(dosageInstruction.asInstanceOf[js.Any])
    if (eventHistory != null) __obj.updateDynamic("eventHistory")(eventHistory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (priorPrescription != null) __obj.updateDynamic("priorPrescription")(priorPrescription.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (substitution != null) __obj.updateDynamic("substitution")(substitution.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequest]
  }
}

