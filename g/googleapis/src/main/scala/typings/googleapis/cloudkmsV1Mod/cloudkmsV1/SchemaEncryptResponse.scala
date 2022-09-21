package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptResponse extends StObject {
  
  /**
    * The encrypted data.
    */
  var ciphertext: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned EncryptResponse.ciphertext. An integrity check of EncryptResponse.ciphertext can be performed by computing the CRC32C checksum of EncryptResponse.ciphertext and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var ciphertextCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the CryptoKeyVersion used in encryption. Check this field to verify that the intended resource was used for encryption.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ProtectionLevel of the CryptoKeyVersion used in encryption.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether EncryptRequest.additional_authenticated_data_crc32c was received by KeyManagementService and used for the integrity verification of the AAD. A false value of this field indicates either that EncryptRequest.additional_authenticated_data_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set EncryptRequest.additional_authenticated_data_crc32c but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedAdditionalAuthenticatedDataCrc32c: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether EncryptRequest.plaintext_crc32c was received by KeyManagementService and used for the integrity verification of the plaintext. A false value of this field indicates either that EncryptRequest.plaintext_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set EncryptRequest.plaintext_crc32c but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedPlaintextCrc32c: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaEncryptResponse {
  
  inline def apply(): SchemaEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptResponse]
  }
  
  extension [Self <: SchemaEncryptResponse](x: Self) {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32c(value: String): Self = StObject.set(x, "ciphertextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32cNull: Self = StObject.set(x, "ciphertextCrc32c", null)
    
    inline def setCiphertextCrc32cUndefined: Self = StObject.set(x, "ciphertextCrc32c", js.undefined)
    
    inline def setCiphertextNull: Self = StObject.set(x, "ciphertext", null)
    
    inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setVerifiedAdditionalAuthenticatedDataCrc32c(value: Boolean): Self = StObject.set(x, "verifiedAdditionalAuthenticatedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAdditionalAuthenticatedDataCrc32cNull: Self = StObject.set(x, "verifiedAdditionalAuthenticatedDataCrc32c", null)
    
    inline def setVerifiedAdditionalAuthenticatedDataCrc32cUndefined: Self = StObject.set(x, "verifiedAdditionalAuthenticatedDataCrc32c", js.undefined)
    
    inline def setVerifiedPlaintextCrc32c(value: Boolean): Self = StObject.set(x, "verifiedPlaintextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedPlaintextCrc32cNull: Self = StObject.set(x, "verifiedPlaintextCrc32c", null)
    
    inline def setVerifiedPlaintextCrc32cUndefined: Self = StObject.set(x, "verifiedPlaintextCrc32c", js.undefined)
  }
}
