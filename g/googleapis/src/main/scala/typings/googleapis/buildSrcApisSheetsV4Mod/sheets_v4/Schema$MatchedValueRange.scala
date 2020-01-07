package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value range that was matched by one or more data filers.
  */
@js.native
trait Schema$MatchedValueRange extends js.Object {
  /**
    * The DataFilters from the request that matched the range of values.
    */
  var dataFilters: js.UndefOr[js.Array[Schema$DataFilter]] = js.native
  /**
    * The values matched by the DataFilter.
    */
  var valueRange: js.UndefOr[Schema$ValueRange] = js.native
}

object Schema$MatchedValueRange {
  @scala.inline
  def apply(dataFilters: js.Array[Schema$DataFilter] = null, valueRange: Schema$ValueRange = null): Schema$MatchedValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MatchedValueRange]
  }
}

