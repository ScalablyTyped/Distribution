package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHoverEventArgs extends js.Object {
  
  /** Returns the hovered row cell
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /** Returns the hovered row.
    */
  var row: js.UndefOr[js.Any] = js.native
  
  /** Returns the hovered record details
    */
  var rowData: js.UndefOr[js.Any] = js.native
  
  /** Returns the hovered row index.
    */
  var rowIndex: js.UndefOr[js.Any] = js.native
}
object RowHoverEventArgs {
  
  @scala.inline
  def apply(): RowHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHoverEventArgs]
  }
  
  @scala.inline
  implicit class RowHoverEventArgsOps[Self <: RowHoverEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    
    @scala.inline
    def setRowIndex(value: js.Any): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
