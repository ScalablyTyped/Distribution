package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedValueRange extends js.Object {
  /**
    * The DataFilters from the request that matched the range of
    * values.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /** The values matched by the DataFilter. */
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

