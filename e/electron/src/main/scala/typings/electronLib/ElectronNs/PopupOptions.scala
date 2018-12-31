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

