package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCredentialRequest extends js.Object {
  var authenticatorId: AuthenticatorId = js.native
  var credential: Credential = js.native
}

object AddCredentialRequest {
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, credential: Credential): AddCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCredentialRequest]
  }
  @scala.inline
  implicit class AddCredentialRequestOps[Self <: AddCredentialRequest] (val x: Self) extends AnyVal {
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
    def setCredential(value: Credential): Self = this.set("credential", value.asInstanceOf[js.Any])
  }
  
}

