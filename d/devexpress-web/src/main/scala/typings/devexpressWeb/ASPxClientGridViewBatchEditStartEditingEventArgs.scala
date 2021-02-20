package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
@js.native
trait ASPxClientGridViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientGridViewColumn = js.native
  
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: js.Any = js.native
  
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientGridViewBatchEditStartEditingEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedColumn: ASPxClientGridViewColumn,
    key: js.Any,
    rowValues: js.Any,
    visibleIndex: Double
  ): ASPxClientGridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditStartEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewBatchEditStartEditingEventArgsMutableBuilder[Self <: ASPxClientGridViewBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusedColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValues(value: js.Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
