package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prescription for vision correction products for a patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait VisionPrescription extends DomainResource {
  /**
    * Contains extended information for property 'dateWritten'.
    */
  var _dateWritten: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * When prescription was authorized
    */
  var dateWritten: js.UndefOr[dateTime] = js.undefined
  /**
    * Vision supply authorization
    */
  var dispense: js.UndefOr[js.Array[VisionPrescriptionDispense]] = js.undefined
  /**
    * Created during encounter / admission / stay
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Who prescription is for
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Who authorizes the vision product
    */
  var prescriber: js.UndefOr[Reference] = js.undefined
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason or indication for writing the prescription
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object VisionPrescription {
  @scala.inline
  def apply(
    _dateWritten: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    dateWritten: dateTime = null,
    dispense: js.Array[VisionPrescriptionDispense] = null,
    encounter: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    prescriber: Reference = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): VisionPrescription = {
    val __obj = js.Dynamic.literal()
    if (_dateWritten != null) __obj.updateDynamic("_dateWritten")(_dateWritten)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (dateWritten != null) __obj.updateDynamic("dateWritten")(dateWritten)
    if (dispense != null) __obj.updateDynamic("dispense")(dispense)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (prescriber != null) __obj.updateDynamic("prescriber")(prescriber)
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[VisionPrescription]
  }
}

