package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateInfoSubjectPublicKeyInfoDigest extends StObject {
  
  var sha256: String
}
object CertificateInfoSubjectPublicKeyInfoDigest {
  
  @scala.inline
  def apply(sha256: String): CertificateInfoSubjectPublicKeyInfoDigest = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoSubjectPublicKeyInfoDigest]
  }
  
  @scala.inline
  implicit class CertificateInfoSubjectPublicKeyInfoDigestMutableBuilder[Self <: CertificateInfoSubjectPublicKeyInfoDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
  }
}
