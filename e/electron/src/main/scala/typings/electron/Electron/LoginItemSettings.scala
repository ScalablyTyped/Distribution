package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemSettings extends js.Object {
  /**
    * `true` if the app is set to open as hidden at login. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: Boolean
  /**
    * `true` if the app is set to open at login.
    */
  var openAtLogin: Boolean
  /**
    * `true` if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on MAS builds.
    *
    * @platform darwin
    */
  var restoreState: Boolean
  /**
    * `true` if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on MAS
    * builds.
    *
    * @platform darwin
    */
  var wasOpenedAsHidden: Boolean
  /**
    * `true` if the app was opened at login automatically. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var wasOpenedAtLogin: Boolean
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
}

