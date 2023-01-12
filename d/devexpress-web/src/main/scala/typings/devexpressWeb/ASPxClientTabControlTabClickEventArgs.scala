package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
trait ASPxClientTabControlTabClickEventArgs
  extends StObject
     with ASPxClientTabControlTabCancelEventArgs {
  
  /**
    * Gets the HTML object that contains the processed tab.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object ASPxClientTabControlTabClickEventArgs {
  
  inline def apply(
    cancel: Boolean,
    htmlElement: Any,
    htmlEvent: Any,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: ASPxClientTab
  ): ASPxClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientTabControlTabClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
