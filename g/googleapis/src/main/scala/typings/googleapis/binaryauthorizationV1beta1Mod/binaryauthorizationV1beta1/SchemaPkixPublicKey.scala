package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPkixPublicKey extends StObject {
  
  /**
    * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
    */
  var publicKeyPem: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
    */
  var signatureAlgorithm: js.UndefOr[String | Null] = js.undefined
}
object SchemaPkixPublicKey {
  
  inline def apply(): SchemaPkixPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPkixPublicKey]
  }
  
  extension [Self <: SchemaPkixPublicKey](x: Self) {
    
    inline def setPublicKeyPem(value: String): Self = StObject.set(x, "publicKeyPem", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyPemNull: Self = StObject.set(x, "publicKeyPem", null)
    
    inline def setPublicKeyPemUndefined: Self = StObject.set(x, "publicKeyPem", js.undefined)
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmNull: Self = StObject.set(x, "signatureAlgorithm", null)
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
  }
}
