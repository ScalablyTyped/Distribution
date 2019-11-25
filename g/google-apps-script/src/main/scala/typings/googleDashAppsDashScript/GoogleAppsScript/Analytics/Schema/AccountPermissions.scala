package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}

object AccountPermissions {
  @scala.inline
  def apply(effective: js.Array[String] = null): AccountPermissions = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPermissions]
  }
}

