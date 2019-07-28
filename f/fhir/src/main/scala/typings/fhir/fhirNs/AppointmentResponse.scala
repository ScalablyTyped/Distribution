package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait AppointmentResponse extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'participantStatus'.
    */
  var _participantStatus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * Person, Location/HealthcareService or Device
    */
  var actor: js.UndefOr[Reference] = js.undefined
  /**
    * Appointment this response relates to
    */
  var appointment: Reference
  /**
    * Additional comments
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Time from appointment, or requested new end time
    */
  var end: js.UndefOr[instant] = js.undefined
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * accepted | declined | tentative | in-process | completed | needs-action | entered-in-error
    */
  var participantStatus: code
  /**
    * Role of participant in the appointment
    */
  var participantType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Time from appointment, or requested new start time
    */
  var start: js.UndefOr[instant] = js.undefined
}

object AppointmentResponse {
  @scala.inline
  def apply(
    appointment: Reference,
    participantStatus: code,
    _comment: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _participantStatus: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    actor: Reference = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    end: instant = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    participantType: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    start: instant = null,
    text: Narrative = null
  ): AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment, participantStatus = participantStatus)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_participantStatus != null) __obj.updateDynamic("_participantStatus")(_participantStatus)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (end != null) __obj.updateDynamic("end")(end)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (participantType != null) __obj.updateDynamic("participantType")(participantType)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (start != null) __obj.updateDynamic("start")(start)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[AppointmentResponse]
  }
}

