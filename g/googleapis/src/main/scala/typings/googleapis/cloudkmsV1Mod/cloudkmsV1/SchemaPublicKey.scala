package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublicKey extends StObject {
  
  /**
    * The Algorithm associated with this key.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the CryptoKeyVersion public key. Provided here for verification. NOTE: This field is in Beta.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned PublicKey.pem. An integrity check of PublicKey.pem can be performed by computing the CRC32C checksum of PublicKey.pem and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var pemCrc32c: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ProtectionLevel of the CryptoKeyVersion public key.
    */
  var protectionLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublicKey {
  
  inline def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  
  extension [Self <: SchemaPublicKey](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemCrc32c(value: String): Self = StObject.set(x, "pemCrc32c", value.asInstanceOf[js.Any])
    
    inline def setPemCrc32cNull: Self = StObject.set(x, "pemCrc32c", null)
    
    inline def setPemCrc32cUndefined: Self = StObject.set(x, "pemCrc32c", js.undefined)
    
    inline def setPemNull: Self = StObject.set(x, "pem", null)
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
    
    inline def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevelNull: Self = StObject.set(x, "protectionLevel", null)
    
    inline def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
  }
}
