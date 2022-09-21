package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsymmetricDecryptRequest extends StObject {
  
  /**
    * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
    */
  var ciphertext: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricDecryptRequest.ciphertext. If specified, KeyManagementService will verify the integrity of the received AsymmetricDecryptRequest.ciphertext using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(AsymmetricDecryptRequest.ciphertext) is equal to AsymmetricDecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var ciphertextCrc32c: js.UndefOr[String | Null] = js.undefined
}
object SchemaAsymmetricDecryptRequest {
  
  inline def apply(): SchemaAsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptRequest]
  }
  
  extension [Self <: SchemaAsymmetricDecryptRequest](x: Self) {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32c(value: String): Self = StObject.set(x, "ciphertextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32cNull: Self = StObject.set(x, "ciphertextCrc32c", null)
    
    inline def setCiphertextCrc32cUndefined: Self = StObject.set(x, "ciphertextCrc32c", js.undefined)
    
    inline def setCiphertextNull: Self = StObject.set(x, "ciphertext", null)
    
    inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
  }
}
