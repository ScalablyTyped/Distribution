package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ContractAgentOps[Self <: ContractAgent] (val x: Self) extends AnyVal {
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

