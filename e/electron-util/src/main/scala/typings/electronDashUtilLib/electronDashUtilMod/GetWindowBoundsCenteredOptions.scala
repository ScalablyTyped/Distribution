package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWindowBoundsCenteredOptions extends js.Object {
  /**
  	 * Set a new window size.
  	 *
  	 * Default: Size of `window`
  	 *
  	 * @example
  	 *
  	 * {width: 600, height: 400}
  	 */
  val size: js.UndefOr[electronLib.ElectronNs.Size] = js.undefined
  /**
  	 * The window to get the bounds of.
  	 *
  	 * Default: Current window
  	 */
  val window: js.UndefOr[electronLib.electronMod.BrowserWindow] = js.undefined
}

object GetWindowBoundsCenteredOptions {
  @scala.inline
  def apply(size: electronLib.ElectronNs.Size = null, window: electronLib.electronMod.BrowserWindow = null): GetWindowBoundsCenteredOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
  }
}

