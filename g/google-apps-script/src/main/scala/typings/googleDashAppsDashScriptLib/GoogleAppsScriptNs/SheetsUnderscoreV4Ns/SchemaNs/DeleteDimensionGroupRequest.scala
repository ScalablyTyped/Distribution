package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDimensionGroupRequest extends js.Object {
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object DeleteDimensionGroupRequest {
  @scala.inline
  def apply(range: DimensionRange = null): DeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DeleteDimensionGroupRequest]
  }
}

