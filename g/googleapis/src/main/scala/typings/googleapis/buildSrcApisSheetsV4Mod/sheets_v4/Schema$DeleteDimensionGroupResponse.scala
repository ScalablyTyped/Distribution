package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a group.
  */
@js.native
trait Schema$DeleteDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[Schema$DimensionGroup]] = js.native
}

object Schema$DeleteDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[Schema$DimensionGroup] = null): Schema$DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteDimensionGroupResponse]
  }
}

