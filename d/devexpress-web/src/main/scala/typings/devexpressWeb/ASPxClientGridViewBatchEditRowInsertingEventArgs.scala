package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowInserting event.
  */
trait ASPxClientGridViewBatchEditRowInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientGridViewBatchEditRowInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientGridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowInsertingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowInsertingEventArgsMutableBuilder[Self <: ASPxClientGridViewBatchEditRowInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
