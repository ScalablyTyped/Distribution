package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dispensing a medication to a named patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationDispense extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whenHandedOver'.
    */
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whenPrepared'.
    */
  var _whenPrepared: js.UndefOr[Element] = js.undefined
  /**
    * Medication order that authorizes the dispense
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type of medication dispense
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Amount of medication expressed as a timing amount
    */
  var daysSupply: js.UndefOr[Quantity] = js.undefined
  /**
    * Where the medication was sent
    */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
    * Clinical issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * How the medication is to be used by the patient or administered by the caregiver
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  /**
    * A list of releveant lifecycle events
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * What medication was supplied
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What medication was supplied
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  /**
    * Whether the dispense was or was not performed
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * Information about the dispense
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Event that dispense is part of
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who performed event
    */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.undefined
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Who collected the medication
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * preparation | in-progress | on-hold | completed | entered-in-error | stopped
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Who the dispense is for
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Whether a substitution was performed on the dispense
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.undefined
  /**
    * Information that supports the dispensing of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Trial fill, partial fill, emergency fill, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When product was given out
    */
  var whenHandedOver: js.UndefOr[dateTime] = js.undefined
  /**
    * When product was packaged and reviewed
    */
  var whenPrepared: js.UndefOr[dateTime] = js.undefined
}

object MedicationDispense {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _whenHandedOver: Element = null,
    _whenPrepared: Element = null,
    authorizingPrescription: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    daysSupply: Quantity = null,
    destination: Reference = null,
    detectedIssue: js.Array[Reference] = null,
    dosageInstruction: js.Array[Dosage] = null,
    eventHistory: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReasonCodeableConcept: CodeableConcept = null,
    notDoneReasonReference: Reference = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    performer: js.Array[MedicationDispensePerformer] = null,
    quantity: Quantity = null,
    receiver: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    substitution: MedicationDispenseSubstitution = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    whenHandedOver: dateTime = null,
    whenPrepared: dateTime = null
  ): MedicationDispense = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_whenHandedOver != null) __obj.updateDynamic("_whenHandedOver")(_whenHandedOver.asInstanceOf[js.Any])
    if (_whenPrepared != null) __obj.updateDynamic("_whenPrepared")(_whenPrepared.asInstanceOf[js.Any])
    if (authorizingPrescription != null) __obj.updateDynamic("authorizingPrescription")(authorizingPrescription.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (daysSupply != null) __obj.updateDynamic("daysSupply")(daysSupply.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detectedIssue != null) __obj.updateDynamic("detectedIssue")(detectedIssue.asInstanceOf[js.Any])
    if (dosageInstruction != null) __obj.updateDynamic("dosageInstruction")(dosageInstruction.asInstanceOf[js.Any])
    if (eventHistory != null) __obj.updateDynamic("eventHistory")(eventHistory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.asInstanceOf[js.Any])
    if (notDoneReasonCodeableConcept != null) __obj.updateDynamic("notDoneReasonCodeableConcept")(notDoneReasonCodeableConcept.asInstanceOf[js.Any])
    if (notDoneReasonReference != null) __obj.updateDynamic("notDoneReasonReference")(notDoneReasonReference.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (substitution != null) __obj.updateDynamic("substitution")(substitution.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (whenHandedOver != null) __obj.updateDynamic("whenHandedOver")(whenHandedOver.asInstanceOf[js.Any])
    if (whenPrepared != null) __obj.updateDynamic("whenPrepared")(whenPrepared.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispense]
  }
}

