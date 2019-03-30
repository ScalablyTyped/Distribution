package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDimensionGroupResponse extends js.Object {
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}

object AddDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[DimensionGroup] = null): AddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups)
    __obj.asInstanceOf[AddDimensionGroupResponse]
  }
}

