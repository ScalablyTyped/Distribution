package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  /**
    * The window height in pixels.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * The offset from the left edge of the screen to the window in pixels.
    */
  var left: js.UndefOr[integer] = js.native
  /**
    * The offset from the top edge of the screen to the window in pixels.
    */
  var top: js.UndefOr[integer] = js.native
  /**
    * The window width in pixels.
    */
  var width: js.UndefOr[integer] = js.native
  /**
    * The window state. Default to normal.
    */
  var windowState: js.UndefOr[WindowState] = js.native
}

object Bounds {
  @scala.inline
  def apply(): Bounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
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
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: integer): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setTop(value: integer): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowState(value: WindowState): Self = this.set("windowState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowState: Self = this.set("windowState", js.undefined)
  }
  
}

