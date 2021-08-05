package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.Encrypt.
  */
trait SchemaEncryptRequest extends StObject {
  
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  The maximum size
    * depends on the key version&#39;s protection_level. For SOFTWARE keys, the
    * AAD must be no larger than 64KiB. For HSM keys, the combined length of
    * the plaintext and additional_authenticated_data fields must be no larger
    * than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB.  The maximum
    * size depends on the key version&#39;s protection_level. For SOFTWARE
    * keys, the plaintext must be no larger than 64KiB. For HSM keys, the
    * combined length of the plaintext and additional_authenticated_data fields
    * must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.undefined
}
object SchemaEncryptRequest {
  
  inline def apply(): SchemaEncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptRequest]
  }
  
  extension [Self <: SchemaEncryptRequest](x: Self) {
    
    inline def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
