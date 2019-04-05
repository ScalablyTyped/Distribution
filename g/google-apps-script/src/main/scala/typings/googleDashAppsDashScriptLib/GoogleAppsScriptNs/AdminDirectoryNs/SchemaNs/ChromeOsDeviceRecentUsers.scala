package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceRecentUsers extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceRecentUsers {
  @scala.inline
  def apply(email: java.lang.String = null, `type`: java.lang.String = null): ChromeOsDeviceRecentUsers = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChromeOsDeviceRecentUsers]
  }
}

