package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDecryptResponse extends StObject {
  
  /**
    * The decrypted data originally supplied in EncryptRequest.plaintext.
    */
  var plaintext: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned DecryptResponse.plaintext. An integrity check of DecryptResponse.plaintext can be performed by computing the CRC32C checksum of DecryptResponse.plaintext and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: receiving this response message indicates that KeyManagementService is able to successfully decrypt the ciphertext. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var plaintextCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ProtectionLevel of the CryptoKeyVersion used in decryption.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the Decryption was performed using the primary key version.
    */
  var usedPrimary: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDecryptResponse {
  
  inline def apply(): SchemaDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptResponse]
  }
  
  extension [Self <: SchemaDecryptResponse](x: Self) {
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32c(value: String): Self = StObject.set(x, "plaintextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32cNull: Self = StObject.set(x, "plaintextCrc32c", null)
    
    inline def setPlaintextCrc32cUndefined: Self = StObject.set(x, "plaintextCrc32c", js.undefined)
    
    inline def setPlaintextNull: Self = StObject.set(x, "plaintext", null)
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setUsedPrimary(value: Boolean): Self = StObject.set(x, "usedPrimary", value.asInstanceOf[js.Any])
    
    inline def setUsedPrimaryNull: Self = StObject.set(x, "usedPrimary", null)
    
    inline def setUsedPrimaryUndefined: Self = StObject.set(x, "usedPrimary", js.undefined)
  }
}
