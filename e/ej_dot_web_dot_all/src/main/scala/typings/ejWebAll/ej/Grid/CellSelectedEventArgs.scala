package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellSelectedEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the selected cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  
  /** Returns the selected cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.native
  
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous selected cell element.
    */
  var previousRowCell: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous selected cell index value.
    */
  var previousRowCellIndex: js.UndefOr[Double] = js.native
  
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  
  /** Returns the selected row cell index values.
    */
  var selectedRowCellIndex: js.UndefOr[js.Array[_]] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
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
    def setCurrentCell(value: js.Any): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentCell: Self = this.set("currentCell", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreviousRowCell(value: js.Any): Self = this.set("previousRowCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRowCell: Self = this.set("previousRowCell", js.undefined)
    
    @scala.inline
    def setPreviousRowCellIndex(value: Double): Self = this.set("previousRowCellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRowCellIndex: Self = this.set("previousRowCellIndex", js.undefined)
    
    @scala.inline
    def setSelectedData(value: js.Any): Self = this.set("selectedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedData: Self = this.set("selectedData", js.undefined)
    
    @scala.inline
    def setSelectedRowCellIndexVarargs(value: js.Any*): Self = this.set("selectedRowCellIndex", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRowCellIndex(value: js.Array[_]): Self = this.set("selectedRowCellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowCellIndex: Self = this.set("selectedRowCellIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
