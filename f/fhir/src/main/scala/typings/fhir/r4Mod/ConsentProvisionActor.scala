package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentProvisionActor
  extends StObject
     with BackboneElement {
  
  /**
    * The resource that identifies the actor. To identify actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var reference: Reference
  
  /**
    * How the individual is involved in the resources content that is described in the exception.
    */
  var role: CodeableConcept
}
object ConsentProvisionActor {
  
  inline def apply(reference: Reference, role: CodeableConcept): ConsentProvisionActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentProvisionActor]
  }
  
  extension [Self <: ConsentProvisionActor](x: Self) {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
