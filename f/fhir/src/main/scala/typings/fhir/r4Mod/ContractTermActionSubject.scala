package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermActionSubject
  extends StObject
     with BackboneElement {
  
  /**
    * The entity the action is performed or not performed on or for.
    */
  var reference: js.Array[Reference]
  
  /**
    * Role type of agent assigned roles in this Contract.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ContractTermActionSubject {
  
  inline def apply(reference: js.Array[Reference]): ContractTermActionSubject = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermActionSubject]
  }
  
  extension [Self <: ContractTermActionSubject](x: Self) {
    
    inline def setReference(value: js.Array[Reference]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarargs(value: Reference*): Self = StObject.set(x, "reference", js.Array(value*))
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
