package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait SchemaAsymmetricDecryptResponse extends StObject {
  
  /**
    * The decrypted data originally encrypted with the matching public key.
    */
  var plaintext: js.UndefOr[String] = js.native
}
object SchemaAsymmetricDecryptResponse {
  
  @scala.inline
  def apply(): SchemaAsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptResponse]
  }
  
  @scala.inline
  implicit class SchemaAsymmetricDecryptResponseMutableBuilder[Self <: SchemaAsymmetricDecryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
