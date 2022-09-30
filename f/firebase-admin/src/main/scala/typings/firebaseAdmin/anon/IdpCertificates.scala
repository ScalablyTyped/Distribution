package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdpCertificates extends StObject {
  
  var idpCertificates: js.UndefOr[js.Array[X509Certificate]] = js.undefined
  
  var idpEntityId: js.UndefOr[String] = js.undefined
  
  var signRequest: js.UndefOr[Boolean] = js.undefined
  
  var ssoUrl: js.UndefOr[String] = js.undefined
}
object IdpCertificates {
  
  inline def apply(): IdpCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpCertificates]
  }
  
  extension [Self <: IdpCertificates](x: Self) {
    
    inline def setIdpCertificates(value: js.Array[X509Certificate]): Self = StObject.set(x, "idpCertificates", value.asInstanceOf[js.Any])
    
    inline def setIdpCertificatesUndefined: Self = StObject.set(x, "idpCertificates", js.undefined)
    
    inline def setIdpCertificatesVarargs(value: X509Certificate*): Self = StObject.set(x, "idpCertificates", js.Array(value*))
    
    inline def setIdpEntityId(value: String): Self = StObject.set(x, "idpEntityId", value.asInstanceOf[js.Any])
    
    inline def setIdpEntityIdUndefined: Self = StObject.set(x, "idpEntityId", js.undefined)
    
    inline def setSignRequest(value: Boolean): Self = StObject.set(x, "signRequest", value.asInstanceOf[js.Any])
    
    inline def setSignRequestUndefined: Self = StObject.set(x, "signRequest", js.undefined)
    
    inline def setSsoUrl(value: String): Self = StObject.set(x, "ssoUrl", value.asInstanceOf[js.Any])
    
    inline def setSsoUrlUndefined: Self = StObject.set(x, "ssoUrl", js.undefined)
  }
}
