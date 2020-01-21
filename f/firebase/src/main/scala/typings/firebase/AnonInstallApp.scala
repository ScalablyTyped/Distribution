package typings.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstallApp extends js.Object {
  var installApp: js.UndefOr[Boolean] = js.undefined
  var minimumVersion: js.UndefOr[String] = js.undefined
  var packageName: String
}

object AnonInstallApp {
  @scala.inline
  def apply(packageName: String, installApp: js.UndefOr[Boolean] = js.undefined, minimumVersion: String = null): AnonInstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstallApp]
  }
}

