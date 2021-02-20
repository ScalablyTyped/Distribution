package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.KeyUp event.
  */
@js.native
trait ASPxClientRichEditKeyUpEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientRichEditKeyUpEventArgs {
  
  @scala.inline
  def apply(htmlEvent: js.Any): ASPxClientRichEditKeyUpEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditKeyUpEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditKeyUpEventArgsMutableBuilder[Self <: ASPxClientRichEditKeyUpEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
