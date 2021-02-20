package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.WorksheetProperties> */
@js.native
trait PartialWorksheetPropertie extends StObject {
  
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
  implicit class PartialWorksheetPropertieMutableBuilder[Self <: PartialWorksheetPropertie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultColWidth(value: Double): Self = StObject.set(x, "defaultColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColWidthUndefined: Self = StObject.set(x, "defaultColWidth", js.undefined)
    
    @scala.inline
    def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRowHeightUndefined: Self = StObject.set(x, "defaultRowHeight", js.undefined)
    
    @scala.inline
    def setDyDescent(value: Double): Self = StObject.set(x, "dyDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyDescentUndefined: Self = StObject.set(x, "dyDescent", js.undefined)
    
    @scala.inline
    def setOutlineLevelCol(value: Double): Self = StObject.set(x, "outlineLevelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelColUndefined: Self = StObject.set(x, "outlineLevelCol", js.undefined)
    
    @scala.inline
    def setOutlineLevelRow(value: Double): Self = StObject.set(x, "outlineLevelRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelRowUndefined: Self = StObject.set(x, "outlineLevelRow", js.undefined)
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridLinesUndefined: Self = StObject.set(x, "showGridLines", js.undefined)
    
    @scala.inline
    def setTabColor(value: PartialColor): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
  }
}
