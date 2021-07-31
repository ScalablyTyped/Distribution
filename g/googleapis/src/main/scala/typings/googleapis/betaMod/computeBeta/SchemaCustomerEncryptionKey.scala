package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a customer-supplied encryption key
  */
trait SchemaCustomerEncryptionKey extends StObject {
  
  /**
    * The name of the encryption key that is stored in Google Cloud KMS.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648
    * base64 to either encrypt or decrypt this resource.
    */
  var rawKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit
    * customer-supplied encryption key to either encrypt or decrypt this
    * resource.  The key must meet the following requirements before you can
    * provide it to Compute Engine:   - The key is wrapped using a RSA public
    * key certificate provided by Google.  - After being wrapped, the key must
    * be encoded in RFC 4648 base64 encoding.  Gets the RSA public key
    * certificate provided by Google at:
    * https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
    */
  var rsaEncryptedKey: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the
    * customer-supplied encryption key that protects this resource.
    */
  var sha256: js.UndefOr[String] = js.undefined
}
object SchemaCustomerEncryptionKey {
  
  @scala.inline
  def apply(): SchemaCustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerEncryptionKey]
  }
  
  @scala.inline
  implicit class SchemaCustomerEncryptionKeyMutableBuilder[Self <: SchemaCustomerEncryptionKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawKeyUndefined: Self = StObject.set(x, "rawKey", js.undefined)
    
    @scala.inline
    def setRsaEncryptedKey(value: String): Self = StObject.set(x, "rsaEncryptedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaEncryptedKeyUndefined: Self = StObject.set(x, "rsaEncryptedKey", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
