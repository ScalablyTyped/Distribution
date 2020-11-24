package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsResponse extends js.Object {
  
  var credentials: js.Array[Credential] = js.native
}
object GetCredentialsResponse {
  
  @scala.inline
  def apply(credentials: js.Array[Credential]): GetCredentialsResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResponse]
  }
  
  @scala.inline
  implicit class GetCredentialsResponseOps[Self <: GetCredentialsResponse] (val x: Self) extends AnyVal {
    
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
    def setCredentialsVarargs(value: Credential*): Self = this.set("credentials", js.Array(value :_*))
    
    @scala.inline
    def setCredentials(value: js.Array[Credential]): Self = this.set("credentials", value.asInstanceOf[js.Any])
  }
}
