package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
@js.native
trait ASPxClientNavBarGroupClickEventArgs extends ASPxClientNavBarGroupCancelEventArgs {
  
  /**
    * Gets the HTML object that contains the processed group.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientNavBarGroupClickEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    group: ASPxClientNavBarGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any,
    processOnServer: Boolean
  ): ASPxClientNavBarGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarGroupClickEventArgsMutableBuilder[Self <: ASPxClientNavBarGroupClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
