package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for clearing more than one range selected by a DataFilter in a
  * spreadsheet.
  */
@js.native
trait Schema$BatchClearValuesByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to determine which ranges to clear.
    */
  var dataFilters: js.UndefOr[js.Array[Schema$DataFilter]] = js.native
}

object Schema$BatchClearValuesByDataFilterRequest {
  @scala.inline
  def apply(dataFilters: js.Array[Schema$DataFilter] = null): Schema$BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchClearValuesByDataFilterRequest]
  }
}

