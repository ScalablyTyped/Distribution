package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.Decrypt.
  */
trait SchemaDecryptResponse extends StObject {
  
  /**
    * The decrypted data originally supplied in EncryptRequest.plaintext.
    */
  var plaintext: js.UndefOr[String] = js.undefined
}
object SchemaDecryptResponse {
  
  inline def apply(): SchemaDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptResponse]
  }
  
  extension [Self <: SchemaDecryptResponse](x: Self) {
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
