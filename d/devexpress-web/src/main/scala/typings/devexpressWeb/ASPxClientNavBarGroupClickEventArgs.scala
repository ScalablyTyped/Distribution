package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
trait ASPxClientNavBarGroupClickEventArgs
  extends StObject
     with ASPxClientNavBarGroupCancelEventArgs {
  
  /**
    * Gets the HTML object that contains the processed group.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object ASPxClientNavBarGroupClickEventArgs {
  
  inline def apply(
    cancel: Boolean,
    group: ASPxClientNavBarGroup,
    htmlElement: Any,
    htmlEvent: Any,
    processOnServer: Boolean
  ): ASPxClientNavBarGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupClickEventArgs]
  }
  
  extension [Self <: ASPxClientNavBarGroupClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
