package typings.electronDashUtil.electronDashUtilMod

import typings.electron.ElectronNs.Size
import typings.electron.electronMod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWindowBoundsCenteredOptions extends js.Object {
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
  	The window to get the bounds of.
  	Default: Current window
  	*/
  val window: js.UndefOr[BrowserWindow] = js.undefined
}

object GetWindowBoundsCenteredOptions {
  @scala.inline
  def apply(size: Size = null, window: BrowserWindow = null): GetWindowBoundsCenteredOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
  }
}

