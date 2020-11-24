package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the element of clicked cell.
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /** Returns the index of the clicked cell.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  
  /** Returns the data of clicked cell.
    */
  var cellValue: js.UndefOr[js.Any] = js.native
  
  /** Returns the column name of the clicked cell.
    */
  var columnName: js.UndefOr[String] = js.native
  
  /** Returns the element of the clicked row.
    */
  var row: js.UndefOr[js.Any] = js.native
  
  /** Returns the index of the clicked row.
    */
  var rowIndex: js.UndefOr[Double] = js.native
}
object RecordClickEventArgs {
  
  @scala.inline
  def apply(): RecordClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordClickEventArgs]
  }
  
  @scala.inline
  implicit class RecordClickEventArgsOps[Self <: RecordClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    
    @scala.inline
    def setCellValue(value: js.Any): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
