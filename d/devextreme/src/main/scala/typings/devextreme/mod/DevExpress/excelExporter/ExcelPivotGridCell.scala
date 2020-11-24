package typings.devextreme.mod.DevExpress.excelExporter

import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelPivotGridCell extends dxPivotGridPivotGridCell {
  
  /**
    * [descr:ExcelPivotGridCell.area]
    */
  var area: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExcelPivotGridCell.columnIndex]
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ExcelPivotGridCell.rowIndex]
    */
  var rowIndex: js.UndefOr[Double] = js.native
}
object ExcelPivotGridCell {
  
  @scala.inline
  def apply(): ExcelPivotGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelPivotGridCell]
  }
  
  @scala.inline
  implicit class ExcelPivotGridCellOps[Self <: ExcelPivotGridCell] (val x: Self) extends AnyVal {
    
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
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
