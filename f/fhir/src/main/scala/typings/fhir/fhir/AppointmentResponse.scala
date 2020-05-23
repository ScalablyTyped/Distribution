package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait AppointmentResponse extends DomainResource {
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
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_participantStatus != null) __obj.updateDynamic("_participantStatus")(_participantStatus.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (participantType != null) __obj.updateDynamic("participantType")(participantType.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResponse]
  }
}

