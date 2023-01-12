package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`information-only`
import typings.fhir.fhirStrings.`needs-action`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.declined
import typings.fhir.fhirStrings.optional
import typings.fhir.fhirStrings.required
import typings.fhir.fhirStrings.tentative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentParticipant
  extends StObject
     with BackboneElement {
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A Person, Location/HealthcareService or Device that is participating in the appointment.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
    */
  var required: js.UndefOr[typings.fhir.fhirStrings.required | optional | `information-only`] = js.undefined
  
  /**
    * Participation status of the actor.
    */
  var status: accepted | declined | tentative | `needs-action`
  
  /**
    * The role of the participant can be used to declare what the actor will be doing in the scope of this appointment.
    * If the actor is not specified, then it is expected that the actor will be filled in at a later stage of planning.
    * This value SHALL be the same when creating an AppointmentResponse so that they can be matched, and subsequently update the Appointment.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AppointmentParticipant {
  
  inline def apply(status: accepted | declined | tentative | `needs-action`): AppointmentParticipant = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentParticipant] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setRequired(value: required | optional | `information-only`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStatus(value: accepted | declined | tentative | `needs-action`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
