package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  /**
    * Called when menu is closed.
    */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The index of the menu item to be positioned under the mouse cursor at the
    * specified coordinates. Default is -1.
    */
  var positioningItem: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default is the focused window.
    */
  var window: js.UndefOr[BrowserWindow] = js.undefined
  /**
    * Default is the current mouse cursor position. Must be declared if y is declared.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default is the current mouse cursor position. Must be declared if x is declared.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    callback: js.Function0[scala.Unit] = null,
    positioningItem: scala.Int | scala.Double = null,
    window: BrowserWindow = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (positioningItem != null) __obj.updateDynamic("positioningItem")(positioningItem.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

