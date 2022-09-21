package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * The specific person or organization who is participating/expected to participate in the care plan.
    */
  var member: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates specific responsibility of an individual within the care plan; e.g. "Primary physician", "Team coordinator", "Caregiver", etc.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object CarePlanParticipant {
  
  inline def apply(): CarePlanParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanParticipant]
  }
  
  extension [Self <: CarePlanParticipant](x: Self) {
    
    inline def setMember(value: Reference): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
