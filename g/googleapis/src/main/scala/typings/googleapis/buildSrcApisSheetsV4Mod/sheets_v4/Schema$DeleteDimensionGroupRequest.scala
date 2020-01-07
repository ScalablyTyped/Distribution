package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a group over the specified range by decrementing the depth of the
  * dimensions in the range.  For example, assume the sheet has a depth-1 group
  * over B:E and a depth-2 group over C:D. Deleting a group over D:E leaves the
  * sheet with a depth-1 group over B:D and a depth-2 group over C:C.
  */
@js.native
trait Schema$DeleteDimensionGroupRequest extends js.Object {
  /**
    * The range of the group to be deleted.
    */
  var range: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$DeleteDimensionGroupRequest {
  @scala.inline
  def apply(range: Schema$DimensionRange = null): Schema$DeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteDimensionGroupRequest]
  }
}

