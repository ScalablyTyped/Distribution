package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveVirtualAuthenticatorRequest extends js.Object {
  var authenticatorId: AuthenticatorId = js.native
}

object RemoveVirtualAuthenticatorRequest {
  @scala.inline
  def apply(authenticatorId: AuthenticatorId): RemoveVirtualAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveVirtualAuthenticatorRequest]
  }
  @scala.inline
  implicit class RemoveVirtualAuthenticatorRequestOps[Self <: RemoveVirtualAuthenticatorRequest] (val x: Self) extends AnyVal {
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
  }
  
}

