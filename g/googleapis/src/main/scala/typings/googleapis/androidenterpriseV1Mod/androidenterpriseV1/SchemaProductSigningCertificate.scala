package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductSigningCertificate extends StObject {
  
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is
    * deprecated in favor of SHA2-256. It should not be used and may be removed
    * at any time.)
    */
  var certificateHashSha1: js.UndefOr[String] = js.native
  
  /**
    * The base64 urlsafe encoded SHA2-256 hash of the certificate.
    */
  var certificateHashSha256: js.UndefOr[String] = js.native
}
object SchemaProductSigningCertificate {
  
  @scala.inline
  def apply(): SchemaProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSigningCertificate]
  }
  
  @scala.inline
  implicit class SchemaProductSigningCertificateMutableBuilder[Self <: SchemaProductSigningCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateHashSha1(value: String): Self = StObject.set(x, "certificateHashSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHashSha1Undefined: Self = StObject.set(x, "certificateHashSha1", js.undefined)
    
    @scala.inline
    def setCertificateHashSha256(value: String): Self = StObject.set(x, "certificateHashSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHashSha256Undefined: Self = StObject.set(x, "certificateHashSha256", js.undefined)
  }
}
