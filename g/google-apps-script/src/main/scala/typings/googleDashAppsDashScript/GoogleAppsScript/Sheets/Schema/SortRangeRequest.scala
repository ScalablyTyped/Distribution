package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}

object SortRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, sortSpecs: js.Array[SortSpec] = null): SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs)
    __obj.asInstanceOf[SortRangeRequest]
  }
}

