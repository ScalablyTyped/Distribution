package typings.googleOneTap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialResponse extends js.Object {
  
  var client_id: String = js.native
  
  var credential: String = js.native
  
  var select_by: String = js.native
}
object CredentialResponse {
  
  @scala.inline
  def apply(client_id: String, credential: String, select_by: String): CredentialResponse = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialResponse]
  }
  
  @scala.inline
  implicit class CredentialResponseOps[Self <: CredentialResponse] (val x: Self) extends AnyVal {
    
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential(value: String): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect_by(value: String): Self = this.set("select_by", value.asInstanceOf[js.Any])
  }
}
