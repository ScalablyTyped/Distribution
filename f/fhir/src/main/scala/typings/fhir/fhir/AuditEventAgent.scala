package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Actor involved in the event
  */
trait AuditEventAgent
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'altId'.
    */
  var _altId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'requestor'.
    */
  var _requestor: js.UndefOr[Element] = js.undefined
  
  /**
    * Alternative User id e.g. authentication
    */
  var altId: js.UndefOr[String] = js.undefined
  
  /**
    * Where
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of media
    */
  var media: js.UndefOr[Coding] = js.undefined
  
  /**
    * Human-meaningful name for the agent
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Logical network location for application activity
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.undefined
  
  /**
    * Policy that authorized event
    */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Reason given for this user
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Direct reference to resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether user is initiator
    */
  var requestor: Boolean
  
  /**
    * Agent role in the event
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Unique identifier for the user
    */
  var userId: js.UndefOr[Identifier] = js.undefined
}
object AuditEventAgent {
  
  inline def apply(requestor: Boolean): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  
  extension [Self <: AuditEventAgent](x: Self) {
    
    inline def setAltId(value: String): Self = StObject.set(x, "altId", value.asInstanceOf[js.Any])
    
    inline def setAltIdUndefined: Self = StObject.set(x, "altId", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedia(value: Coding): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: AuditEventAgentNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPolicy(value: js.Array[uri]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: uri*): Self = StObject.set(x, "policy", js.Array(value :_*))
    
    inline def setPurposeOfUse(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfUse", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfUseUndefined: Self = StObject.set(x, "purposeOfUse", js.undefined)
    
    inline def setPurposeOfUseVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfUse", js.Array(value :_*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRequestor(value: Boolean): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value :_*))
    
    inline def setUserId(value: Identifier): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def set_altId(value: Element): Self = StObject.set(x, "_altId", value.asInstanceOf[js.Any])
    
    inline def set_altIdUndefined: Self = StObject.set(x, "_altId", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value :_*))
    
    inline def set_requestor(value: Element): Self = StObject.set(x, "_requestor", value.asInstanceOf[js.Any])
    
    inline def set_requestorUndefined: Self = StObject.set(x, "_requestor", js.undefined)
  }
}
