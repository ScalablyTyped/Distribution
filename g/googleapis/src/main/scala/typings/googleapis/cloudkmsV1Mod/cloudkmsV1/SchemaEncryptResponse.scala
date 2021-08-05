package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.Encrypt.
  */
trait SchemaEncryptResponse extends StObject {
  
  /**
    * The encrypted data.
    */
  var ciphertext: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the CryptoKeyVersion used in encryption.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaEncryptResponse {
  
  inline def apply(): SchemaEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptResponse]
  }
  
  extension [Self <: SchemaEncryptResponse](x: Self) {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
