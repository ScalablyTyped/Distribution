package typings.fhir.r2Mod

import typings.fhir.fhirStrings.arrived
import typings.fhir.fhirStrings.booked
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.fulfilled
import typings.fhir.fhirStrings.noshow
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.proposed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appointment
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional comments about the appointment.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Date/Time that the appointment is to conclude.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
    */
  var minutesDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * List of participants involved in the appointment.
    */
  var participant: js.Array[AppointmentParticipant]
  
  /**
    * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason that this appointment is being scheduled. This is more clinical than administrative.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Appointment: typings.fhir.fhirStrings.Appointment
  
  /**
    * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot.
    */
  var slot: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Date/Time that the appointment is to take place.
    */
  var start: js.UndefOr[String] = js.undefined
  
  /**
    * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
    */
  var status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow
  
  /**
    * The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Appointment {
  
  inline def apply(
    participant: js.Array[AppointmentParticipant],
    status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow
  ): Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], resourceType = "Appointment", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appointment]
  }
  
  extension [Self <: Appointment](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMinutesDuration(value: Double): Self = StObject.set(x, "minutesDuration", value.asInstanceOf[js.Any])
    
    inline def setMinutesDurationUndefined: Self = StObject.set(x, "minutesDuration", js.undefined)
    
    inline def setParticipant(value: js.Array[AppointmentParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantVarargs(value: AppointmentParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Appointment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: js.Array[Reference]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSlotVarargs(value: Reference*): Self = StObject.set(x, "slot", js.Array(value*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStatus(value: proposed | pending | booked | arrived | fulfilled | cancelled | noshow): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
