package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who|what controlled by this consent (or group, by role)
  */
trait ConsentActor
  extends StObject
     with BackboneElement {
  
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference
  
  /**
    * How the actor is involved
    */
  var role: CodeableConcept
}
object ConsentActor {
  
  inline def apply(reference: Reference, role: CodeableConcept): ConsentActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentActor]
  }
  
  extension [Self <: ConsentActor](x: Self) {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
