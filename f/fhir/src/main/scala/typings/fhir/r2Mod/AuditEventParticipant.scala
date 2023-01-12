package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventParticipant
  extends StObject
     with BackboneElement {
  
  var _altId: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requestor: js.UndefOr[Element] = js.undefined
  
  /**
    * In some situations a human user may authenticate with one identity but, to access a specific application system, may use a synonymous identify. For example, some "single sign on" implementations will do this. The alternative identifier would then be the original identify  used for authentication, and the User ID is the one known to and used by the application.
    */
  var altId: js.UndefOr[String] = js.undefined
  
  /**
    * Where the event occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Usually, this is used instead of specifying a network address. This field is not used for Media Id (i.e. the serial number of a CD).
    */
  var media: js.UndefOr[Coding] = js.undefined
  
  /**
    * The User ID and Authorization User ID may be internal or otherwise obscure values. This field assists the auditor in identifying the actual user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Logical network location for application activity, if the activity has a network location.
    */
  var network: js.UndefOr[AuditEventParticipantNetwork] = js.undefined
  
  /**
    * This value is used retrospectively to determine the authorization policies.
    */
  var policy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
    */
  var purposeOfUse: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * This field ties an audit event to a specific resource.
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This value is used to distinguish between requestor-users and recipient-users. For example, one person may initiate a report-output to be sent to another user.
    */
  var requestor: Boolean
  
  /**
    * This value ties an audited event to a user's role(s). It is an optional value that might be used to group events for analysis by user functional role categories.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This field ties an audit event to a specific user.
    */
  var userId: js.UndefOr[Identifier] = js.undefined
}
object AuditEventParticipant {
  
  inline def apply(requestor: Boolean): AuditEventParticipant = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventParticipant] (val x: Self) extends AnyVal {
    
    inline def setAltId(value: String): Self = StObject.set(x, "altId", value.asInstanceOf[js.Any])
    
    inline def setAltIdUndefined: Self = StObject.set(x, "altId", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedia(value: Coding): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: AuditEventParticipantNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPolicy(value: js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setPurposeOfUse(value: js.Array[Coding]): Self = StObject.set(x, "purposeOfUse", value.asInstanceOf[js.Any])
    
    inline def setPurposeOfUseUndefined: Self = StObject.set(x, "purposeOfUse", js.undefined)
    
    inline def setPurposeOfUseVarargs(value: Coding*): Self = StObject.set(x, "purposeOfUse", js.Array(value*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRequestor(value: Boolean): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setUserId(value: Identifier): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
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
