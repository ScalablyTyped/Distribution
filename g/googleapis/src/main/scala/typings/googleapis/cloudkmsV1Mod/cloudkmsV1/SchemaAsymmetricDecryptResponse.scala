package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.AsymmetricDecrypt.
  */
trait SchemaAsymmetricDecryptResponse extends StObject {
  
  /**
    * The decrypted data originally encrypted with the matching public key.
    */
  var plaintext: js.UndefOr[String] = js.undefined
}
object SchemaAsymmetricDecryptResponse {
  
  inline def apply(): SchemaAsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptResponse]
  }
  
  extension [Self <: SchemaAsymmetricDecryptResponse](x: Self) {
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
