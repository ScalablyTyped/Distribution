package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.Decrypt.
  */
trait SchemaDecryptRequest extends StObject {
  
  /**
    * Optional data that must match the data originally supplied in
    * EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The encrypted data originally returned in
    * EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[String] = js.undefined
}
object SchemaDecryptRequest {
  
  @scala.inline
  def apply(): SchemaDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptRequest]
  }
  
  @scala.inline
  implicit class SchemaDecryptRequestMutableBuilder[Self <: SchemaDecryptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    @scala.inline
    def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
  }
}
