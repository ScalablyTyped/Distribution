package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Term Agent List
  */
@js.native
trait ContractTermAgent extends BackboneElement {
  
  /**
    * Contract Term Agent Subject
    */
  var actor: Reference = js.native
  
  /**
    * Type of the Contract Term Agent
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object ContractTermAgent {
  
  @scala.inline
  def apply(actor: Reference): ContractTermAgent = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermAgent]
  }
  
  @scala.inline
  implicit class ContractTermAgentMutableBuilder[Self <: ContractTermAgent] (val x: Self) extends AnyVal {
    
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
