package typings
package detoxLib.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeviceLanchAppConfig extends js.Object {
  /**
               * Launch into a fresh installation
               * A flag that enables relaunching into a fresh installation of the app (it will uninstall and install the binary again), default is false.
               */
  var delete: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Launch config for specifying the native language and locale
               */
  var languageAndLocale: js.UndefOr[LanguageAndLocale] = js.undefined
  /**
               * Detox can start the app with additional launch arguments
               * The added launchArgs will be passed through the launch command to the device and be accessible via [[NSProcessInfo processInfo] arguments]
               */
  var launchArgs: js.UndefOr[js.Any] = js.undefined
  /**
               * Restart the app
               * Terminate the app and launch it again. If set to false, the simulator will try to bring app from background, if the app isn't running, it will launch a new instance. default is false
               */
  var newInstance: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Set runtime permissions
               * Grant or deny runtime permissions for your application.
               */
  var permissions: js.UndefOr[js.Any] = js.undefined
  /**
               * Launch from URL
               * Mock opening the app from URL to test your app's deep link handling mechanism.
               */
  var url: js.UndefOr[js.Any] = js.undefined
  /**
               * Launch with user activity
               */
  var userActivity: js.UndefOr[js.Any] = js.undefined
  /**
               * Launch with user notifications
               */
  var userNotification: js.UndefOr[js.Any] = js.undefined
}

