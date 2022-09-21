package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMacVerifyRequest extends StObject {
  
  /**
    * Required. The data used previously as a MacSignRequest.data to generate the MAC tag.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the MacVerifyRequest.data. If specified, KeyManagementService will verify the integrity of the received MacVerifyRequest.data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(MacVerifyRequest.data) is equal to MacVerifyRequest.data_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var dataCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The signature to verify.
    */
  var mac: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the MacVerifyRequest.mac. If specified, KeyManagementService will verify the integrity of the received MacVerifyRequest.mac using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that CRC32C(MacVerifyRequest.tag) is equal to MacVerifyRequest.mac_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var macCrc32c: js.UndefOr[String | Null] = js.undefined
}
object SchemaMacVerifyRequest {
  
  inline def apply(): SchemaMacVerifyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMacVerifyRequest]
  }
  
  extension [Self <: SchemaMacVerifyRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32c(value: String): Self = StObject.set(x, "dataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setDataCrc32cNull: Self = StObject.set(x, "dataCrc32c", null)
    
    inline def setDataCrc32cUndefined: Self = StObject.set(x, "dataCrc32c", js.undefined)
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacCrc32c(value: String): Self = StObject.set(x, "macCrc32c", value.asInstanceOf[js.Any])
    
    inline def setMacCrc32cNull: Self = StObject.set(x, "macCrc32c", null)
    
    inline def setMacCrc32cUndefined: Self = StObject.set(x, "macCrc32c", js.undefined)
    
    inline def setMacNull: Self = StObject.set(x, "mac", null)
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
  }
}
