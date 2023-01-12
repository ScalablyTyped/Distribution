package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentActor
  extends StObject
     with BackboneElement {
  
  /**
    * The resource that identifies the actor. To identify a actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var reference: Reference
  
  /**
    * How the individual is involved in the resources content that is described in the consent.
    */
  var role: CodeableConcept
}
object ConsentActor {
  
  inline def apply(reference: Reference, role: CodeableConcept): ConsentActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentActor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentActor] (val x: Self) extends AnyVal {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
