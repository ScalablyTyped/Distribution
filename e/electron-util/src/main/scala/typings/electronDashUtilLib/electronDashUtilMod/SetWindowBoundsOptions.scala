package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWindowBoundsOptions extends js.Object {
  /**
  	 * Animate the change.
  	 *
  	 * @default false
  	 */
  val animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The window to set the bounds of.
  	 *
  	 * Default: Current window
  	 */
  val window: js.UndefOr[electronLib.electronMod.BrowserWindow] = js.undefined
}

object SetWindowBoundsOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    window: electronLib.electronMod.BrowserWindow = null
  ): SetWindowBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[SetWindowBoundsOptions]
  }
}

