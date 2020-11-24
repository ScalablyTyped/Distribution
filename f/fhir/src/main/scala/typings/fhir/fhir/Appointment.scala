package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Appointment extends DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'minutesDuration'.
    */
  var _minutesDuration: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * The style of appointment or patient that has been booked in the slot (not service type)
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Additional comments
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * The date that this appointment was initially created
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * Shown on a subject line in a meeting request, or appointment list
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * When appointment is to conclude
    */
  var end: js.UndefOr[instant] = js.native
  
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * The ReferralRequest provided as information to allocate to the Encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Reason the appointment is to takes place (resource)
    */
  var indication: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Can be less than start/end (e.g. estimate)
    */
  var minutesDuration: js.UndefOr[positiveInt] = js.native
  
  /**
    * Participants involved in appointment
    */
  var participant: js.Array[AppointmentParticipant] = js.native
  
  /**
    * Used to make informed decisions if needing to re-prioritize
    */
  var priority: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Reason this appointment is scheduled
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Potential date/time interval(s) requested to allocate the appointment within
    */
  var requestedPeriod: js.UndefOr[js.Array[Period]] = js.native
  
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The specific service that is to be performed during this appointment
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * The slots that this appointment is filling
    */
  var slot: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * When appointment is to take place
    */
  var start: js.UndefOr[instant] = js.native
  
  /**
    * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Additional information to support the appointment
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}
object Appointment {
  
  @scala.inline
  def apply(participant: js.Array[AppointmentParticipant], status: code): Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appointment]
  }
  
  @scala.inline
  implicit class AppointmentOps[Self <: Appointment] (val x: Self) extends AnyVal {
    
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
    def setParticipantVarargs(value: AppointmentParticipant*): Self = this.set("participant", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[AppointmentParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    
    @scala.inline
    def set_minutesDuration(value: Element): Self = this.set("_minutesDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_minutesDuration: Self = this.set("_minutesDuration", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    
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
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
    def setIncomingReferralVarargs(value: Reference*): Self = this.set("incomingReferral", js.Array(value :_*))
    
    @scala.inline
    def setIncomingReferral(value: js.Array[Reference]): Self = this.set("incomingReferral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingReferral: Self = this.set("incomingReferral", js.undefined)
    
    @scala.inline
    def setIndicationVarargs(value: Reference*): Self = this.set("indication", js.Array(value :_*))
    
    @scala.inline
    def setIndication(value: js.Array[Reference]): Self = this.set("indication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndication: Self = this.set("indication", js.undefined)
    
    @scala.inline
    def setMinutesDuration(value: positiveInt): Self = this.set("minutesDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesDuration: Self = this.set("minutesDuration", js.undefined)
    
    @scala.inline
    def setPriority(value: unsignedInt): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRequestedPeriodVarargs(value: Period*): Self = this.set("requestedPeriod", js.Array(value :_*))
    
    @scala.inline
    def setRequestedPeriod(value: js.Array[Period]): Self = this.set("requestedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedPeriod: Self = this.set("requestedPeriod", js.undefined)
    
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
    def setSlotVarargs(value: Reference*): Self = this.set("slot", js.Array(value :_*))
    
    @scala.inline
    def setSlot(value: js.Array[Reference]): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = this.set("specialty", js.Array(value :_*))
    
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = this.set("specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialty: Self = this.set("specialty", js.undefined)
    
    @scala.inline
    def setStart(value: instant): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = this.set("supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = this.set("supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingInformation: Self = this.set("supportingInformation", js.undefined)
  }
}
