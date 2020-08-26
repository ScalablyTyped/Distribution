package typings.devextreme.mod.DevExpress.excelExporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellAddress extends js.Object {
  /** @name CellAddress.column */
  var column: js.UndefOr[Double] = js.native
  /** @name CellAddress.row */
  var row: js.UndefOr[Double] = js.native
}

object CellAddress {
  @scala.inline
  def apply(): CellAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellAddress]
  }
  @scala.inline
  implicit class CellAddressOps[Self <: CellAddress] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
  
}

