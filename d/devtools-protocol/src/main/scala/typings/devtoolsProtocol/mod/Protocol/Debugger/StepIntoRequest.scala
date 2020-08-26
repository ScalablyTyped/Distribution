package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepIntoRequest extends js.Object {
  /**
    * Debugger will pause on the execution of the first async task which was scheduled
    * before next pause.
    */
  var breakOnAsyncCall: js.UndefOr[Boolean] = js.native
}

object StepIntoRequest {
  @scala.inline
  def apply(): StepIntoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepIntoRequest]
  }
  @scala.inline
  implicit class StepIntoRequestOps[Self <: StepIntoRequest] (val x: Self) extends AnyVal {
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
    def setBreakOnAsyncCall(value: Boolean): Self = this.set("breakOnAsyncCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakOnAsyncCall: Self = this.set("breakOnAsyncCall", js.undefined)
  }
  
}

