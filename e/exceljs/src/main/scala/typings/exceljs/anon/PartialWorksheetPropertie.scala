package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.WorksheetProperties> */
@js.native
trait PartialWorksheetPropertie extends js.Object {
  
  var defaultColWidth: js.UndefOr[Double] = js.native
  
  var defaultRowHeight: js.UndefOr[Double] = js.native
  
  var dyDescent: js.UndefOr[Double] = js.native
  
  var outlineLevelCol: js.UndefOr[Double] = js.native
  
  var outlineLevelRow: js.UndefOr[Double] = js.native
  
  var showGridLines: js.UndefOr[Boolean] = js.native
  
  var tabColor: js.UndefOr[PartialColor] = js.native
}
object PartialWorksheetPropertie {
  
  @scala.inline
  def apply(): PartialWorksheetPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorksheetPropertie]
  }
  
  @scala.inline
  implicit class PartialWorksheetPropertieOps[Self <: PartialWorksheetPropertie] (val x: Self) extends AnyVal {
    
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
    def setDefaultColWidth(value: Double): Self = this.set("defaultColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColWidth: Self = this.set("defaultColWidth", js.undefined)
    
    @scala.inline
    def setDefaultRowHeight(value: Double): Self = this.set("defaultRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRowHeight: Self = this.set("defaultRowHeight", js.undefined)
    
    @scala.inline
    def setDyDescent(value: Double): Self = this.set("dyDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDyDescent: Self = this.set("dyDescent", js.undefined)
    
    @scala.inline
    def setOutlineLevelCol(value: Double): Self = this.set("outlineLevelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineLevelCol: Self = this.set("outlineLevelCol", js.undefined)
    
    @scala.inline
    def setOutlineLevelRow(value: Double): Self = this.set("outlineLevelRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineLevelRow: Self = this.set("outlineLevelRow", js.undefined)
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridLines: Self = this.set("showGridLines", js.undefined)
    
    @scala.inline
    def setTabColor(value: PartialColor): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
  }
}
