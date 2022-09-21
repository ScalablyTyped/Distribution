package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertificateManagedSslCertificate extends StObject {
  
  /**
    * [Output only] Detailed statuses of the domains specified for managed certificate resource.
    */
  var domainStatus: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
    */
  var domains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output only] Status of the managed certificate resource.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslCertificateManagedSslCertificate {
  
  inline def apply(): SchemaSslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificateManagedSslCertificate]
  }
  
  extension [Self <: SchemaSslCertificateManagedSslCertificate](x: Self) {
    
    inline def setDomainStatus(value: StringDictionary[String]): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusNull: Self = StObject.set(x, "domainStatus", null)
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
