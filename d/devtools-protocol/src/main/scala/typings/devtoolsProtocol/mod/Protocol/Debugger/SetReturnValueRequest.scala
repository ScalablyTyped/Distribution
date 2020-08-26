package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetReturnValueRequest extends js.Object {
  /**
    * New return value.
    */
  var newValue: CallArgument = js.native
}

object SetReturnValueRequest {
  @scala.inline
  def apply(newValue: CallArgument): SetReturnValueRequest = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReturnValueRequest]
  }
  @scala.inline
  implicit class SetReturnValueRequestOps[Self <: SetReturnValueRequest] (val x: Self) extends AnyVal {
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
    def setNewValue(value: CallArgument): Self = this.set("newValue", value.asInstanceOf[js.Any])
  }
  
}

