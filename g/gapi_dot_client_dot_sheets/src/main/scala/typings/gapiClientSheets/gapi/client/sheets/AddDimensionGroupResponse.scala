package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDimensionGroupResponse extends js.Object {
  /** All groups of a dimension after adding a group to that dimension. */
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}

object AddDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[DimensionGroup] = null): AddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDimensionGroupResponse]
  }
}

