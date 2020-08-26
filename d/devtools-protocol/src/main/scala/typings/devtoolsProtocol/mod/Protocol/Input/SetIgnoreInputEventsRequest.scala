package typings.devtoolsProtocol.mod.Protocol.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIgnoreInputEventsRequest extends js.Object {
  /**
    * Ignores input events processing when set to true.
    */
  var ignore: Boolean = js.native
}

object SetIgnoreInputEventsRequest {
  @scala.inline
  def apply(ignore: Boolean): SetIgnoreInputEventsRequest = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIgnoreInputEventsRequest]
  }
  @scala.inline
  implicit class SetIgnoreInputEventsRequestOps[Self <: SetIgnoreInputEventsRequest] (val x: Self) extends AnyVal {
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
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
  }
  
}

