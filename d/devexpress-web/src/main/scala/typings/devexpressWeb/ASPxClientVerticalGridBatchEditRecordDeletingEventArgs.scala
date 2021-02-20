package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditRecordDeletingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var recordValues: js.Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordDeletingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordDeletingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridBatchEditRecordDeletingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordValues(value: js.Any): Self = StObject.set(x, "recordValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
