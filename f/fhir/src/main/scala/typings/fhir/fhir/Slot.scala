package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A slot of time on a schedule that may be available for booking appointments
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Slot extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'overbooked'.
    */
  var _overbooked: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The style of appointment or patient that may be booked in the slot (not service type)
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Comments on the slot to describe any extended information. Such as custom constraints on the slot
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Date/Time that the slot is to conclude
    */
  var end: instant = js.native
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * This slot has already been overbooked, appointments are unlikely to be accepted for this time
    */
  var overbooked: js.UndefOr[Boolean] = js.native
  /**
    * The schedule resource that this slot defines an interval of status information
    */
  var schedule: Reference = js.native
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Date/Time that the slot is to begin
    */
  var start: instant = js.native
  /**
    * busy | free | busy-unavailable | busy-tentative | entered-in-error
    */
  var status: code = js.native
}

object Slot {
  @scala.inline
  def apply(end: instant, schedule: Reference, start: instant, status: code): Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
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
    def setEnd(value: instant): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: Reference): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: instant): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    @scala.inline
    def set_overbooked(value: Element): Self = this.set("_overbooked", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_overbooked: Self = this.set("_overbooked", js.undefined)
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAppointmentType(value: CodeableConcept): Self = this.set("appointmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentType: Self = this.set("appointmentType", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setOverbooked(value: Boolean): Self = this.set("overbooked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverbooked: Self = this.set("overbooked", js.undefined)
    @scala.inline
    def setServiceCategory(value: CodeableConcept): Self = this.set("serviceCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCategory: Self = this.set("serviceCategory", js.undefined)
    @scala.inline
    def setServiceTypeVarargs(value: CodeableConcept*): Self = this.set("serviceType", js.Array(value :_*))
    @scala.inline
    def setServiceType(value: js.Array[CodeableConcept]): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = this.set("specialty", js.Array(value :_*))
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = this.set("specialty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialty: Self = this.set("specialty", js.undefined)
  }
  
}

