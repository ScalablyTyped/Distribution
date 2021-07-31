package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditStartEditing event.
  */
trait ASPxClientVerticalGridBatchEditStartEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the grid row that owns a cell that is about to be edited.
    */
  var focusedRow: ASPxClientVerticalGridRow
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any
  
  /**
    * Gets the visible index of the record whose cells are about to be edited.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridBatchEditStartEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, focusedRow: ASPxClientVerticalGridRow, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedRow = focusedRow.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditStartEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditStartEditingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusedRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "focusedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordValues(value: js.Any): Self = StObject.set(x, "recordValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
