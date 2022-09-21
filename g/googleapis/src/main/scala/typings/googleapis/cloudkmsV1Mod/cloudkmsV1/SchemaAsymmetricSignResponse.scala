package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsymmetricSignResponse extends StObject {
  
  /**
    * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the intended resource was used for signing.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ProtectionLevel of the CryptoKeyVersion used for signing.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The created signature.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned AsymmetricSignResponse.signature. An integrity check of AsymmetricSignResponse.signature can be performed by computing the CRC32C checksum of AsymmetricSignResponse.signature and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var signatureCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether AsymmetricSignRequest.data_crc32c was received by KeyManagementService and used for the integrity verification of the data. A false value of this field indicates either that AsymmetricSignRequest.data_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set AsymmetricSignRequest.data_crc32c but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedDataCrc32c: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether AsymmetricSignRequest.digest_crc32c was received by KeyManagementService and used for the integrity verification of the digest. A false value of this field indicates either that AsymmetricSignRequest.digest_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set AsymmetricSignRequest.digest_crc32c but this field is still false, discard the response and perform a limited number of retries.
    */
  var verifiedDigestCrc32c: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAsymmetricSignResponse {
  
  inline def apply(): SchemaAsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignResponse]
  }
  
  extension [Self <: SchemaAsymmetricSignResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureCrc32c(value: String): Self = StObject.set(x, "signatureCrc32c", value.asInstanceOf[js.Any])
    
    inline def setSignatureCrc32cNull: Self = StObject.set(x, "signatureCrc32c", null)
    
    inline def setSignatureCrc32cUndefined: Self = StObject.set(x, "signatureCrc32c", js.undefined)
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setVerifiedDataCrc32c(value: Boolean): Self = StObject.set(x, "verifiedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedDataCrc32cNull: Self = StObject.set(x, "verifiedDataCrc32c", null)
    
    inline def setVerifiedDataCrc32cUndefined: Self = StObject.set(x, "verifiedDataCrc32c", js.undefined)
    
    inline def setVerifiedDigestCrc32c(value: Boolean): Self = StObject.set(x, "verifiedDigestCrc32c", value.asInstanceOf[js.Any])
    
    inline def setVerifiedDigestCrc32cNull: Self = StObject.set(x, "verifiedDigestCrc32c", null)
    
    inline def setVerifiedDigestCrc32cUndefined: Self = StObject.set(x, "verifiedDigestCrc32c", js.undefined)
  }
}
