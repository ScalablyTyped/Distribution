package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a cell that is being edited.
  */
@js.native
trait ASPxClientVerticalGridCellInfo extends js.Object {
  
  /**
    * Gets the visible index of the record that contains the cell currently being processed.
    */
  var recordVisibleIndex: Double = js.native
  
  /**
    * Gets the row that contains the cell currently being processed.
    */
  var row: ASPxClientVerticalGridRow = js.native
}
object ASPxClientVerticalGridCellInfo {
  
  @scala.inline
  def apply(recordVisibleIndex: Double, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridCellInfo = {
    val __obj = js.Dynamic.literal(recordVisibleIndex = recordVisibleIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridCellInfo]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridCellInfoOps[Self <: ASPxClientVerticalGridCellInfo] (val x: Self) extends AnyVal {
    
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
    def setRecordVisibleIndex(value: Double): Self = this.set("recordVisibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: ASPxClientVerticalGridRow): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
