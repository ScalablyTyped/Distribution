package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetSslProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of URLs to SslCertificate resources to associate with this
    * TargetSslProxy. Currently exactly one ssl certificate must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTargetSslProxiesSetSslCertificatesRequest {
  
  @scala.inline
  def apply(): SchemaTargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetSslCertificatesRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetSslProxiesSetSslCertificatesRequestMutableBuilder[Self <: SchemaTargetSslProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
  }
}
