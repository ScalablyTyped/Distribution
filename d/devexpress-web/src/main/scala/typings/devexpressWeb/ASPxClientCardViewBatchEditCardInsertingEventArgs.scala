package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardInserting event.
  */
trait ASPxClientCardViewBatchEditCardInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed card visible index.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewBatchEditCardInsertingEventArgs {
  
  inline def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardInsertingEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewBatchEditCardInsertingEventArgs](x: Self) {
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
