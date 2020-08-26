package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableRowRequest extends js.Object {
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
  @scala.inline
  implicit class DeleteTableRowRequestOps[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
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
    def setTableCellLocation(value: TableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
  
}

