package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeItemParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed or participated in the service.
    */
  var actor: Reference
  
  /**
    * Describes the type of performance or participation(e.g. primary surgeon, anaesthesiologiest, etc.).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ChargeItemParticipant {
  
  inline def apply(actor: Reference): ChargeItemParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItemParticipant]
  }
  
  extension [Self <: ChargeItemParticipant](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
