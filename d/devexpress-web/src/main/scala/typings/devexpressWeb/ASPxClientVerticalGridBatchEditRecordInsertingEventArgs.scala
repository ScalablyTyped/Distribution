package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
trait ASPxClientVerticalGridBatchEditRecordInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordInsertingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordInsertingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridBatchEditRecordInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
