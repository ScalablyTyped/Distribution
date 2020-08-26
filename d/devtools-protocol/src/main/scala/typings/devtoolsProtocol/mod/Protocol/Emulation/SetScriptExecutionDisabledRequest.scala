package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetScriptExecutionDisabledRequest extends js.Object {
  /**
    * Whether script execution should be disabled in the page.
    */
  var value: Boolean = js.native
}

object SetScriptExecutionDisabledRequest {
  @scala.inline
  def apply(value: Boolean): SetScriptExecutionDisabledRequest = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptExecutionDisabledRequest]
  }
  @scala.inline
  implicit class SetScriptExecutionDisabledRequestOps[Self <: SetScriptExecutionDisabledRequest] (val x: Self) extends AnyVal {
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
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

