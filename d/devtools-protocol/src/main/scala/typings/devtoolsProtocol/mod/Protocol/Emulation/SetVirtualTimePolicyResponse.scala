package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVirtualTimePolicyResponse extends js.Object {
  /**
    * Absolute timestamp at which virtual time was first enabled (up time in milliseconds).
    */
  var virtualTimeTicksBase: Double = js.native
}

object SetVirtualTimePolicyResponse {
  @scala.inline
  def apply(virtualTimeTicksBase: Double): SetVirtualTimePolicyResponse = {
    val __obj = js.Dynamic.literal(virtualTimeTicksBase = virtualTimeTicksBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVirtualTimePolicyResponse]
  }
  @scala.inline
  implicit class SetVirtualTimePolicyResponseOps[Self <: SetVirtualTimePolicyResponse] (val x: Self) extends AnyVal {
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
    def setVirtualTimeTicksBase(value: Double): Self = this.set("virtualTimeTicksBase", value.asInstanceOf[js.Any])
  }
  
}

