package typings.exceljs.mod

import typings.exceljs.exceljsStrings.frozen
import typings.exceljs.exceljsStrings.pageBreakPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewFrozen extends js.Object {
  
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
  implicit class WorksheetViewFrozenOps[Self <: WorksheetViewFrozen] (val x: Self) extends AnyVal {
    
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
    def setState(value: frozen): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: pageBreakPreview): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTopLeftCell(value: String): Self = this.set("topLeftCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeftCell: Self = this.set("topLeftCell", js.undefined)
    
    @scala.inline
    def setXSplit(value: Double): Self = this.set("xSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXSplit: Self = this.set("xSplit", js.undefined)
    
    @scala.inline
    def setYSplit(value: Double): Self = this.set("ySplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYSplit: Self = this.set("ySplit", js.undefined)
  }
}
