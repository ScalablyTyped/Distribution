package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemSettings extends js.Object {
  /**
    * true if the app is set to open as hidden at login. This setting is not available
    * on .
    */
  var openAsHidden: Boolean
  /**
    * true if the app is set to open at login.
    */
  var openAtLogin: Boolean
  var options: js.UndefOr[Options] = js.undefined
  /**
    * true if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on .
    */
  var restoreState: Boolean
  /**
    * true if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on .
    */
  var wasOpenedAsHidden: Boolean
  /**
    * true if the app was opened at login automatically. This setting is not available
    * on .
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
    wasOpenedAtLogin: Boolean,
    options: Options = null
  ): LoginItemSettings = {
    val __obj = js.Dynamic.literal(openAsHidden = openAsHidden, openAtLogin = openAtLogin, restoreState = restoreState, wasOpenedAsHidden = wasOpenedAsHidden, wasOpenedAtLogin = wasOpenedAtLogin)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LoginItemSettings]
  }
}

