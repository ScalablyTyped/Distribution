package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who performed charged service
  */
trait ChargeItemParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Individual who was performing
    */
  var actor: Reference
  
  /**
    * What type of performance was done
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ChargeItemParticipant {
  
  @scala.inline
  def apply(actor: Reference): ChargeItemParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItemParticipant]
  }
  
  @scala.inline
  implicit class ChargeItemParticipantMutableBuilder[Self <: ChargeItemParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
