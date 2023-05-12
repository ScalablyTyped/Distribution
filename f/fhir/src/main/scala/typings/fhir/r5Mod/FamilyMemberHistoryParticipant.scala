package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyMemberHistoryParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates who or what participated in the activities related to the family member history.
    */
  var actor: Reference
  
  /**
    * Distinguishes the type of involvement of the actor in the activities related to the family member history.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object FamilyMemberHistoryParticipant {
  
  inline def apply(actor: Reference): FamilyMemberHistoryParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FamilyMemberHistoryParticipant] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
