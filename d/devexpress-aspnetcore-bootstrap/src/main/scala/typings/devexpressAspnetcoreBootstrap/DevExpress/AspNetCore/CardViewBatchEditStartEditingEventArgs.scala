package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditStartEditingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val cardValues: js.Any
  
  var focusedColumn: BootstrapCardViewColumn
  
  val visibleIndex: Double
}
object CardViewBatchEditStartEditingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    cardValues: js.Any,
    focusedColumn: BootstrapCardViewColumn,
    sender: Control,
    visibleIndex: Double
  ): CardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditStartEditingEventArgs]
  }
  
  extension [Self <: CardViewBatchEditStartEditingEventArgs](x: Self) {
    
    inline def setCardValues(value: js.Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    inline def setFocusedColumn(value: BootstrapCardViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
