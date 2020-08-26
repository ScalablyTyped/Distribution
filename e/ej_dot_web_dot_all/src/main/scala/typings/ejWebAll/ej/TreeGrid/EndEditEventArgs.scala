package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the Element of editing cell.
    */
  var cellElement: js.UndefOr[js.Any] = js.native
  /** Returns the column name of edited cell belongs.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns the column object of edited cell belongs.
    */
  var columnObject: js.UndefOr[js.Any] = js.native
  /** Returns the data of edited cell record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the row element of editing cell.
    */
  var rowElement: js.UndefOr[js.Any] = js.native
}

object EndEditEventArgs {
  @scala.inline
  def apply(): EndEditEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndEditEventArgs]
  }
  @scala.inline
  implicit class EndEditEventArgsOps[Self <: EndEditEventArgs] (val x: Self) extends AnyVal {
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
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setColumnObject(value: js.Any): Self = this.set("columnObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnObject: Self = this.set("columnObject", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRowElement(value: js.Any): Self = this.set("rowElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowElement: Self = this.set("rowElement", js.undefined)
  }
  
}

