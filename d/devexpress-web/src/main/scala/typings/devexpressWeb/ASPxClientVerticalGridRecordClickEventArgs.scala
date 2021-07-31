package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RecordClick event.
  */
trait ASPxClientVerticalGridRecordClickEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientVerticalGrid.RecordClick event.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridRecordClickEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientVerticalGridRecordClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRecordClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRecordClickEventArgsMutableBuilder[Self <: ASPxClientVerticalGridRecordClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
