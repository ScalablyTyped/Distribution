package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from
    * the spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  /**
    * True if grid data should be returned.
    * This parameter is ignored if a field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
}

object GetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(): GetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
  }
  @scala.inline
  implicit class GetSpreadsheetByDataFilterRequestOps[Self <: GetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    @scala.inline
    def setIncludeGridData(value: Boolean): Self = this.set("includeGridData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGridData: Self = this.set("includeGridData", js.undefined)
  }
  
}

