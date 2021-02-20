package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait SchemaAsymmetricDecryptRequest extends StObject {
  
  /**
    * Required. The data encrypted with the named CryptoKeyVersion&#39;s public
    * key using OAEP.
    */
  var ciphertext: js.UndefOr[String] = js.native
}
object SchemaAsymmetricDecryptRequest {
  
  @scala.inline
  def apply(): SchemaAsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptRequest]
  }
  
  @scala.inline
  implicit class SchemaAsymmetricDecryptRequestMutableBuilder[Self <: SchemaAsymmetricDecryptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
  }
}
