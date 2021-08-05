package typings.exceljs.mod

import typings.exceljs.exceljsStrings.frozen
import typings.exceljs.exceljsStrings.pageBreakPreview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetViewFrozen extends StObject {
  
  /**
  	 * Where a number of rows and columns to the top and left are frozen in place.
  	 * Only the bottom left section will scroll
  	 */
  var state: frozen
  
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview] = js.undefined
  
  /**
  	 * Which cell will be top-left in the bottom-right pane. Note: cannot be a frozen cell.
  	 * Defaults to first unfrozen cell
  	 */
  var topLeftCell: js.UndefOr[String] = js.undefined
  
  /**
  	 * How many columns to freeze. To freeze rows only, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.undefined
  
  /**
  	 * How many rows to freeze. To freeze columns only, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.undefined
}
object WorksheetViewFrozen {
  
  inline def apply(): WorksheetViewFrozen = {
    val __obj = js.Dynamic.literal(state = "frozen")
    __obj.asInstanceOf[WorksheetViewFrozen]
  }
  
  extension [Self <: WorksheetViewFrozen](x: Self) {
    
    inline def setState(value: frozen): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: pageBreakPreview): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTopLeftCell(value: String): Self = StObject.set(x, "topLeftCell", value.asInstanceOf[js.Any])
    
    inline def setTopLeftCellUndefined: Self = StObject.set(x, "topLeftCell", js.undefined)
    
    inline def setXSplit(value: Double): Self = StObject.set(x, "xSplit", value.asInstanceOf[js.Any])
    
    inline def setXSplitUndefined: Self = StObject.set(x, "xSplit", js.undefined)
    
    inline def setYSplit(value: Double): Self = StObject.set(x, "ySplit", value.asInstanceOf[js.Any])
    
    inline def setYSplitUndefined: Self = StObject.set(x, "ySplit", js.undefined)
  }
}
