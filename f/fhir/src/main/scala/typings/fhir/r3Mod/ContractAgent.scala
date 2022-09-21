package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractAgent
  extends StObject
     with BackboneElement {
  
  /**
    * Who or what parties are assigned roles in this Contract.
    */
  var actor: Reference
  
  /**
    * Role type of agent assigned roles in this Contract.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ContractAgent {
  
  inline def apply(actor: Reference): ContractAgent = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractAgent]
  }
  
  extension [Self <: ContractAgent](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
  }
}
