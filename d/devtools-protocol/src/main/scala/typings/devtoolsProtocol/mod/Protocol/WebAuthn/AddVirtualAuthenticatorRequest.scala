package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddVirtualAuthenticatorRequest extends js.Object {
  var options: VirtualAuthenticatorOptions = js.native
}

object AddVirtualAuthenticatorRequest {
  @scala.inline
  def apply(options: VirtualAuthenticatorOptions): AddVirtualAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddVirtualAuthenticatorRequest]
  }
  @scala.inline
  implicit class AddVirtualAuthenticatorRequestOps[Self <: AddVirtualAuthenticatorRequest] (val x: Self) extends AnyVal {
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
    def setOptions(value: VirtualAuthenticatorOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

