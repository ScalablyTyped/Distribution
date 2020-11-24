package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the selection in the Spreadsheet.
  */
@js.native
trait ASPxClientSpreadsheetSelection extends js.Object {
  
  /**
    * Gets the column index of the active cell.
    */
  var activeCellColumnIndex: Double = js.native
  
  /**
    * Gets the row index of the active cell.
    */
  var activeCellRowIndex: Double = js.native
  
  /**
    * Gets the index of the selection's bottom row.
    */
  var bottomRowIndex: Double = js.native
  
  /**
    * Gets the index of the selection's left column.
    */
  var leftColumnIndex: Double = js.native
  
  /**
    * Gets the index of the selection's right column.
    */
  var rightColumnIndex: Double = js.native
  
  /**
    * Gets the index of the selection's top row.
    */
  var topRowIndex: Double = js.native
}
object ASPxClientSpreadsheetSelection {
  
  @scala.inline
  def apply(
    activeCellColumnIndex: Double,
    activeCellRowIndex: Double,
    bottomRowIndex: Double,
    leftColumnIndex: Double,
    rightColumnIndex: Double,
    topRowIndex: Double
  ): ASPxClientSpreadsheetSelection = {
    val __obj = js.Dynamic.literal(activeCellColumnIndex = activeCellColumnIndex.asInstanceOf[js.Any], activeCellRowIndex = activeCellRowIndex.asInstanceOf[js.Any], bottomRowIndex = bottomRowIndex.asInstanceOf[js.Any], leftColumnIndex = leftColumnIndex.asInstanceOf[js.Any], rightColumnIndex = rightColumnIndex.asInstanceOf[js.Any], topRowIndex = topRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetSelection]
  }
  
  @scala.inline
  implicit class ASPxClientSpreadsheetSelectionOps[Self <: ASPxClientSpreadsheetSelection] (val x: Self) extends AnyVal {
    
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
    def setActiveCellColumnIndex(value: Double): Self = this.set("activeCellColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveCellRowIndex(value: Double): Self = this.set("activeCellRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomRowIndex(value: Double): Self = this.set("bottomRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftColumnIndex(value: Double): Self = this.set("leftColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightColumnIndex(value: Double): Self = this.set("rightColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRowIndex(value: Double): Self = this.set("topRowIndex", value.asInstanceOf[js.Any])
  }
}
