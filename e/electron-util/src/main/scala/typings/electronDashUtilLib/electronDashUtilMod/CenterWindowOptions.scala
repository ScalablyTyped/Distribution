package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterWindowOptions extends js.Object {
  /**
  	Animate the change.
  	@default false
  	*/
  val animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	Set a new window size.
  	Default: Size of `window`
  	@example
  	```
  	{width: 600, height: 400}
  	```
  	*/
  val size: js.UndefOr[electronLib.ElectronNs.Size] = js.undefined
  /**
  	The window to center.
  	Default: Current window
  	*/
  val window: js.UndefOr[electronLib.electronMod.BrowserWindow] = js.undefined
}

object CenterWindowOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    size: electronLib.ElectronNs.Size = null,
    window: electronLib.electronMod.BrowserWindow = null
  ): CenterWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (size != null) __obj.updateDynamic("size")(size)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[CenterWindowOptions]
  }
}

