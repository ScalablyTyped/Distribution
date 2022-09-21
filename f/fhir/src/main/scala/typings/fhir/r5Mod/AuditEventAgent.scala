package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventAgent
  extends StObject
     with BackboneElement {
  
  var _networkString: js.UndefOr[Element] = js.undefined
  
  var _networkUri: js.UndefOr[Element] = js.undefined
  
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requestor: js.UndefOr[Element] = js.undefined
  
  /**
    * Use AuditEvent.agent.authorization when you know that is specific to the agent, otherwise use AuditEvent.authorization. For example, during a machine-to-machine transfer it might not be obvious to the audit system who caused the event, but it does know why.
    */
  var authorization: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Where the agent location is known, the agent location when the event occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * When remote network endpoint is known, another agent representing the remote agent would indicate the remote network endpoint used. Convention is to indicate data flowing from Source to Destination. The convention for Search, given data flows both ways (query parameters vs results), is to have the Source as the initiator of the Search Transaction, and the Destination the responder to the Search transaction.
    */
  var networkReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * When remote network endpoint is known, another agent representing the remote agent would indicate the remote network endpoint used. Convention is to indicate data flowing from Source to Destination. The convention for Search, given data flows both ways (query parameters vs results), is to have the Source as the initiator of the Search Transaction, and the Destination the responder to the Search transaction.
    */
  var networkString: js.UndefOr[String] = js.undefined
  
  /**
    * When remote network endpoint is known, another agent representing the remote agent would indicate the remote network endpoint used. Convention is to indicate data flowing from Source to Destination. The convention for Search, given data flows both ways (query parameters vs results), is to have the Source as the initiator of the Search Transaction, and the Destination the responder to the Search transaction.
    */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /**
    * For example: Where an OAuth token authorizes, the unique identifier from the OAuth token is placed into the policy element Where a policy engine (e.g. XACML) holds policy logic, the unique policy identifier is placed into the policy element.
    */
  var policy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * There can only be one initiator. If the initiator is not clear, then do not choose any one agent as the initiator.
    */
  var requestor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For example: Chief-of-Radiology, Nurse, Physician, Medical-Student, etc.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example: assembler, author, prescriber, signer, investigator, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where a User ID is available it will go into who.identifier. Where a name of the user (human readable) it will go into who.display.
    */
  var who: Reference
}
object AuditEventAgent {
  
  inline def apply(who: Reference): AuditEventAgent = {
    val __obj = js.Dynamic.literal(who = who.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  
  extension [Self <: AuditEventAgent](x: Self) {
    
    inline def setAuthorization(value: js.Array[CodeableConcept]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setAuthorizationVarargs(value: CodeableConcept*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNetworkReference(value: Reference): Self = StObject.set(x, "networkReference", value.asInstanceOf[js.Any])
    
    inline def setNetworkReferenceUndefined: Self = StObject.set(x, "networkReference", js.undefined)
    
    inline def setNetworkString(value: String): Self = StObject.set(x, "networkString", value.asInstanceOf[js.Any])
    
    inline def setNetworkStringUndefined: Self = StObject.set(x, "networkString", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setPolicy(value: js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setRequestor(value: Boolean): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def set_networkString(value: Element): Self = StObject.set(x, "_networkString", value.asInstanceOf[js.Any])
    
    inline def set_networkStringUndefined: Self = StObject.set(x, "_networkString", js.undefined)
    
    inline def set_networkUri(value: Element): Self = StObject.set(x, "_networkUri", value.asInstanceOf[js.Any])
    
    inline def set_networkUriUndefined: Self = StObject.set(x, "_networkUri", js.undefined)
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value*))
    
    inline def set_requestor(value: Element): Self = StObject.set(x, "_requestor", value.asInstanceOf[js.Any])
    
    inline def set_requestorUndefined: Self = StObject.set(x, "_requestor", js.undefined)
  }
}
