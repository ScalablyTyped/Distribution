package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges all cells in the range.
  */
@js.native
trait Schema$MergeCellsRequest extends js.Object {
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String] = js.native
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$MergeCellsRequest {
  @scala.inline
  def apply(mergeType: String = null, range: Schema$GridRange = null): Schema$MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (mergeType != null) __obj.updateDynamic("mergeType")(mergeType.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MergeCellsRequest]
  }
}

