package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedCertificate extends StObject {
  
  /**
    * Output only. Detailed state of the latest authorization attempt for each domain specified for managed certificate resource.
    */
  var authorizationAttemptInfo: js.UndefOr[js.Array[SchemaAuthorizationAttemptInfo]] = js.undefined
  
  /**
    * Immutable. Authorizations that will be used for performing domain authorization.
    */
  var dnsAuthorizations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. The domains for which a managed SSL certificate will be generated. Wildcard domains are only supported with DNS challenge resolution.
    */
  var domains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Information about issues with provisioning a Managed Certificate.
    */
  var provisioningIssue: js.UndefOr[SchemaProvisioningIssue] = js.undefined
  
  /**
    * Output only. State of the managed certificate resource.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedCertificate {
  
  inline def apply(): SchemaManagedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCertificate]
  }
  
  extension [Self <: SchemaManagedCertificate](x: Self) {
    
    inline def setAuthorizationAttemptInfo(value: js.Array[SchemaAuthorizationAttemptInfo]): Self = StObject.set(x, "authorizationAttemptInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationAttemptInfoUndefined: Self = StObject.set(x, "authorizationAttemptInfo", js.undefined)
    
    inline def setAuthorizationAttemptInfoVarargs(value: SchemaAuthorizationAttemptInfo*): Self = StObject.set(x, "authorizationAttemptInfo", js.Array(value*))
    
    inline def setDnsAuthorizations(value: js.Array[String]): Self = StObject.set(x, "dnsAuthorizations", value.asInstanceOf[js.Any])
    
    inline def setDnsAuthorizationsNull: Self = StObject.set(x, "dnsAuthorizations", null)
    
    inline def setDnsAuthorizationsUndefined: Self = StObject.set(x, "dnsAuthorizations", js.undefined)
    
    inline def setDnsAuthorizationsVarargs(value: String*): Self = StObject.set(x, "dnsAuthorizations", js.Array(value*))
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setProvisioningIssue(value: SchemaProvisioningIssue): Self = StObject.set(x, "provisioningIssue", value.asInstanceOf[js.Any])
    
    inline def setProvisioningIssueUndefined: Self = StObject.set(x, "provisioningIssue", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
