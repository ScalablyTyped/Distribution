package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the selecting cell element.
    */
  var cellElement: js.UndefOr[js.Any] = js.native
  /** Returns the value of cell.
    */
  var cellValue: js.UndefOr[String] = js.native
  /** Returns the column of cell belongs.
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Returns the data of current cell record.
    */
  var data: js.UndefOr[js.Any] = js.native
}

object QueryCellInfoEventArgs {
  @scala.inline
  def apply(): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
  @scala.inline
  implicit class QueryCellInfoEventArgsOps[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCellElement(value: js.Any): Self = this.set("cellElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellElement: Self = this.set("cellElement", js.undefined)
    @scala.inline
    def setCellValue(value: String): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

