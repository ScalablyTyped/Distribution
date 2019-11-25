package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Participants involved in appointment
  */
trait AppointmentParticipant extends BackboneElement {
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Person, Location/HealthcareService or Device
    */
  var actor: js.UndefOr[Reference] = js.undefined
  /**
    * required | optional | information-only
    */
  var required: js.UndefOr[code] = js.undefined
  /**
    * accepted | declined | tentative | needs-action
    */
  var status: code
  /**
    * Role of participant in the appointment
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object AppointmentParticipant {
  @scala.inline
  def apply(
    status: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _required: Element = null,
    _status: Element = null,
    actor: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    required: code = null,
    `type`: js.Array[CodeableConcept] = null
  ): AppointmentParticipant = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_required != null) __obj.updateDynamic("_required")(_required.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentParticipant]
  }
}

