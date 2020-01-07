package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a group.
  */
@js.native
trait Schema$AddDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after adding a group to that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[Schema$DimensionGroup]] = js.native
}

object Schema$AddDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[Schema$DimensionGroup] = null): Schema$AddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddDimensionGroupResponse]
  }
}

