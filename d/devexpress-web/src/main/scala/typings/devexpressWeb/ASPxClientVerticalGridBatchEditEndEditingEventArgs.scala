package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditEndEditing event.
  */
trait ASPxClientVerticalGridBatchEditEndEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the row to which the edited cell belongs.
    */
  var focusedRow: ASPxClientVerticalGridRow
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: Any
  
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  
  inline def apply(cancel: Boolean, focusedRow: ASPxClientVerticalGridRow, recordValues: Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedRow = focusedRow.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditEndEditingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientVerticalGridBatchEditEndEditingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFocusedRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "focusedRow", value.asInstanceOf[js.Any])
    
    inline def setRecordValues(value: Any): Self = StObject.set(x, "recordValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
