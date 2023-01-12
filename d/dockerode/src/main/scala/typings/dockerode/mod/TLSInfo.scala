package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSInfo extends StObject {
  
  var CertIssuerPublicKey: js.UndefOr[String] = js.undefined
  
  var CertIssuerSubject: js.UndefOr[String] = js.undefined
  
  var TrustRoot: js.UndefOr[String] = js.undefined
}
object TLSInfo {
  
  inline def apply(): TLSInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TLSInfo] (val x: Self) extends AnyVal {
    
    inline def setCertIssuerPublicKey(value: String): Self = StObject.set(x, "CertIssuerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setCertIssuerPublicKeyUndefined: Self = StObject.set(x, "CertIssuerPublicKey", js.undefined)
    
    inline def setCertIssuerSubject(value: String): Self = StObject.set(x, "CertIssuerSubject", value.asInstanceOf[js.Any])
    
    inline def setCertIssuerSubjectUndefined: Self = StObject.set(x, "CertIssuerSubject", js.undefined)
    
    inline def setTrustRoot(value: String): Self = StObject.set(x, "TrustRoot", value.asInstanceOf[js.Any])
    
    inline def setTrustRootUndefined: Self = StObject.set(x, "TrustRoot", js.undefined)
  }
}
