package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceRecentUsers extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceRecentUsers {
  @scala.inline
  def apply(email: String = null, `type`: String = null): ChromeOsDeviceRecentUsers = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChromeOsDeviceRecentUsers]
  }
}

