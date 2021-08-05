package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetHttpsProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of SslCertificate resources to associate with this
    * TargetHttpsProxy resource. Currently exactly one SslCertificate resource
    * must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTargetHttpsProxiesSetSslCertificatesRequest {
  
  inline def apply(): SchemaTargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetSslCertificatesRequest]
  }
  
  extension [Self <: SchemaTargetHttpsProxiesSetSslCertificatesRequest](x: Self) {
    
    inline def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    inline def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    inline def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
  }
}
