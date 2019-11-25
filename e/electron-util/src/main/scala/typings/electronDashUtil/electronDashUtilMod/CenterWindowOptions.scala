package typings.electronDashUtil.electronDashUtilMod

import typings.electron.Electron.Size
import typings.electron.electronMod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterWindowOptions extends js.Object {
  /**
  	Animate the change.
  	@default false
  	*/
  val animated: js.UndefOr[Boolean] = js.undefined
  /**
  	Set a new window size.
  	Default: Size of `window`
  	@example
  	```
  	{width: 600, height: 400}
  	```
  	*/
  val size: js.UndefOr[Size] = js.undefined
  /**
  	The window to center.
  	Default: Current window
  	*/
  val window: js.UndefOr[BrowserWindow] = js.undefined
}

object CenterWindowOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, size: Size = null, window: BrowserWindow = null): CenterWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterWindowOptions]
  }
}

