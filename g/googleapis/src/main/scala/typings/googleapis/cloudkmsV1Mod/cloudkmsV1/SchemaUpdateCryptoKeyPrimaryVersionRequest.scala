package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateCryptoKeyPrimaryVersionRequest extends StObject {
  
  /**
    * Required. The id of the child CryptoKeyVersion to use as primary.
    */
  var cryptoKeyVersionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateCryptoKeyPrimaryVersionRequest {
  
  inline def apply(): SchemaUpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCryptoKeyPrimaryVersionRequest]
  }
  
  extension [Self <: SchemaUpdateCryptoKeyPrimaryVersionRequest](x: Self) {
    
    inline def setCryptoKeyVersionId(value: String): Self = StObject.set(x, "cryptoKeyVersionId", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyVersionIdNull: Self = StObject.set(x, "cryptoKeyVersionId", null)
    
    inline def setCryptoKeyVersionIdUndefined: Self = StObject.set(x, "cryptoKeyVersionId", js.undefined)
  }
}
