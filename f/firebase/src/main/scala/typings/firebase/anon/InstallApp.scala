package typings.firebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallApp extends js.Object {
  var installApp: js.UndefOr[Boolean] = js.undefined
  var minimumVersion: js.UndefOr[String] = js.undefined
  var packageName: String
}

object InstallApp {
  @scala.inline
  def apply(packageName: String, installApp: js.UndefOr[Boolean] = js.undefined, minimumVersion: String = null): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp.get.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
}

