package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentProvisionActor
  extends StObject
     with BackboneElement {
  
  /**
    * The resource that identifies the actor. To identify actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * How the individual is involved in the resources content that is described in the exception.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ConsentProvisionActor {
  
  inline def apply(): ConsentProvisionActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentProvisionActor]
  }
  
  extension [Self <: ConsentProvisionActor](x: Self) {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
