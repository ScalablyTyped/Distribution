package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanEmulateNetworkConditionsResponse extends js.Object {
  /**
    * True if emulation of network conditions is supported.
    */
  var result: Boolean = js.native
}

object CanEmulateNetworkConditionsResponse {
  @scala.inline
  def apply(result: Boolean): CanEmulateNetworkConditionsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanEmulateNetworkConditionsResponse]
  }
  @scala.inline
  implicit class CanEmulateNetworkConditionsResponseOps[Self <: CanEmulateNetworkConditionsResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

