package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermAgent
  extends StObject
     with BackboneElement {
  
  /**
    * The agent assigned a role in this Contract Provision.
    */
  var actor: Reference
  
  /**
    * Role played by the agent assigned this role in the execution of this Contract Provision.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ContractTermAgent {
  
  inline def apply(actor: Reference): ContractTermAgent = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTermAgent] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
  }
}
