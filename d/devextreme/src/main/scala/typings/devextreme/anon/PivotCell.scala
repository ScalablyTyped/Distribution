package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.ExcelPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotCell extends js.Object {
  
  var excelCell: js.UndefOr[js.Any] = js.native
  
  var pivotCell: js.UndefOr[ExcelPivotGridCell] = js.native
}
object PivotCell {
  
  @scala.inline
  def apply(): PivotCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotCell]
  }
  
  @scala.inline
  implicit class PivotCellOps[Self <: PivotCell] (val x: Self) extends AnyVal {
    
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
    def setExcelCell(value: js.Any): Self = this.set("excelCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelCell: Self = this.set("excelCell", js.undefined)
    
    @scala.inline
    def setPivotCell(value: ExcelPivotGridCell): Self = this.set("pivotCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotCell: Self = this.set("pivotCell", js.undefined)
  }
}
