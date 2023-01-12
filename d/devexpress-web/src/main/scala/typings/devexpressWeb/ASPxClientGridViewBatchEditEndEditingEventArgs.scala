package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditEndEditing event.
  */
trait ASPxClientGridViewBatchEditEndEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  var focusedColumn: ASPxClientGridViewColumn
  
  /**
    * Gets the row's key.
    */
  var key: Any
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: Any
  
  /**
    * Gets the visible index of the row whose cells has been edited.
    */
  var visibleIndex: Double
}
object ASPxClientGridViewBatchEditEndEditingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    focusedColumn: ASPxClientGridViewColumn,
    key: Any,
    rowValues: Any,
    visibleIndex: Double
  ): ASPxClientGridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditEndEditingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGridViewBatchEditEndEditingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFocusedColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRowValues(value: Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
