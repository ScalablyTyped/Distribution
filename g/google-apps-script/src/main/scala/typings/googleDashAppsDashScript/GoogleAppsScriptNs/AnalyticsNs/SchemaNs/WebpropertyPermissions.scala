package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}

object WebpropertyPermissions {
  @scala.inline
  def apply(effective: js.Array[String] = null): WebpropertyPermissions = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective)
    __obj.asInstanceOf[WebpropertyPermissions]
  }
}

