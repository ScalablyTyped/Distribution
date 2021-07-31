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
  
  @scala.inline
  def apply(): CareTeamParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeamParticipant]
  }
  
  @scala.inline
  implicit class CareTeamParticipantMutableBuilder[Self <: CareTeamParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMember(value: Reference): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
