package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellEditEventArgs extends js.Object {
  
  /** contains the array of cells selected for editing.
    */
  var editCellsInfo: js.UndefOr[js.Array[_]] = js.native
}
object CellEditEventArgs {
  
  @scala.inline
  def apply(): CellEditEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellEditEventArgs]
  }
  
  @scala.inline
  implicit class CellEditEventArgsOps[Self <: CellEditEventArgs] (val x: Self) extends AnyVal {
    
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
    def setEditCellsInfoVarargs(value: js.Any*): Self = this.set("editCellsInfo", js.Array(value :_*))
    
    @scala.inline
    def setEditCellsInfo(value: js.Array[_]): Self = this.set("editCellsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditCellsInfo: Self = this.set("editCellsInfo", js.undefined)
  }
}
