package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.KeyDown event.
  */
@js.native
trait ASPxClientRichEditKeyDownEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientRichEditKeyDownEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, htmlEvent: js.Any): ASPxClientRichEditKeyDownEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditKeyDownEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditKeyDownEventArgsMutableBuilder[Self <: ASPxClientRichEditKeyDownEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
