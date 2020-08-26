package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetShowFPSCounterRequest extends js.Object {
  /**
    * True for showing the FPS counter
    */
  var show: Boolean = js.native
}

object SetShowFPSCounterRequest {
  @scala.inline
  def apply(show: Boolean): SetShowFPSCounterRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowFPSCounterRequest]
  }
  @scala.inline
  implicit class SetShowFPSCounterRequestOps[Self <: SetShowFPSCounterRequest] (val x: Self) extends AnyVal {
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
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

