package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Actor involved in the event
  */
@js.native
trait AuditEventAgent extends BackboneElement {
  
  /**
    * Contains extended information for property 'altId'.
    */
  var _altId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'requestor'.
    */
  var _requestor: js.UndefOr[Element] = js.native
  
  /**
    * Alternative User id e.g. authentication
    */
  var altId: js.UndefOr[String] = js.native
  
  /**
    * Where
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * Type of media
    */
  var media: js.UndefOr[Coding] = js.native
  
  /**
    * Human-meaningful name for the agent
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Logical network location for application activity
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.native
  
  /**
    * Policy that authorized event
    */
  var policy: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * Reason given for this user
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Direct reference to resource
    */
  var reference: js.UndefOr[Reference] = js.native
  
  /**
    * Whether user is initiator
    */
  var requestor: Boolean = js.native
  
  /**
    * Agent role in the event
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Unique identifier for the user
    */
  var userId: js.UndefOr[Identifier] = js.native
}
object AuditEventAgent {
  
  @scala.inline
  def apply(requestor: Boolean): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  
  @scala.inline
  implicit class AuditEventAgentMutableBuilder[Self <: AuditEventAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltId(value: String): Self = StObject.set(x, "altId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltIdUndefined: Self = StObject.set(x, "altId", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMedia(value: Coding): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: AuditEventAgentNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPolicy(value: js.Array[uri]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setPolicyVarargs(value: uri*): Self = StObject.set(x, "policy", js.Array(value :_*))
    
    @scala.inline
    def setPurposeOfUse(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeOfUseUndefined: Self = StObject.set(x, "purposeOfUse", js.undefined)
    
    @scala.inline
    def setPurposeOfUseVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfUse", js.Array(value :_*))
    
    @scala.inline
    def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRequestor(value: Boolean): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: Identifier): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def set_altId(value: Element): Self = StObject.set(x, "_altId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_altIdUndefined: Self = StObject.set(x, "_altId", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    @scala.inline
    def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value :_*))
    
    @scala.inline
    def set_requestor(value: Element): Self = StObject.set(x, "_requestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requestorUndefined: Self = StObject.set(x, "_requestor", js.undefined)
  }
}
