package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the state of the specified group.
  */
@js.native
trait Schema$UpdateDimensionGroupRequest extends js.Object {
  /**
    * The group whose state should be updated. The range and depth of the group
    * should specify a valid group on the sheet, and all other fields updated.
    */
  var dimensionGroup: js.UndefOr[Schema$DimensionGroup] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `dimensionGroup` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object Schema$UpdateDimensionGroupRequest {
  @scala.inline
  def apply(dimensionGroup: Schema$DimensionGroup = null, fields: String = null): Schema$UpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroup != null) __obj.updateDynamic("dimensionGroup")(dimensionGroup.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDimensionGroupRequest]
  }
}

