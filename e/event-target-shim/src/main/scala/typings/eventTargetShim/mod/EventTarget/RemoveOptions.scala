package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveOptions extends js.Object {
  /**
    * The flag to indicate that the listener is for the capturing phase.
    */
  var capture: js.UndefOr[Boolean] = js.native
}

object RemoveOptions {
  @scala.inline
  def apply(): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOptions]
  }
  @scala.inline
  implicit class RemoveOptionsOps[Self <: RemoveOptions] (val x: Self) extends AnyVal {
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
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
  }
  
}

