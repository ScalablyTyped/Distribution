package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeCellInfoEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns grid cell.
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /** Method to merge Grid columns.
    */
  var colMerge: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.native
  
  /** Returns current row record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Method to merge Grid rows and columns.
    */
  var merge: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns current row record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.native
  
  /** Method to merge Grid rows.
    */
  var rowMerge: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Returns the text value in the cell.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MergeCellInfoEventArgs {
  
  @scala.inline
  def apply(): MergeCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCellInfoEventArgs]
  }
  
  @scala.inline
  implicit class MergeCellInfoEventArgsOps[Self <: MergeCellInfoEventArgs] (val x: Self) extends AnyVal {
    
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
    def setColMerge(value: () => Unit): Self = this.set("colMerge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteColMerge: Self = this.set("colMerge", js.undefined)
    
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMerge(value: () => Unit): Self = this.set("merge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    
    @scala.inline
    def setRowMerge(value: () => Unit): Self = this.set("rowMerge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRowMerge: Self = this.set("rowMerge", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
