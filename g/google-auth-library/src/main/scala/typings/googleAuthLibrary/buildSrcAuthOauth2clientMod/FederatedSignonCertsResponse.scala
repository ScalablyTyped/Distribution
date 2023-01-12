package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedSignonCertsResponse extends StObject {
  
  var certs: Certificates
  
  var format: CertificateFormat
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}
object FederatedSignonCertsResponse {
  
  inline def apply(certs: Certificates, format: CertificateFormat): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedSignonCertsResponse] (val x: Self) extends AnyVal {
    
    inline def setCerts(value: Certificates): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: CertificateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
