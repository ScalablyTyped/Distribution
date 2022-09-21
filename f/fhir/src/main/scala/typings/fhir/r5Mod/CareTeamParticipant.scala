package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CareTeamParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * This is populated while creating / managing the CareTeam to ensure there is coverage when servicing CarePlan activities from the Schedule.
    */
  var coveragePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This is populated while creating / managing the CareTeam to ensure there is coverage when servicing CarePlan activities from the Schedule.
    */
  var coverageTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Patient only needs to be listed if they have a role other than "subject of care".
    * Member is optional because some participants may be known only by their role, particularly in draft plans.
    */
  var member: js.UndefOr[Reference] = js.undefined
  
  /**
    * The organization of the practitioner.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Roles may sometimes be inferred by type of Practitioner.  These are relationships that hold only within the context of the care team.  General relationships should be handled as properties of the Patient resource directly.  If a participant has multiple roles within the team, then there should be multiple participants.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object CareTeamParticipant {
  
  inline def apply(): CareTeamParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeamParticipant]
  }
  
  extension [Self <: CareTeamParticipant](x: Self) {
    
    inline def setCoveragePeriod(value: Period): Self = StObject.set(x, "coveragePeriod", value.asInstanceOf[js.Any])
    
    inline def setCoveragePeriodUndefined: Self = StObject.set(x, "coveragePeriod", js.undefined)
    
    inline def setCoverageTiming(value: Timing): Self = StObject.set(x, "coverageTiming", value.asInstanceOf[js.Any])
    
    inline def setCoverageTimingUndefined: Self = StObject.set(x, "coverageTiming", js.undefined)
    
    inline def setMember(value: Reference): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
