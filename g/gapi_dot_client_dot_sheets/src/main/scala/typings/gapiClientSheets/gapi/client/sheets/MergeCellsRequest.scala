package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCellsRequest extends js.Object {
  /** How the cells should be merged. */
  var mergeType: js.UndefOr[String] = js.undefined
  /** The range of cells to merge. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object MergeCellsRequest {
  @scala.inline
  def apply(mergeType: String = null, range: GridRange = null): MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (mergeType != null) __obj.updateDynamic("mergeType")(mergeType.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCellsRequest]
  }
}

