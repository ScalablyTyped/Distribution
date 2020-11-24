package typings.googleAuthLibrary.googleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignBlobResponse extends js.Object {
  
  var keyId: String = js.native
  
  var signedBlob: String = js.native
}
object SignBlobResponse {
  
  @scala.inline
  def apply(keyId: String, signedBlob: String): SignBlobResponse = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], signedBlob = signedBlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignBlobResponse]
  }
  
  @scala.inline
  implicit class SignBlobResponseOps[Self <: SignBlobResponse] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedBlob(value: String): Self = this.set("signedBlob", value.asInstanceOf[js.Any])
  }
}
