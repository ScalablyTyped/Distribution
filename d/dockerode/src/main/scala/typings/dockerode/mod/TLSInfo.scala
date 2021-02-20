package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSInfo extends StObject {
  
  var CertIssuerPublicKey: js.UndefOr[String] = js.native
  
  var CertIssuerSubject: js.UndefOr[String] = js.native
  
  var TrustRoot: js.UndefOr[String] = js.native
}
object TLSInfo {
  
  @scala.inline
  def apply(): TLSInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSInfo]
  }
  
  @scala.inline
  implicit class TLSInfoMutableBuilder[Self <: TLSInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertIssuerPublicKey(value: String): Self = StObject.set(x, "CertIssuerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertIssuerPublicKeyUndefined: Self = StObject.set(x, "CertIssuerPublicKey", js.undefined)
    
    @scala.inline
    def setCertIssuerSubject(value: String): Self = StObject.set(x, "CertIssuerSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertIssuerSubjectUndefined: Self = StObject.set(x, "CertIssuerSubject", js.undefined)
    
    @scala.inline
    def setTrustRoot(value: String): Self = StObject.set(x, "TrustRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustRootUndefined: Self = StObject.set(x, "TrustRoot", js.undefined)
  }
}
