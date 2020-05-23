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
    positioningItem: js.UndefOr[Double] = js.undefined,
    window: BrowserWindow = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(positioningItem)) __obj.updateDynamic("positioningItem")(positioningItem.get.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

