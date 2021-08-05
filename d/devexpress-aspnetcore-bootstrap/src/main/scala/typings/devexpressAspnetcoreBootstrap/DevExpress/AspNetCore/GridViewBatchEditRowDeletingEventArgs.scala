package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditRowDeletingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val rowValues: js.Any
  
  val visibleIndex: Double
}
object GridViewBatchEditRowDeletingEventArgs {
  
  inline def apply(cancel: Boolean, rowValues: js.Any, sender: Control, visibleIndex: Double): GridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowDeletingEventArgs]
  }
  
  extension [Self <: GridViewBatchEditRowDeletingEventArgs](x: Self) {
    
    inline def setRowValues(value: js.Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
