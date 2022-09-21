package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`needs-action`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.declined
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
    * Where a CareTeam is provided, this does not imply that the entire team is included, just a single member from the group with the appropriate role. Where multiple members are required, please include the CareTeam the required number of times.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Participation period of the actor.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * For the use-case where two doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present include the patient in the subject field, but do not include them as a participant - this was formerly done prior to R5 with required='information-only'.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
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
  
  extension [Self <: AppointmentParticipant](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
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
