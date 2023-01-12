package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientButton.Click event.
  */
trait ASPxClientButtonClickEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  var cancelEventAndBubble: Boolean
}
object ASPxClientButtonClickEventArgs {
  
  inline def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean): ASPxClientButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientButtonClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCancelEventAndBubble(value: Boolean): Self = StObject.set(x, "cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
}
