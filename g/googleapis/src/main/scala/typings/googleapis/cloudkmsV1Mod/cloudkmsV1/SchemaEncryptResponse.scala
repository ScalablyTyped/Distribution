package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.Encrypt.
  */
@js.native
trait SchemaEncryptResponse extends StObject {
  
  /**
    * The encrypted data.
    */
  var ciphertext: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the CryptoKeyVersion used in encryption.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaEncryptResponse {
  
  @scala.inline
  def apply(): SchemaEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptResponse]
  }
  
  @scala.inline
  implicit class SchemaEncryptResponseMutableBuilder[Self <: SchemaEncryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
