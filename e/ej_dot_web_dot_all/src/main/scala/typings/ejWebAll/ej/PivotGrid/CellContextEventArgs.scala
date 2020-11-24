package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellContextEventArgs extends js.Object {
  
  /** returns the original event object.
    */
  var args: js.UndefOr[js.Any] = js.native
  
  /** returns the cell position (row index and column index) in table.
    */
  var cellPosition: js.UndefOr[String] = js.native
  
  /** returns the type of the cell.
    */
  var cellType: js.UndefOr[String] = js.native
  
  /** returns the content of the cell.
    */
  var cellValue: js.UndefOr[String] = js.native
  
  /** returns JSON record corresponding to the selected cell.
    */
  var rawdata: js.UndefOr[js.Any] = js.native
  
  /** returns the role of the cell in PivotGrid.
    */
  var role: js.UndefOr[String] = js.native
  
  /** returns the unique name of levels/members.
    */
  var uniqueName: js.UndefOr[String] = js.native
}
object CellContextEventArgs {
  
  @scala.inline
  def apply(): CellContextEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellContextEventArgs]
  }
  
  @scala.inline
  implicit class CellContextEventArgsOps[Self <: CellContextEventArgs] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCellPosition(value: String): Self = this.set("cellPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPosition: Self = this.set("cellPosition", js.undefined)
    
    @scala.inline
    def setCellType(value: String): Self = this.set("cellType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellType: Self = this.set("cellType", js.undefined)
    
    @scala.inline
    def setCellValue(value: String): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    
    @scala.inline
    def setRawdata(value: js.Any): Self = this.set("rawdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawdata: Self = this.set("rawdata", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}
