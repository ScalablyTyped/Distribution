package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserVerifiedRequest extends js.Object {
  
  var authenticatorId: AuthenticatorId = js.native
  
  var isUserVerified: Boolean = js.native
}
object SetUserVerifiedRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, isUserVerified: Boolean): SetUserVerifiedRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], isUserVerified = isUserVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserVerifiedRequest]
  }
  
  @scala.inline
  implicit class SetUserVerifiedRequestOps[Self <: SetUserVerifiedRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthenticatorId(value: AuthenticatorId): Self = this.set("authenticatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserVerified(value: Boolean): Self = this.set("isUserVerified", value.asInstanceOf[js.Any])
  }
}
