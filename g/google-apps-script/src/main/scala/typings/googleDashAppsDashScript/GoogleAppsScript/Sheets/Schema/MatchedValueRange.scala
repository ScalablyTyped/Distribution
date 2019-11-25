package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedValueRange extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var valueRange: js.UndefOr[ValueRange] = js.undefined
}

object MatchedValueRange {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null, valueRange: ValueRange = null): MatchedValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedValueRange]
  }
}

