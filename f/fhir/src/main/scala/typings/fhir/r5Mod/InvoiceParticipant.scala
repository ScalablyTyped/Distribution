package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed or participated in the service.
    */
  var actor: Reference
  
  /**
    * Describes the type of involvement (e.g. transcriptionist, creator etc.). If the invoice has been created automatically, the Participant may be a billing engine or another kind of device.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object InvoiceParticipant {
  
  inline def apply(actor: Reference): InvoiceParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceParticipant]
  }
  
  extension [Self <: InvoiceParticipant](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
