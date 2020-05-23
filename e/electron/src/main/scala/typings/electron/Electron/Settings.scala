package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * The command-line arguments to pass to the executable. Defaults to an empty
    * array. Take care to wrap paths in quotes.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * `true` to open the app as hidden. Defaults to `false`. The user can edit this
    * setting from the System Preferences so
    * `app.getLoginItemSettings().wasOpenedAsHidden` should be checked when the app is
    * opened to know the current value. This setting is not available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * `true` to open the app at login, `false` to remove the app as a login item.
    * Defaults to `false`.
    */
  var openAtLogin: js.UndefOr[Boolean] = js.undefined
  /**
    * The executable to launch at login. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    openAsHidden: js.UndefOr[Boolean] = js.undefined,
    openAtLogin: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(openAsHidden)) __obj.updateDynamic("openAsHidden")(openAsHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openAtLogin)) __obj.updateDynamic("openAtLogin")(openAtLogin.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

