package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Members of the team
  */
trait CareTeamParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Who is involved
    */
  var member: js.UndefOr[Reference] = js.undefined
  
  /**
    * Organization of the practitioner
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time period of participant
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Type of involvement
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object CareTeamParticipant {
  
  inline def apply(): CareTeamParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeamParticipant]
  }
  
  extension [Self <: CareTeamParticipant](x: Self) {
    
    inline def setMember(value: Reference): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
