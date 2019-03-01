package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemSettings extends js.Object {
  /**
    * true if the app is set to open as hidden at login. This setting is not available
    * on .
    */
  var openAsHidden: scala.Boolean
  /**
    * true if the app is set to open at login.
    */
  var openAtLogin: scala.Boolean
  var options: js.UndefOr[Options] = js.undefined
  /**
    * true if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on .
    */
  var restoreState: scala.Boolean
  /**
    * true if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on .
    */
  var wasOpenedAsHidden: scala.Boolean
  /**
    * true if the app was opened at login automatically. This setting is not available
    * on .
    */
  var wasOpenedAtLogin: scala.Boolean
}

object LoginItemSettings {
  @scala.inline
  def apply(
    openAsHidden: scala.Boolean,
    openAtLogin: scala.Boolean,
    restoreState: scala.Boolean,
    wasOpenedAsHidden: scala.Boolean,
    wasOpenedAtLogin: scala.Boolean,
    options: Options = null
  ): LoginItemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openAsHidden")(openAsHidden)
    __obj.updateDynamic("openAtLogin")(openAtLogin)
    __obj.updateDynamic("restoreState")(restoreState)
    __obj.updateDynamic("wasOpenedAsHidden")(wasOpenedAsHidden)
    __obj.updateDynamic("wasOpenedAtLogin")(wasOpenedAtLogin)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LoginItemSettings]
  }
}

