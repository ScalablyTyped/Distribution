package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowDeleting event.
  */
trait ASPxClientGridViewBatchEditRowDeletingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the row's key.
    */
  var key: js.Any
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var rowValues: js.Any
  
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientGridViewBatchEditRowDeletingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, key: js.Any, rowValues: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowDeletingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowDeletingEventArgsMutableBuilder[Self <: ASPxClientGridViewBatchEditRowDeletingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValues(value: js.Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
