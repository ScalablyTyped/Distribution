package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity being ascribed responsibility
  */
@js.native
trait ContractAgent extends BackboneElement {
  
  /**
    * Contract Agent Type
    */
  var actor: Reference = js.native
  
  /**
    * Role type of the agent
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object ContractAgent {
  
  @scala.inline
  def apply(actor: Reference): ContractAgent = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractAgent]
  }
  
  @scala.inline
  implicit class ContractAgentMutableBuilder[Self <: ContractAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value :_*))
  }
}
