package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceAction extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var deprovisionReason: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceAction {
  @scala.inline
  def apply(action: java.lang.String = null, deprovisionReason: java.lang.String = null): ChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (deprovisionReason != null) __obj.updateDynamic("deprovisionReason")(deprovisionReason)
    __obj.asInstanceOf[ChromeOsDeviceAction]
  }
}

