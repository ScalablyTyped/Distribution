package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Participants involved in appointment
  */
@js.native
trait AppointmentParticipant extends BackboneElement {
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Person, Location/HealthcareService or Device
    */
  var actor: js.UndefOr[Reference] = js.native
  /**
    * required | optional | information-only
    */
  var required: js.UndefOr[code] = js.native
  /**
    * accepted | declined | tentative | needs-action
    */
  var status: code = js.native
  /**
    * Role of participant in the appointment
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object AppointmentParticipant {
  @scala.inline
  def apply(status: code): AppointmentParticipant = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentParticipant]
  }
  @scala.inline
  implicit class AppointmentParticipantOps[Self <: AppointmentParticipant] (val x: Self) extends AnyVal {
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_required(value: Element): Self = this.set("_required", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_required: Self = this.set("_required", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setActor(value: Reference): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setRequired(value: code): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

