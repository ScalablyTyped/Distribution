package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCellsRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var range: js.UndefOr[GridRange] = js.native
  var rows: js.UndefOr[js.Array[RowData]] = js.native
  var start: js.UndefOr[GridCoordinate] = js.native
}

object UpdateCellsRequest {
  @scala.inline
  def apply(): UpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCellsRequest]
  }
  @scala.inline
  implicit class UpdateCellsRequestOps[Self <: UpdateCellsRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRowsVarargs(value: RowData*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[RowData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStart(value: GridCoordinate): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

