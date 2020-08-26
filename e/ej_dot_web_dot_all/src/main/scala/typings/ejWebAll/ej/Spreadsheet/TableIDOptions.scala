package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableIDOptions extends js.Object {
  /** Pass the sheet index
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  /** Pass the table id
    */
  var tableId: js.UndefOr[Double] = js.native
}

object TableIDOptions {
  @scala.inline
  def apply(): TableIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableIDOptions]
  }
  @scala.inline
  implicit class TableIDOptionsOps[Self <: TableIDOptions] (val x: Self) extends AnyVal {
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
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    @scala.inline
    def setTableId(value: Double): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
  
}

