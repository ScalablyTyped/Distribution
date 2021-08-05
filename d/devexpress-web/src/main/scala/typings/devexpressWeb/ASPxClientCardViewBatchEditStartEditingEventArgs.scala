package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditStartEditing event.
  */
trait ASPxClientCardViewBatchEditStartEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var cardValues: js.Any
  
  /**
    * Gets the CardView column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientCardViewColumn
  
  /**
    * Gets the visible index of the card whose cells are about to be edited.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewBatchEditStartEditingEventArgs {
  
  inline def apply(cancel: Boolean, cardValues: js.Any, focusedColumn: ASPxClientCardViewColumn, visibleIndex: Double): ASPxClientCardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditStartEditingEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewBatchEditStartEditingEventArgs](x: Self) {
    
    inline def setCardValues(value: js.Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    inline def setFocusedColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
