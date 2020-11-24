package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.Encrypt.
  */
@js.native
trait SchemaEncryptRequest extends js.Object {
  
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  The maximum size
    * depends on the key version&#39;s protection_level. For SOFTWARE keys, the
    * AAD must be no larger than 64KiB. For HSM keys, the combined length of
    * the plaintext and additional_authenticated_data fields must be no larger
    * than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB.  The maximum
    * size depends on the key version&#39;s protection_level. For SOFTWARE
    * keys, the plaintext must be no larger than 64KiB. For HSM keys, the
    * combined length of the plaintext and additional_authenticated_data fields
    * must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.native
}
object SchemaEncryptRequest {
  
  @scala.inline
  def apply(): SchemaEncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptRequest]
  }
  
  @scala.inline
  implicit class SchemaEncryptRequestOps[Self <: SchemaEncryptRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalAuthenticatedData(value: String): Self = this.set("additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticatedData: Self = this.set("additionalAuthenticatedData", js.undefined)
    
    @scala.inline
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
  }
}
