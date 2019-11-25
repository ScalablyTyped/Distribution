package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from
    * the spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /**
    * True if grid data should be returned.
    * This parameter is ignored if a field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.undefined
}

object GetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null, includeGridData: js.UndefOr[Boolean] = js.undefined): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(includeGridData)) __obj.updateDynamic("includeGridData")(includeGridData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
}

