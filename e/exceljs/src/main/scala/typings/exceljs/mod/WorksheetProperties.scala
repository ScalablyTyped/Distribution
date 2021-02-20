package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetProperties extends StObject {
  
  /**
  	 * Default column width (optional)
  	 */
  var defaultColWidth: js.UndefOr[Double] = js.native
  
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: Double = js.native
  
  /**
  	 * default: 55
  	 */
  var dyDescent: Double = js.native
  
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: Double = js.native
  
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: Double = js.native
  
  var showGridLines: Boolean = js.native
  
  /**
  	 * Color of the tab
  	 */
  var tabColor: PartialColor = js.native
}
object WorksheetProperties {
  
  @scala.inline
  def apply(
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
  implicit class WorksheetPropertiesMutableBuilder[Self <: WorksheetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultColWidth(value: Double): Self = StObject.set(x, "defaultColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColWidthUndefined: Self = StObject.set(x, "defaultColWidth", js.undefined)
    
    @scala.inline
    def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyDescent(value: Double): Self = StObject.set(x, "dyDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelCol(value: Double): Self = StObject.set(x, "outlineLevelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevelRow(value: Double): Self = StObject.set(x, "outlineLevelRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColor(value: PartialColor): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
  }
}
