package typings.exceljs.mod

import typings.exceljs.exceljsStrings.frozen
import typings.exceljs.exceljsStrings.pageBreakPreview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewFrozen extends StObject {
  
  /**
  	 * Where a number of rows and columns to the top and left are frozen in place.
  	 * Only the bottom left section will scroll
  	 */
  var state: frozen = js.native
  
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview] = js.native
  
  /**
  	 * Which cell will be top-left in the bottom-right pane. Note: cannot be a frozen cell.
  	 * Defaults to first unfrozen cell
  	 */
  var topLeftCell: js.UndefOr[String] = js.native
  
  /**
  	 * How many columns to freeze. To freeze rows only, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.native
  
  /**
  	 * How many rows to freeze. To freeze columns only, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.native
}
object WorksheetViewFrozen {
  
  @scala.inline
  def apply(state: frozen): WorksheetViewFrozen = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewFrozen]
  }
  
  @scala.inline
  implicit class WorksheetViewFrozenMutableBuilder[Self <: WorksheetViewFrozen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: frozen): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: pageBreakPreview): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTopLeftCell(value: String): Self = StObject.set(x, "topLeftCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeftCellUndefined: Self = StObject.set(x, "topLeftCell", js.undefined)
    
    @scala.inline
    def setXSplit(value: Double): Self = StObject.set(x, "xSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXSplitUndefined: Self = StObject.set(x, "xSplit", js.undefined)
    
    @scala.inline
    def setYSplit(value: Double): Self = StObject.set(x, "ySplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYSplitUndefined: Self = StObject.set(x, "ySplit", js.undefined)
  }
}
