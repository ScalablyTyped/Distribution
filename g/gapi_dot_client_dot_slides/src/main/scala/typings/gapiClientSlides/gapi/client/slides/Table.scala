package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /** Number of columns in the table. */
  var columns: js.UndefOr[Double] = js.native
  /** Number of rows in the table. */
  var rows: js.UndefOr[Double] = js.native
  /** Properties of each column. */
  var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.native
  /**
    * Properties and contents of each row.
    *
    * Cells that span multiple rows are contained in only one of these rows and
    * have a row_span greater
    * than 1.
    */
  var tableRows: js.UndefOr[js.Array[TableRow]] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTableColumnsVarargs(value: TableColumnProperties*): Self = this.set("tableColumns", js.Array(value :_*))
    @scala.inline
    def setTableColumns(value: js.Array[TableColumnProperties]): Self = this.set("tableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableColumns: Self = this.set("tableColumns", js.undefined)
    @scala.inline
    def setTableRowsVarargs(value: TableRow*): Self = this.set("tableRows", js.Array(value :_*))
    @scala.inline
    def setTableRows(value: js.Array[TableRow]): Self = this.set("tableRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRows: Self = this.set("tableRows", js.undefined)
  }
  
}

