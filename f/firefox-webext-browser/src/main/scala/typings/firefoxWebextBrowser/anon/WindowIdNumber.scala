package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowIdNumber extends js.Object {
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double = js.native
}

object WindowIdNumber {
  @scala.inline
  def apply(windowId: Double): WindowIdNumber = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowIdNumber]
  }
  @scala.inline
  implicit class WindowIdNumberOps[Self <: WindowIdNumber] (val x: Self) extends AnyVal {
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
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
  
}

