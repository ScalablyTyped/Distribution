package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginItemSettings extends js.Object {
  /**
    * `true` if the app is set to open as hidden at login. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: Boolean = js.native
  /**
    * `true` if the app is set to open at login.
    */
  var openAtLogin: Boolean = js.native
  /**
    * `true` if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on MAS builds.
    *
    * @platform darwin
    */
  var restoreState: Boolean = js.native
  /**
    * `true` if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on MAS
    * builds.
    *
    * @platform darwin
    */
  var wasOpenedAsHidden: Boolean = js.native
  /**
    * `true` if the app was opened at login automatically. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var wasOpenedAtLogin: Boolean = js.native
}

object LoginItemSettings {
  @scala.inline
  def apply(
    openAsHidden: Boolean,
    openAtLogin: Boolean,
    restoreState: Boolean,
    wasOpenedAsHidden: Boolean,
    wasOpenedAtLogin: Boolean
  ): LoginItemSettings = {
    val __obj = js.Dynamic.literal(openAsHidden = openAsHidden.asInstanceOf[js.Any], openAtLogin = openAtLogin.asInstanceOf[js.Any], restoreState = restoreState.asInstanceOf[js.Any], wasOpenedAsHidden = wasOpenedAsHidden.asInstanceOf[js.Any], wasOpenedAtLogin = wasOpenedAtLogin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemSettings]
  }
  @scala.inline
  implicit class LoginItemSettingsOps[Self <: LoginItemSettings] (val x: Self) extends AnyVal {
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
    def setOpenAsHidden(value: Boolean): Self = this.set("openAsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenAtLogin(value: Boolean): Self = this.set("openAtLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestoreState(value: Boolean): Self = this.set("restoreState", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasOpenedAsHidden(value: Boolean): Self = this.set("wasOpenedAsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasOpenedAtLogin(value: Boolean): Self = this.set("wasOpenedAtLogin", value.asInstanceOf[js.Any])
  }
  
}

