package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-process`
import typings.fhir.fhirStrings.`needs-action`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.declined
import typings.fhir.fhirStrings.tentative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _participantStatus: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * A Person, Location/HealthcareService or Device that is participating in the appointment.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Appointment that this response is replying to.
    */
  var appointment: Reference
  
  /**
    * Additional comments about the appointment.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
    */
  var participantStatus: accepted | declined | tentative | `in-process` | completed | `needs-action`
  
  /**
    * Role of participant in the appointment.
    */
  var participantType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AppointmentResponse: typings.fhir.fhirStrings.AppointmentResponse
  
  /**
    * Date/Time that the appointment is to take place, or requested new start time.
    */
  var start: js.UndefOr[String] = js.undefined
}
object AppointmentResponse {
  
  inline def apply(
    appointment: Reference,
    participantStatus: accepted | declined | tentative | `in-process` | completed | `needs-action`
  ): AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any], resourceType = "AppointmentResponse")
    __obj.asInstanceOf[AppointmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentResponse] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAppointment(value: Reference): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setParticipantStatus(value: accepted | declined | tentative | `in-process` | completed | `needs-action`): Self = StObject.set(x, "participantStatus", value.asInstanceOf[js.Any])
    
    inline def setParticipantType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "participantType", value.asInstanceOf[js.Any])
    
    inline def setParticipantTypeUndefined: Self = StObject.set(x, "participantType", js.undefined)
    
    inline def setParticipantTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "participantType", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AppointmentResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_participantStatus(value: Element): Self = StObject.set(x, "_participantStatus", value.asInstanceOf[js.Any])
    
    inline def set_participantStatusUndefined: Self = StObject.set(x, "_participantStatus", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
