package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait AppointmentResponse
  extends StObject
     with DomainResource {
  
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
  
  inline def apply(appointment: Reference, participantStatus: code): AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResponse]
  }
  
  extension [Self <: AppointmentResponse](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAppointment(value: Reference): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEnd(value: instant): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setParticipantStatus(value: code): Self = StObject.set(x, "participantStatus", value.asInstanceOf[js.Any])
    
    inline def setParticipantType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "participantType", value.asInstanceOf[js.Any])
    
    inline def setParticipantTypeUndefined: Self = StObject.set(x, "participantType", js.undefined)
    
    inline def setParticipantTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "participantType", js.Array(value :_*))
    
    inline def setStart(value: instant): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
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
