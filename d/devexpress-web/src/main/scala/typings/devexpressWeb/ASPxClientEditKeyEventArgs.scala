package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events involved with a key being pressed or released.
  */
@js.native
trait ASPxClientEditKeyEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientEditKeyEventArgs {
  
  @scala.inline
  def apply(htmlEvent: js.Any): ASPxClientEditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditKeyEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientEditKeyEventArgsMutableBuilder[Self <: ASPxClientEditKeyEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
