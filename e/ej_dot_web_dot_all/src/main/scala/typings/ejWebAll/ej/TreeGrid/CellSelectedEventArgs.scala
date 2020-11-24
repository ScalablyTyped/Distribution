package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellSelectedEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the cell index on the selection.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  
  /** Returns the selecting record object
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the Gantt object Model
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the previously selected cell index
    */
  var previousCellIndex: js.UndefOr[js.Any] = js.native
  
  /** Returns the previously selected row data
    */
  var previousData: js.UndefOr[js.Any] = js.native
  
  /** Returns the previously selected row index
    */
  var previousRowIndex: js.UndefOr[js.Any] = js.native
  
  /** Returns the previously selected cell element
    */
  var previousTargetCell: js.UndefOr[js.Any] = js.native
  
  /** Returns the previously selected row element
    */
  var previousTargetRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the row index on the selection
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /** Returns the selecting cell element
    */
  var targetCell: js.UndefOr[js.Any] = js.native
  
  /** Returns the selecting row element
    */
  var targetRow: js.UndefOr[js.Any] = js.native
}
object CellSelectedEventArgs {
  
  @scala.inline
  def apply(): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
  
  @scala.inline
  implicit class CellSelectedEventArgsOps[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreviousCellIndex(value: js.Any): Self = this.set("previousCellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousCellIndex: Self = this.set("previousCellIndex", js.undefined)
    
    @scala.inline
    def setPreviousData(value: js.Any): Self = this.set("previousData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousData: Self = this.set("previousData", js.undefined)
    
    @scala.inline
    def setPreviousRowIndex(value: js.Any): Self = this.set("previousRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRowIndex: Self = this.set("previousRowIndex", js.undefined)
    
    @scala.inline
    def setPreviousTargetCell(value: js.Any): Self = this.set("previousTargetCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTargetCell: Self = this.set("previousTargetCell", js.undefined)
    
    @scala.inline
    def setPreviousTargetRow(value: js.Any): Self = this.set("previousTargetRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTargetRow: Self = this.set("previousTargetRow", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setTargetCell(value: js.Any): Self = this.set("targetCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCell: Self = this.set("targetCell", js.undefined)
    
    @scala.inline
    def setTargetRow(value: js.Any): Self = this.set("targetRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRow: Self = this.set("targetRow", js.undefined)
  }
}
