package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateValuesResponse extends js.Object {
  /**
    * One UpdateValuesResponse per requested range, in the same order as
    * the requests appeared.
    */
  var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.native
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
  /** The total number of cells updated. */
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  /** The total number of rows where at least one cell in the row was updated. */
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}

object BatchUpdateValuesResponse {
  @scala.inline
  def apply(): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
  @scala.inline
  implicit class BatchUpdateValuesResponseOps[Self <: BatchUpdateValuesResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: UpdateValuesResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[UpdateValuesResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setTotalUpdatedCells(value: Double): Self = this.set("totalUpdatedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalUpdatedCells: Self = this.set("totalUpdatedCells", js.undefined)
    @scala.inline
    def setTotalUpdatedColumns(value: Double): Self = this.set("totalUpdatedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalUpdatedColumns: Self = this.set("totalUpdatedColumns", js.undefined)
    @scala.inline
    def setTotalUpdatedRows(value: Double): Self = this.set("totalUpdatedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalUpdatedRows: Self = this.set("totalUpdatedRows", js.undefined)
    @scala.inline
    def setTotalUpdatedSheets(value: Double): Self = this.set("totalUpdatedSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalUpdatedSheets: Self = this.set("totalUpdatedSheets", js.undefined)
  }
  
}

