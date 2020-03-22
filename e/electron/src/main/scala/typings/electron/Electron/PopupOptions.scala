package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  /**
    * Called when menu is closed.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The index of the menu item to be positioned under the mouse cursor at the
    * specified coordinates. Default is -1.
    *
    * @platform darwin
    */
  var positioningItem: js.UndefOr[Double] = js.undefined
  /**
    * Default is the focused window.
    */
  var window: js.UndefOr[BrowserWindow] = js.undefined
  /**
    * Default is the current mouse cursor position. Must be declared if `y` is
    * declared.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Default is the current mouse cursor position. Must be declared if `x` is
    * declared.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    positioningItem: Int | Double = null,
    window: BrowserWindow = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (positioningItem != null) __obj.updateDynamic("positioningItem")(positioningItem.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

