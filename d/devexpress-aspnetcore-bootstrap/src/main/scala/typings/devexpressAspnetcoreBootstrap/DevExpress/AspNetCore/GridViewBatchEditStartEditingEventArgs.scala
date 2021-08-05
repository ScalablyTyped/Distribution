package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditStartEditingEventArgs
  extends StObject
     with CancelEventArgs {
  
  var focusedColumn: BootstrapGridViewColumn
  
  val rowValues: js.Any
  
  val visibleIndex: Double
}
object GridViewBatchEditStartEditingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    focusedColumn: BootstrapGridViewColumn,
    rowValues: js.Any,
    sender: Control,
    visibleIndex: Double
  ): GridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
  
  extension [Self <: GridViewBatchEditStartEditingEventArgs](x: Self) {
    
    inline def setFocusedColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setRowValues(value: js.Any): Self = StObject.set(x, "rowValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
