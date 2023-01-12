package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventAgent
  extends StObject
     with BackboneElement {
  
  var _altId: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requestor: js.UndefOr[Element] = js.undefined
  
  /**
    * Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
    */
  var altId: js.UndefOr[String] = js.undefined
  
  /**
    * Where the event occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of media involved. Used when the event is about exporting/importing onto media.
    */
  var media: js.UndefOr[Coding] = js.undefined
  
  /**
    * Human-meaningful name for the agent.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Logical network location for application activity, if the activity has a network location.
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.undefined
  
  /**
    * For example: Where an OAuth token authorizes, the unique identifier from the OAuth token is placed into the policy element Where a policy engine (e.g. XACML) holds policy logic, the unique policy identifier is placed into the policy element.
    */
  var policy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Use AuditEvent.agent.purposeOfUse when you know that is specific to the agent, otherwise use AuditEvent.purposeOfEvent. For example, during a machine-to-machine transfer it might not be obvious to the audit system who caused the event, but it does know why.
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There can only be one initiator. If the initiator is not clear, then do not choose any one agent as the initiator.
    */
  var requestor: Boolean
  
  /**
    * Should be roles relevant to the event. Should  not be an exhaustive list of roles.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specification of the participation type the user plays when performing the event.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where a User ID is available it will go into who.identifier.
    */
  var who: js.UndefOr[Reference] = js.undefined
}
object AuditEventAgent {
  
  inline def apply(requestor: Boolean): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventAgent] (val x: Self) extends AnyVal {
    
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
    
    inline def setPolicy(value: js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setPurposeOfUse(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purposeOfUse", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfUseUndefined: Self = StObject.set(x, "purposeOfUse", js.undefined)
    
    inline def setPurposeOfUseVarargs(value: CodeableConcept*): Self = StObject.set(x, "purposeOfUse", js.Array(value*))
    
    inline def setRequestor(value: Boolean): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def setWhoUndefined: Self = StObject.set(x, "who", js.undefined)
    
    inline def set_altId(value: Element): Self = StObject.set(x, "_altId", value.asInstanceOf[js.Any])
    
    inline def set_altIdUndefined: Self = StObject.set(x, "_altId", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value*))
    
    inline def set_requestor(value: Element): Self = StObject.set(x, "_requestor", value.asInstanceOf[js.Any])
    
    inline def set_requestorUndefined: Self = StObject.set(x, "_requestor", js.undefined)
  }
}
