package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  /**
    * The command-line arguments to pass to the executable. Defaults to an empty
    * array. Take care to wrap paths in quotes.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * `true` to open the app as hidden. Defaults to `false`. The user can edit this
    * setting from the System Preferences so
    * `app.getLoginItemSettings().wasOpenedAsHidden` should be checked when the app is
    * opened to know the current value. This setting is not available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: js.UndefOr[Boolean] = js.native
  /**
    * `true` to open the app at login, `false` to remove the app as a login item.
    * Defaults to `false`.
    */
  var openAtLogin: js.UndefOr[Boolean] = js.native
  /**
    * The executable to launch at login. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setOpenAsHidden(value: Boolean): Self = this.set("openAsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAsHidden: Self = this.set("openAsHidden", js.undefined)
    @scala.inline
    def setOpenAtLogin(value: Boolean): Self = this.set("openAtLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAtLogin: Self = this.set("openAtLogin", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

