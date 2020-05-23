package typings.electronWindowState.mod.ElectronWindowState

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
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    file: String = null,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    maximize: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): WindowStateKeeperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximize)) __obj.updateDynamic("maximize")(maximize.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowStateKeeperOptions]
  }
}

