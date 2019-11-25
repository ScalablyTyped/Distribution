package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Administration of medication to a patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationAdministration extends DomainResource {
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Encounter or Episode of Care administered as part of
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Device used to administer
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Details of how medication was taken
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.undefined
  /**
    * Start and end time of administration
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Start and end time of administration
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * What was administered
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What was administered
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  /**
    * True if medication not administered
    */
  var notGiven: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the administration
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who administered substance
    */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.undefined
  /**
    * Request administration performed against
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  /**
    * Reason administration performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Reason administration not performed
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Condition or Observation that supports why the medication was administered
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * in-progress | on-hold | completed | entered-in-error | stopped | unknown
    */
  var status: code
  /**
    * Who received medication
    */
  var subject: Reference
  /**
    * Additional information to support administration
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}

object MedicationAdministration {
  @scala.inline
  def apply(
    status: code,
    subject: Reference,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notGiven: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    device: js.Array[Reference] = null,
    dosage: MedicationAdministrationDosage = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
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
    notGiven: js.UndefOr[Boolean] = js.undefined,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    performer: js.Array[MedicationAdministrationPerformer] = null,
    prescription: Reference = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonNotGiven: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): MedicationAdministration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notGiven != null) __obj.updateDynamic("_notGiven")(_notGiven.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (dosage != null) __obj.updateDynamic("dosage")(dosage.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
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
    if (!js.isUndefined(notGiven)) __obj.updateDynamic("notGiven")(notGiven.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (prescription != null) __obj.updateDynamic("prescription")(prescription.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonNotGiven != null) __obj.updateDynamic("reasonNotGiven")(reasonNotGiven.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
}

