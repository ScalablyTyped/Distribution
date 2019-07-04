package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstallApp extends js.Object {
  /**
    * Whether to install the Android app if the device supports it and the app is
    * not already installed.
    */
  var installApp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Android minimum version if available. If the installed app is an older
    * version, the user is taken to the GOogle Play Store to upgrade the app.
    */
  var minimumVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the required Android package name of the app where the link should be
    * handled if the Android app is installed.
    */
  var packageName: java.lang.String
}

object Anon_InstallApp {
  @scala.inline
  def apply(
    packageName: java.lang.String,
    installApp: js.UndefOr[scala.Boolean] = js.undefined,
    minimumVersion: java.lang.String = null
  ): Anon_InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName)
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    __obj.asInstanceOf[Anon_InstallApp]
  }
}

