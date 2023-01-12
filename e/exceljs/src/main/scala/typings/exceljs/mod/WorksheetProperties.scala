package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetProperties extends StObject {
  
  /**
  	 * Default column width (optional)
  	 */
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: Double
  
  /**
  	 * default: 55
  	 */
  var dyDescent: Double
  
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: Double
  
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: Double
  
  var showGridLines: Boolean
  
  /**
  	 * Color of the tab
  	 */
  var tabColor: PartialColor
}
object WorksheetProperties {
  
  inline def apply(
    defaultRowHeight: Double,
    dyDescent: Double,
    outlineLevelCol: Double,
    outlineLevelRow: Double,
    showGridLines: Boolean,
    tabColor: PartialColor
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], dyDescent = dyDescent.asInstanceOf[js.Any], outlineLevelCol = outlineLevelCol.asInstanceOf[js.Any], outlineLevelRow = outlineLevelRow.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], tabColor = tabColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetProperties] (val x: Self) extends AnyVal {
    
    inline def setDefaultColWidth(value: Double): Self = StObject.set(x, "defaultColWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColWidthUndefined: Self = StObject.set(x, "defaultColWidth", js.undefined)
    
    inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
    
    inline def setDyDescent(value: Double): Self = StObject.set(x, "dyDescent", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelCol(value: Double): Self = StObject.set(x, "outlineLevelCol", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelRow(value: Double): Self = StObject.set(x, "outlineLevelRow", value.asInstanceOf[js.Any])
    
    inline def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    inline def setTabColor(value: PartialColor): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
  }
}
