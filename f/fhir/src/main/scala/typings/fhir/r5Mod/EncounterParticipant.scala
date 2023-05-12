package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * For planning purposes, Appointments may include a CareTeam participant to indicate that one specific person from the CareTeam will be assigned, but that assignment might not happen until the Encounter begins. Hence CareTeam is not included in Encounter.participant, as the specific individual should be assigned and represented as a Practitioner or other person resource.
    * Similarly, Location can be included in Appointment.participant to assist with planning.  However, the patient location is tracked on the Encounter in the Encounter.location property to allow for additional metadata and history to be recorded.
    * The role of the participant can be used to declare what the actor will be doing in the scope of this encounter participation.
    * If the individual is not specified during planning, then it is expected that the individual will be filled in at a later stage prior to the encounter commencing.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The participant type indicates how an individual actor participates in an encounter. It includes non-practitioner participants, and for practitioners this is to describe the action type in the context of this encounter (e.g. Admitting Dr, Attending Dr, Translator, Consulting Dr). This is different to the practitioner roles which are functional roles, derived from terms of employment, education, licensing, etc.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterParticipant {
  
  inline def apply(): EncounterParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterParticipant] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
