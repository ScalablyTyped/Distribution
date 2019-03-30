package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesRequest extends js.Object {
  var ranges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchClearValuesRequest {
  @scala.inline
  def apply(ranges: js.Array[java.lang.String] = null): BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    __obj.asInstanceOf[BatchClearValuesRequest]
  }
}

