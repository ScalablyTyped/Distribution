package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTableRowRequest extends js.Object {
  var insertBelow: js.UndefOr[Boolean] = js.native
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}

object InsertTableRowRequest {
  @scala.inline
  def apply(): InsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowRequest]
  }
  @scala.inline
  implicit class InsertTableRowRequestOps[Self <: InsertTableRowRequest] (val x: Self) extends AnyVal {
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
    def setInsertBelow(value: Boolean): Self = this.set("insertBelow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertBelow: Self = this.set("insertBelow", js.undefined)
    @scala.inline
    def setTableCellLocation(value: TableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
  
}

