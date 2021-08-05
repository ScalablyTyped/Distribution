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
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any
  
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  
  inline def apply(cancel: Boolean, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditEndEditingEventArgs]
  }
  
  extension [Self <: ASPxClientVerticalGridBatchEditEndEditingEventArgs](x: Self) {
    
    inline def setRecordValues(value: js.Any): Self = StObject.set(x, "recordValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
