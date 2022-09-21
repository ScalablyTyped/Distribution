package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Persons involved in the encounter other than the patient.
    */
  var individual: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The participant type indicates how an individual partitipates in an encounter. It includes non-practitioner participants, and for practitioners this is to describe the action type in the context of this encounter (e.g. Admitting Dr, Attending Dr, Translator, Consulting Dr). This is different to the practitioner roles which are functional roles, derived from terms of employment, education, licensing, etc.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterParticipant {
  
  inline def apply(): EncounterParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterParticipant]
  }
  
  extension [Self <: EncounterParticipant](x: Self) {
    
    inline def setIndividual(value: Reference): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
