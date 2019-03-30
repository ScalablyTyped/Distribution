package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProtectedRangeRequest extends js.Object {
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object AddProtectedRangeRequest {
  @scala.inline
  def apply(protectedRange: ProtectedRange = null): AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange)
    __obj.asInstanceOf[AddProtectedRangeRequest]
  }
}

