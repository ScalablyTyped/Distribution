package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity used in this activity
  */
@js.native
trait ProvenanceEntity extends BackboneElement {
  /**
    * Contains extended information for property 'role'.
    */
  var _role: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whatUri'.
    */
  var _whatUri: js.UndefOr[Element] = js.native
  /**
    * Entity is attributed to this agent
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.native
  /**
    * derivation | revision | quotation | source | removal
    */
  var role: code = js.native
  /**
    * Identity of entity
    */
  var whatIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Identity of entity
    */
  var whatReference: js.UndefOr[Reference] = js.native
  /**
    * Identity of entity
    */
  var whatUri: js.UndefOr[uri] = js.native
}

object ProvenanceEntity {
  @scala.inline
  def apply(role: code): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
  @scala.inline
  implicit class ProvenanceEntityOps[Self <: ProvenanceEntity] (val x: Self) extends AnyVal {
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
    def setRole(value: code): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def set_role(value: Element): Self = this.set("_role", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_role: Self = this.set("_role", js.undefined)
    @scala.inline
    def set_whatUri(value: Element): Self = this.set("_whatUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_whatUri: Self = this.set("_whatUri", js.undefined)
    @scala.inline
    def setAgentVarargs(value: ProvenanceAgent*): Self = this.set("agent", js.Array(value :_*))
    @scala.inline
    def setAgent(value: js.Array[ProvenanceAgent]): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setWhatIdentifier(value: Identifier): Self = this.set("whatIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhatIdentifier: Self = this.set("whatIdentifier", js.undefined)
    @scala.inline
    def setWhatReference(value: Reference): Self = this.set("whatReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhatReference: Self = this.set("whatReference", js.undefined)
    @scala.inline
    def setWhatUri(value: uri): Self = this.set("whatUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhatUri: Self = this.set("whatUri", js.undefined)
  }
  
}

