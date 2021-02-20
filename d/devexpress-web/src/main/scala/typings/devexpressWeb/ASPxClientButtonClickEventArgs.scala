package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientButton.Click event.
  */
@js.native
trait ASPxClientButtonClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  var cancelEventAndBubble: Boolean = js.native
}
object ASPxClientButtonClickEventArgs {
  
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientButtonClickEventArgsMutableBuilder[Self <: ASPxClientButtonClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelEventAndBubble(value: Boolean): Self = StObject.set(x, "cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
}
