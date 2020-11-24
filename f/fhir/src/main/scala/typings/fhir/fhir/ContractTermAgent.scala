package typings.fhir.fhir

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
  implicit class ContractTermAgentOps[Self <: ContractTermAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActor(value: Reference): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = this.set("role", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
