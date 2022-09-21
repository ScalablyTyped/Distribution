package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationPractitioner
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed the action.
    */
  var actor: Reference
  
  /**
    * Describes the type of performance (e.g. ordering provider, administering provider, etc.).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ImmunizationPractitioner {
  
  inline def apply(actor: Reference): ImmunizationPractitioner = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationPractitioner]
  }
  
  extension [Self <: ImmunizationPractitioner](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
