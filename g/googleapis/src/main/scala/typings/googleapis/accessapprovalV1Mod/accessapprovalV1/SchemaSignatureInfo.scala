package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSignatureInfo extends StObject {
  
  /**
    * The resource name of the customer CryptoKeyVersion used for signing.
    */
  var customerKmsKeyVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public key for the Google default signing, encoded in PEM format. The signature was created using a private key which may be verified using this public key.
    */
  var googlePublicKeyPem: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digital signature.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
}
object SchemaSignatureInfo {
  
  inline def apply(): SchemaSignatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignatureInfo]
  }
  
  extension [Self <: SchemaSignatureInfo](x: Self) {
    
    inline def setCustomerKmsKeyVersion(value: String): Self = StObject.set(x, "customerKmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomerKmsKeyVersionNull: Self = StObject.set(x, "customerKmsKeyVersion", null)
    
    inline def setCustomerKmsKeyVersionUndefined: Self = StObject.set(x, "customerKmsKeyVersion", js.undefined)
    
    inline def setGooglePublicKeyPem(value: String): Self = StObject.set(x, "googlePublicKeyPem", value.asInstanceOf[js.Any])
    
    inline def setGooglePublicKeyPemNull: Self = StObject.set(x, "googlePublicKeyPem", null)
    
    inline def setGooglePublicKeyPemUndefined: Self = StObject.set(x, "googlePublicKeyPem", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
