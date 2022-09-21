package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDecryptRequest extends StObject {
  
  /**
    * Optional. Optional data that must match the data originally supplied in EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the DecryptRequest.additional_authenticated_data. If specified, KeyManagementService will verify the integrity of the received DecryptRequest.additional_authenticated_data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(DecryptRequest.additional_authenticated_data) is equal to DecryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var additionalAuthenticatedDataCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the DecryptRequest.ciphertext. If specified, KeyManagementService will verify the integrity of the received DecryptRequest.ciphertext using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(DecryptRequest.ciphertext) is equal to DecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var ciphertextCrc32c: js.UndefOr[String | Null] = js.undefined
}
object SchemaDecryptRequest {
  
  inline def apply(): SchemaDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptRequest]
  }
  
  extension [Self <: SchemaDecryptRequest](x: Self) {
    
    inline def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataCrc32c(value: String): Self = StObject.set(x, "additionalAuthenticatedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataCrc32cNull: Self = StObject.set(x, "additionalAuthenticatedDataCrc32c", null)
    
    inline def setAdditionalAuthenticatedDataCrc32cUndefined: Self = StObject.set(x, "additionalAuthenticatedDataCrc32c", js.undefined)
    
    inline def setAdditionalAuthenticatedDataNull: Self = StObject.set(x, "additionalAuthenticatedData", null)
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32c(value: String): Self = StObject.set(x, "ciphertextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setCiphertextCrc32cNull: Self = StObject.set(x, "ciphertextCrc32c", null)
    
    inline def setCiphertextCrc32cUndefined: Self = StObject.set(x, "ciphertextCrc32c", js.undefined)
    
    inline def setCiphertextNull: Self = StObject.set(x, "ciphertext", null)
    
    inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
  }
}
