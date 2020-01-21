package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDimensionGroupResponse extends js.Object {
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}

object DeleteDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[DimensionGroup] = null): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
}

