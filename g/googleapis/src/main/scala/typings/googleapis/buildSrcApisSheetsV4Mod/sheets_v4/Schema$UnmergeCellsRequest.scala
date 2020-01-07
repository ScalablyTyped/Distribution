package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unmerges cells in the given range.
  */
@js.native
trait Schema$UnmergeCellsRequest extends js.Object {
  /**
    * The range within which all cells should be unmerged. If the range spans
    * multiple merges, all will be unmerged. The range must not partially span
    * any merge.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$UnmergeCellsRequest {
  @scala.inline
  def apply(range: Schema$GridRange = null): Schema$UnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnmergeCellsRequest]
  }
}

