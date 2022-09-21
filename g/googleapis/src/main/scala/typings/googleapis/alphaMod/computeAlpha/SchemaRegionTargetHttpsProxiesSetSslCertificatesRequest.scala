package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
    */
  var sslCertificates: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest {
  
  inline def apply(): SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest]
  }
  
  extension [Self <: SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest](x: Self) {
    
    inline def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesNull: Self = StObject.set(x, "sslCertificates", null)
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value*))
  }
}
