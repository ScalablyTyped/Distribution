package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Actor involved
  */
@js.native
trait ProvenanceAgent extends BackboneElement {
  
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.native
  
  /**
    * Who the agent is representing
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.native
  
  /**
    * Who the agent is representing
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.native
  
  /**
    * Type of relationship between agents
    */
  var relatedAgentType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What the agents role was
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Who participated
    */
  var whoReference: js.UndefOr[Reference] = js.native
  
  /**
    * Who participated
    */
  var whoUri: js.UndefOr[uri] = js.native
}
object ProvenanceAgent {
  
  @scala.inline
  def apply(): ProvenanceAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvenanceAgent]
  }
  
  @scala.inline
  implicit class ProvenanceAgentOps[Self <: ProvenanceAgent] (val x: Self) extends AnyVal {
    
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
    def set_onBehalfOfUri(value: Element): Self = this.set("_onBehalfOfUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_onBehalfOfUri: Self = this.set("_onBehalfOfUri", js.undefined)
    
    @scala.inline
    def set_whoUri(value: Element): Self = this.set("_whoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_whoUri: Self = this.set("_whoUri", js.undefined)
    
    @scala.inline
    def setOnBehalfOfReference(value: Reference): Self = this.set("onBehalfOfReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfReference: Self = this.set("onBehalfOfReference", js.undefined)
    
    @scala.inline
    def setOnBehalfOfUri(value: uri): Self = this.set("onBehalfOfUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfUri: Self = this.set("onBehalfOfUri", js.undefined)
    
    @scala.inline
    def setRelatedAgentType(value: CodeableConcept): Self = this.set("relatedAgentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedAgentType: Self = this.set("relatedAgentType", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = this.set("role", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setWhoReference(value: Reference): Self = this.set("whoReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoReference: Self = this.set("whoReference", js.undefined)
    
    @scala.inline
    def setWhoUri(value: uri): Self = this.set("whoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhoUri: Self = this.set("whoUri", js.undefined)
  }
}
