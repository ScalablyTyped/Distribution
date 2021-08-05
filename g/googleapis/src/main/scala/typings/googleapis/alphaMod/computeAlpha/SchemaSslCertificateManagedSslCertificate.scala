package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration and status of a managed SSL certificate.
  */
trait SchemaSslCertificateManagedSslCertificate extends StObject {
  
  /**
    * [Output only] Detailed statuses of the domains specified for managed
    * certificate resource.
    */
  var domainStatus: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The domains for which a managed SSL certificate will be generated.
    * Currently only single-domain certs are supported.
    */
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Output only] Status of the managed certificate resource.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaSslCertificateManagedSslCertificate {
  
  inline def apply(): SchemaSslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificateManagedSslCertificate]
  }
  
  extension [Self <: SchemaSslCertificateManagedSslCertificate](x: Self) {
    
    inline def setDomainStatus(value: StringDictionary[String]): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
