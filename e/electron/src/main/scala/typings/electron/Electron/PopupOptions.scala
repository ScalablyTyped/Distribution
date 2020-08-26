package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOptions extends js.Object {
  /**
    * Called when menu is closed.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The index of the menu item to be positioned under the mouse cursor at the
    * specified coordinates. Default is -1.
    *
    * @platform darwin
    */
  var positioningItem: js.UndefOr[Double] = js.native
  /**
    * Default is the focused window.
    */
  var window: js.UndefOr[BrowserWindow] = js.native
  /**
    * Default is the current mouse cursor position. Must be declared if `y` is
    * declared.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Default is the current mouse cursor position. Must be declared if `x` is
    * declared.
    */
  var y: js.UndefOr[Double] = js.native
}

object PopupOptions {
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  @scala.inline
  implicit class PopupOptionsOps[Self <: PopupOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setPositioningItem(value: Double): Self = this.set("positioningItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioningItem: Self = this.set("positioningItem", js.undefined)
    @scala.inline
    def setWindow(value: BrowserWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

