package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareCareTeam
  extends StObject
     with BackboneElement {
  
  /**
    * The practitioner (or Organization) within the team.
    */
  var member: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period of time this practitioner is performing some role within the episode of care.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The role this team member is taking within this episode of care.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EpisodeOfCareCareTeam {
  
  inline def apply(): EpisodeOfCareCareTeam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpisodeOfCareCareTeam]
  }
  
  extension [Self <: EpisodeOfCareCareTeam](x: Self) {
    
    inline def setMember(value: Reference): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
  }
}
