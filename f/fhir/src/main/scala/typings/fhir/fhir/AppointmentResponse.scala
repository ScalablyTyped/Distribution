package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait AppointmentResponse extends DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'participantStatus'.
    */
  var _participantStatus: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  
  /**
    * Person, Location/HealthcareService or Device
    */
  var actor: js.UndefOr[Reference] = js.native
  
  /**
    * Appointment this response relates to
    */
  var appointment: Reference = js.native
  
  /**
    * Additional comments
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Time from appointment, or requested new end time
    */
  var end: js.UndefOr[instant] = js.native
  
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * accepted | declined | tentative | in-process | completed | needs-action | entered-in-error
    */
  var participantStatus: code = js.native
  
  /**
    * Role of participant in the appointment
    */
  var participantType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Time from appointment, or requested new start time
    */
  var start: js.UndefOr[instant] = js.native
}
object AppointmentResponse {
  
  @scala.inline
  def apply(appointment: Reference, participantStatus: code): AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResponse]
  }
  
  @scala.inline
  implicit class AppointmentResponseOps[Self <: AppointmentResponse] (val x: Self) extends AnyVal {
    
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
    def setAppointment(value: Reference): Self = this.set("appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantStatus(value: code): Self = this.set("participantStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    
    @scala.inline
    def set_participantStatus(value: Element): Self = this.set("_participantStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_participantStatus: Self = this.set("_participantStatus", js.undefined)
    
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    
    @scala.inline
    def setActor(value: Reference): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setEnd(value: instant): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setParticipantTypeVarargs(value: CodeableConcept*): Self = this.set("participantType", js.Array(value :_*))
    
    @scala.inline
    def setParticipantType(value: js.Array[CodeableConcept]): Self = this.set("participantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantType: Self = this.set("participantType", js.undefined)
    
    @scala.inline
    def setStart(value: instant): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
