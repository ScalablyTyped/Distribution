package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecuritySettings extends StObject {
  
  /**
    * [Deprecated] Use clientTlsPolicy instead.
    */
  var authentication: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A URL referring to a networksecurity.ClientTlsPolicy resource that describes how clients should authenticate with this service's backends. clientTlsPolicy only applies to a global BackendService with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
    */
  var clientTlsPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A list of Subject Alternative Names (SANs) that the client verifies during a mutual TLS handshake with an server/endpoint for this BackendService. When the server presents its X.509 certificate to the client, the client inspects the certificate's subjectAltName field. If the field contains one of the specified values, the communication continues. Otherwise, it fails. This additional check enables the client to verify that the server is authorized to run the requested service. Note that the contents of the server certificate's subjectAltName field are configured by the Public Key Infrastructure which provisions server identities. Only applies to a global BackendService with loadBalancingScheme set to INTERNAL_SELF_MANAGED. Only applies when BackendService has an attached clientTlsPolicy with clientCertificate (mTLS mode). Note: This field currently has no impact.
    */
  var subjectAltNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSecuritySettings {
  
  inline def apply(): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
  
  extension [Self <: SchemaSecuritySettings](x: Self) {
    
    inline def setAuthentication(value: String): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationNull: Self = StObject.set(x, "authentication", null)
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setClientTlsPolicy(value: String): Self = StObject.set(x, "clientTlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientTlsPolicyNull: Self = StObject.set(x, "clientTlsPolicy", null)
    
    inline def setClientTlsPolicyUndefined: Self = StObject.set(x, "clientTlsPolicy", js.undefined)
    
    inline def setSubjectAltNames(value: js.Array[String]): Self = StObject.set(x, "subjectAltNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNamesNull: Self = StObject.set(x, "subjectAltNames", null)
    
    inline def setSubjectAltNamesUndefined: Self = StObject.set(x, "subjectAltNames", js.undefined)
    
    inline def setSubjectAltNamesVarargs(value: String*): Self = StObject.set(x, "subjectAltNames", js.Array(value*))
  }
}
