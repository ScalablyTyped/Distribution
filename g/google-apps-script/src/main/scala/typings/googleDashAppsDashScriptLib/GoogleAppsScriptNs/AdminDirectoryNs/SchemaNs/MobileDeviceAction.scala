package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDeviceAction extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
}

object MobileDeviceAction {
  @scala.inline
  def apply(action: java.lang.String = null): MobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[MobileDeviceAction]
  }
}

