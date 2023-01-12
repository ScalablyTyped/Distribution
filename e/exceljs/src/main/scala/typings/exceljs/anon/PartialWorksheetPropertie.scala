package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.WorksheetProperties> */
trait PartialWorksheetPropertie extends StObject {
  
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  
  var defaultRowHeight: js.UndefOr[Double] = js.undefined
  
  var dyDescent: js.UndefOr[Double] = js.undefined
  
  var outlineLevelCol: js.UndefOr[Double] = js.undefined
  
  var outlineLevelRow: js.UndefOr[Double] = js.undefined
  
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  
  var tabColor: js.UndefOr[PartialColor] = js.undefined
}
object PartialWorksheetPropertie {
  
  inline def apply(): PartialWorksheetPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorksheetPropertie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWorksheetPropertie] (val x: Self) extends AnyVal {
    
    inline def setDefaultColWidth(value: Double): Self = StObject.set(x, "defaultColWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColWidthUndefined: Self = StObject.set(x, "defaultColWidth", js.undefined)
    
    inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultRowHeightUndefined: Self = StObject.set(x, "defaultRowHeight", js.undefined)
    
    inline def setDyDescent(value: Double): Self = StObject.set(x, "dyDescent", value.asInstanceOf[js.Any])
    
    inline def setDyDescentUndefined: Self = StObject.set(x, "dyDescent", js.undefined)
    
    inline def setOutlineLevelCol(value: Double): Self = StObject.set(x, "outlineLevelCol", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelColUndefined: Self = StObject.set(x, "outlineLevelCol", js.undefined)
    
    inline def setOutlineLevelRow(value: Double): Self = StObject.set(x, "outlineLevelRow", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelRowUndefined: Self = StObject.set(x, "outlineLevelRow", js.undefined)
    
    inline def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    inline def setShowGridLinesUndefined: Self = StObject.set(x, "showGridLines", js.undefined)
    
    inline def setTabColor(value: PartialColor): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    inline def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
  }
}
