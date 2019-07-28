package typings.electronDashWindowDashState.electronDashWindowDashStateMod.ElectronWindowStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowStateKeeperOptions extends js.Object {
  /*
  		 * The height that should be returned if no file exists yet. Defaults to 600.
  		 */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  /*
  		 * The width that should be returned if no file exists yet. Defaults to 800.
  		 */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  /*
  		 * The name of file. Defaults to window-state.json
  		 */
  var file: js.UndefOr[String] = js.undefined
  /*
  		 * Should we automatically restore the window to full screen,
  		 * if it was last closed full screen. Defaults to true
  		 */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /*
  		 * Should we automatically maximize the window,
  		 * if it was last closed maximized. Defaults to true
  		 */
  var maximize: js.UndefOr[Boolean] = js.undefined
  /*
  		 * The path where the state file should be written to.
  		 * Defaults to app.getPath('userData')
  		 */
  var path: js.UndefOr[String] = js.undefined
}

object WindowStateKeeperOptions {
  @scala.inline
  def apply(
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    file: String = null,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    maximize: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): WindowStateKeeperOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (!js.isUndefined(maximize)) __obj.updateDynamic("maximize")(maximize)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[WindowStateKeeperOptions]
  }
}

