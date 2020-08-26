package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetShowViewportSizeOnResizeRequest extends js.Object {
  /**
    * Whether to paint size or not.
    */
  var show: Boolean = js.native
}

object SetShowViewportSizeOnResizeRequest {
  @scala.inline
  def apply(show: Boolean): SetShowViewportSizeOnResizeRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowViewportSizeOnResizeRequest]
  }
  @scala.inline
  implicit class SetShowViewportSizeOnResizeRequestOps[Self <: SetShowViewportSizeOnResizeRequest] (val x: Self) extends AnyVal {
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

