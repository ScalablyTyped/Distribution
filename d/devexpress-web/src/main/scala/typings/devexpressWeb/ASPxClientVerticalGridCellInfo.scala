package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a cell that is being edited.
  */
trait ASPxClientVerticalGridCellInfo extends StObject {
  
  /**
    * Gets the visible index of the record that contains the cell currently being processed.
    */
  var recordVisibleIndex: Double
  
  /**
    * Gets the row that contains the cell currently being processed.
    */
  var row: ASPxClientVerticalGridRow
}
object ASPxClientVerticalGridCellInfo {
  
  @scala.inline
  def apply(recordVisibleIndex: Double, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridCellInfo = {
    val __obj = js.Dynamic.literal(recordVisibleIndex = recordVisibleIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridCellInfo]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridCellInfoMutableBuilder[Self <: ASPxClientVerticalGridCellInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordVisibleIndex(value: Double): Self = StObject.set(x, "recordVisibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
