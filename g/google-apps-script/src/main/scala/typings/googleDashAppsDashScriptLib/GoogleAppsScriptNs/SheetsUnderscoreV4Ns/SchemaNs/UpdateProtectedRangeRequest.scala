package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProtectedRangeRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object UpdateProtectedRangeRequest {
  @scala.inline
  def apply(fields: java.lang.String = null, protectedRange: ProtectedRange = null): UpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange)
    __obj.asInstanceOf[UpdateProtectedRangeRequest]
  }
}

