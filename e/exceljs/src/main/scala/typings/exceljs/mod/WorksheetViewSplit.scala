package typings.exceljs.mod

import typings.exceljs.exceljsStrings.bottomLeft
import typings.exceljs.exceljsStrings.bottomRight
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import typings.exceljs.exceljsStrings.split
import typings.exceljs.exceljsStrings.topLeft
import typings.exceljs.exceljsStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewSplit extends StObject {
  
  /**
  	 * Which pane will be active
  	 */
  var activePane: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight] = js.native
  
  /**
  	 * Where the view is split into 4 sections, each semi-independently scrollable.
  	 */
  var state: split = js.native
  
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview | pageLayout] = js.native
  
  /**
  	 * Which cell will be top-left in the bottom-right pane
  	 */
  var topLeftCell: js.UndefOr[String] = js.native
  
  /**
  	 * How many points from the left to place the splitter.
  	 * To split vertically, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.native
  
  /**
  	 * How many points from the top to place the splitter.
  	 * To split horizontally, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.native
}
object WorksheetViewSplit {
  
  @scala.inline
  def apply(state: split): WorksheetViewSplit = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewSplit]
  }
  
  @scala.inline
  implicit class WorksheetViewSplitMutableBuilder[Self <: WorksheetViewSplit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivePane(value: topLeft | topRight | bottomLeft | bottomRight): Self = StObject.set(x, "activePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePaneUndefined: Self = StObject.set(x, "activePane", js.undefined)
    
    @scala.inline
    def setState(value: split): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: pageBreakPreview | pageLayout): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
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
