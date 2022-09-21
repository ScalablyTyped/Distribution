package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsymmetricSignRequest extends StObject {
  
  /**
    * Optional. The data to sign. It can't be supplied if AsymmetricSignRequest.digest is supplied.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.data. If specified, KeyManagementService will verify the integrity of the received AsymmetricSignRequest.data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(AsymmetricSignRequest.data) is equal to AsymmetricSignRequest.data_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var dataCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The digest of the data to sign. The digest must be produced with the same digest algorithm as specified by the key version's algorithm. This field may not be supplied if AsymmetricSignRequest.data is supplied.
    */
  var digest: js.UndefOr[SchemaDigest] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified, KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var digestCrc32c: js.UndefOr[String | Null] = js.undefined
}
object SchemaAsymmetricSignRequest {
  
  inline def apply(): SchemaAsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignRequest]
  }
  
  extension [Self <: SchemaAsymmetricSignRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32c(value: String): Self = StObject.set(x, "dataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32cNull: Self = StObject.set(x, "dataCrc32c", null)
    
    inline def setDataCrc32cUndefined: Self = StObject.set(x, "dataCrc32c", js.undefined)
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDigest(value: SchemaDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestCrc32c(value: String): Self = StObject.set(x, "digestCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDigestCrc32cNull: Self = StObject.set(x, "digestCrc32c", null)
    
    inline def setDigestCrc32cUndefined: Self = StObject.set(x, "digestCrc32c", js.undefined)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
