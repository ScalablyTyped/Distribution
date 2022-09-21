package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditEndEditing event.
  */
trait ASPxClientCardViewBatchEditEndEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var cardValues: Any
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  var focusedColumn: ASPxClientCardViewColumn
  
  /**
    * Gets the visible index of the card whose cells have been edited.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewBatchEditEndEditingEventArgs {
  
  inline def apply(cancel: Boolean, cardValues: Any, focusedColumn: ASPxClientCardViewColumn, visibleIndex: Double): ASPxClientCardViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditEndEditingEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewBatchEditEndEditingEventArgs](x: Self) {
    
    inline def setCardValues(value: Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    inline def setFocusedColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "focusedColumn", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
