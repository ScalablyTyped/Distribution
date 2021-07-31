package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest extends StObject {
  
  /**
    * New set of SslCertificate resources to associate with this
    * TargetHttpsProxy resource. Currently exactly one SslCertificate resource
    * must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest {
  
  @scala.inline
  def apply(): SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionTargetHttpsProxiesSetSslCertificatesRequestMutableBuilder[Self <: SchemaRegionTargetHttpsProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
  }
}
