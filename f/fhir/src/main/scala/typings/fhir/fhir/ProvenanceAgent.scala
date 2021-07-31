package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Actor involved
  */
trait ProvenanceAgent
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Who the agent is representing
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who the agent is representing
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Type of relationship between agents
    */
  var relatedAgentType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What the agents role was
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who participated
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who participated
    */
  var whoUri: js.UndefOr[uri] = js.undefined
}
object ProvenanceAgent {
  
  @scala.inline
  def apply(): ProvenanceAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvenanceAgent]
  }
  
  @scala.inline
  implicit class ProvenanceAgentMutableBuilder[Self <: ProvenanceAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBehalfOfReference(value: Reference): Self = StObject.set(x, "onBehalfOfReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfReferenceUndefined: Self = StObject.set(x, "onBehalfOfReference", js.undefined)
    
    @scala.inline
    def setOnBehalfOfUri(value: uri): Self = StObject.set(x, "onBehalfOfUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUriUndefined: Self = StObject.set(x, "onBehalfOfUri", js.undefined)
    
    @scala.inline
    def setRelatedAgentType(value: CodeableConcept): Self = StObject.set(x, "relatedAgentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAgentTypeUndefined: Self = StObject.set(x, "relatedAgentType", js.undefined)
    
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value :_*))
    
    @scala.inline
    def setWhoReference(value: Reference): Self = StObject.set(x, "whoReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhoReferenceUndefined: Self = StObject.set(x, "whoReference", js.undefined)
    
    @scala.inline
    def setWhoUri(value: uri): Self = StObject.set(x, "whoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhoUriUndefined: Self = StObject.set(x, "whoUri", js.undefined)
    
    @scala.inline
    def set_onBehalfOfUri(value: Element): Self = StObject.set(x, "_onBehalfOfUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onBehalfOfUriUndefined: Self = StObject.set(x, "_onBehalfOfUri", js.undefined)
    
    @scala.inline
    def set_whoUri(value: Element): Self = StObject.set(x, "_whoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_whoUriUndefined: Self = StObject.set(x, "_whoUri", js.undefined)
  }
}
