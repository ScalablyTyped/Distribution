package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowClick event.
  */
@js.native
trait ASPxClientGridViewRowClickEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowClick event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientGridViewRowClickEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientGridViewRowClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewRowClickEventArgsMutableBuilder[Self <: ASPxClientGridViewRowClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
