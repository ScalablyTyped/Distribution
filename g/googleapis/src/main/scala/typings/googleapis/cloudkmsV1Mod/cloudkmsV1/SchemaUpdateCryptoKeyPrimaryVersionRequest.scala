package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.UpdateCryptoKeyPrimaryVersion.
  */
trait SchemaUpdateCryptoKeyPrimaryVersionRequest extends StObject {
  
  /**
    * The id of the child CryptoKeyVersion to use as primary.
    */
  var cryptoKeyVersionId: js.UndefOr[String] = js.undefined
}
object SchemaUpdateCryptoKeyPrimaryVersionRequest {
  
  @scala.inline
  def apply(): SchemaUpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCryptoKeyPrimaryVersionRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateCryptoKeyPrimaryVersionRequestMutableBuilder[Self <: SchemaUpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKeyVersionId(value: String): Self = StObject.set(x, "cryptoKeyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyVersionIdUndefined: Self = StObject.set(x, "cryptoKeyVersionId", js.undefined)
  }
}
