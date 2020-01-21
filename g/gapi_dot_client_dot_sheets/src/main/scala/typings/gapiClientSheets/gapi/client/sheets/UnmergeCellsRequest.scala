package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmergeCellsRequest extends js.Object {
  /**
    * The range within which all cells should be unmerged.
    * If the range spans multiple merges, all will be unmerged.
    * The range must not partially span any merge.
    */
  var range: js.UndefOr[GridRange] = js.undefined
}

object UnmergeCellsRequest {
  @scala.inline
  def apply(range: GridRange = null): UnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmergeCellsRequest]
  }
}

