package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDimensionGroupResponse extends js.Object {
  /** All groups of a dimension after deleting a group from that dimension. */
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}

object DeleteDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[DimensionGroup] = null): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups)
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
}

