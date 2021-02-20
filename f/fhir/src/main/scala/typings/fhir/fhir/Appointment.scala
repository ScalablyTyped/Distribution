package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class AppointmentMutableBuilder[Self <: Appointment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentType(value: CodeableConcept): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentTypeUndefined: Self = StObject.set(x, "appointmentType", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnd(value: instant): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIncomingReferral(value: js.Array[Reference]): Self = StObject.set(x, "incomingReferral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingReferralUndefined: Self = StObject.set(x, "incomingReferral", js.undefined)
    
    @scala.inline
    def setIncomingReferralVarargs(value: Reference*): Self = StObject.set(x, "incomingReferral", js.Array(value :_*))
    
    @scala.inline
    def setIndication(value: js.Array[Reference]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    @scala.inline
    def setIndicationVarargs(value: Reference*): Self = StObject.set(x, "indication", js.Array(value :_*))
    
    @scala.inline
    def setMinutesDuration(value: positiveInt): Self = StObject.set(x, "minutesDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesDurationUndefined: Self = StObject.set(x, "minutesDuration", js.undefined)
    
    @scala.inline
    def setParticipant(value: js.Array[AppointmentParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantVarargs(value: AppointmentParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: unsignedInt): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    @scala.inline
    def setRequestedPeriod(value: js.Array[Period]): Self = StObject.set(x, "requestedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPeriodUndefined: Self = StObject.set(x, "requestedPeriod", js.undefined)
    
    @scala.inline
    def setRequestedPeriodVarargs(value: Period*): Self = StObject.set(x, "requestedPeriod", js.Array(value :_*))
    
    @scala.inline
    def setServiceCategory(value: CodeableConcept): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    @scala.inline
    def setServiceType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    @scala.inline
    def setServiceTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceType", js.Array(value :_*))
    
    @scala.inline
    def setSlot(value: js.Array[Reference]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSlotVarargs(value: Reference*): Self = StObject.set(x, "slot", js.Array(value :_*))
    
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: instant): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    @scala.inline
    def set_minutesDuration(value: Element): Self = StObject.set(x, "_minutesDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_minutesDurationUndefined: Self = StObject.set(x, "_minutesDuration", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
