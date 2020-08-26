package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendCellsRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[RowData]] = js.native
  var sheetId: js.UndefOr[Double] = js.native
}

object AppendCellsRequest {
  @scala.inline
  def apply(): AppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendCellsRequest]
  }
  @scala.inline
  implicit class AppendCellsRequestOps[Self <: AppendCellsRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setRowsVarargs(value: RowData*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[RowData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
  
}

