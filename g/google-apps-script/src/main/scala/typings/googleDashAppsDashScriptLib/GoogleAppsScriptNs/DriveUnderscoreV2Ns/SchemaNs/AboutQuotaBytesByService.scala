package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutQuotaBytesByService extends js.Object {
  var bytesUsed: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
}

object AboutQuotaBytesByService {
  @scala.inline
  def apply(bytesUsed: java.lang.String = null, serviceName: java.lang.String = null): AboutQuotaBytesByService = {
    val __obj = js.Dynamic.literal()
    if (bytesUsed != null) __obj.updateDynamic("bytesUsed")(bytesUsed)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[AboutQuotaBytesByService]
  }
}

