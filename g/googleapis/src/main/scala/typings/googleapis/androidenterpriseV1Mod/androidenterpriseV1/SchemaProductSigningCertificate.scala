package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductSigningCertificate extends StObject {
  
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is deprecated in favor of SHA2-256. It should not be used and may be removed at any time.)
    */
  var certificateHashSha1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base64 urlsafe encoded SHA2-256 hash of the certificate.
    */
  var certificateHashSha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductSigningCertificate {
  
  inline def apply(): SchemaProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSigningCertificate]
  }
  
  extension [Self <: SchemaProductSigningCertificate](x: Self) {
    
    inline def setCertificateHashSha1(value: String): Self = StObject.set(x, "certificateHashSha1", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSha1Null: Self = StObject.set(x, "certificateHashSha1", null)
    
    inline def setCertificateHashSha1Undefined: Self = StObject.set(x, "certificateHashSha1", js.undefined)
    
    inline def setCertificateHashSha256(value: String): Self = StObject.set(x, "certificateHashSha256", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSha256Null: Self = StObject.set(x, "certificateHashSha256", null)
    
    inline def setCertificateHashSha256Undefined: Self = StObject.set(x, "certificateHashSha256", js.undefined)
  }
}
