package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsMoveDevicesToOu extends js.Object {
  var deviceIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(deviceIds: js.Array[java.lang.String] = null): ChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds)
    __obj.asInstanceOf[ChromeOsMoveDevicesToOu]
  }
}

