package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditEndEditingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val rowValues: Any
  
  val visibleIndex: Double
}
object GridViewBatchEditEndEditingEventArgs {
  
  inline def apply(cancel: Boolean, rowValues: Any, sender: Control, visibleIndex: Double): GridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditEndEditingEventArgs]
  }
  
  extension [Self <: GridViewBatchEditEndEditingEventArgs](x: Self) {
    
    inline def setRowValues(value: Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
