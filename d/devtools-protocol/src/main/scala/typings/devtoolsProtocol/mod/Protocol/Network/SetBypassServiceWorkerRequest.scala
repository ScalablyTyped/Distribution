package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBypassServiceWorkerRequest extends js.Object {
  /**
    * Bypass service worker and load from network.
    */
  var bypass: Boolean = js.native
}

object SetBypassServiceWorkerRequest {
  @scala.inline
  def apply(bypass: Boolean): SetBypassServiceWorkerRequest = {
    val __obj = js.Dynamic.literal(bypass = bypass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBypassServiceWorkerRequest]
  }
  @scala.inline
  implicit class SetBypassServiceWorkerRequestOps[Self <: SetBypassServiceWorkerRequest] (val x: Self) extends AnyVal {
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
    def setBypass(value: Boolean): Self = this.set("bypass", value.asInstanceOf[js.Any])
  }
  
}

