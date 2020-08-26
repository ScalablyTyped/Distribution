package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSkipAllPausesRequest extends js.Object {
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean = js.native
}

object SetSkipAllPausesRequest {
  @scala.inline
  def apply(skip: Boolean): SetSkipAllPausesRequest = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSkipAllPausesRequest]
  }
  @scala.inline
  implicit class SetSkipAllPausesRequestOps[Self <: SetSkipAllPausesRequest] (val x: Self) extends AnyVal {
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
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
  
}

