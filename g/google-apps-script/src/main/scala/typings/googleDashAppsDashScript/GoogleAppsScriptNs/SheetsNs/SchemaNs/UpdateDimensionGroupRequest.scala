package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDimensionGroupRequest extends js.Object {
  var dimensionGroup: js.UndefOr[DimensionGroup] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
}

object UpdateDimensionGroupRequest {
  @scala.inline
  def apply(dimensionGroup: DimensionGroup = null, fields: String = null): UpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroup != null) __obj.updateDynamic("dimensionGroup")(dimensionGroup)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[UpdateDimensionGroupRequest]
  }
}

