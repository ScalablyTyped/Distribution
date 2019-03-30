package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDimensionRequest extends js.Object {
  var inheritFromBefore: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object InsertDimensionRequest {
  @scala.inline
  def apply(inheritFromBefore: js.UndefOr[scala.Boolean] = js.undefined, range: DimensionRange = null): InsertDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inheritFromBefore)) __obj.updateDynamic("inheritFromBefore")(inheritFromBefore)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InsertDimensionRequest]
  }
}

