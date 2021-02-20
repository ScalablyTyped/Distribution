package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
@js.native
trait ASPxClientTabControlTabClickEventArgs extends ASPxClientTabControlTabCancelEventArgs {
  
  /**
    * Gets the HTML object that contains the processed tab.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}
object ASPxClientTabControlTabClickEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    htmlElement: js.Any,
    htmlEvent: js.Any,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: ASPxClientTab
  ): ASPxClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTabControlTabClickEventArgsMutableBuilder[Self <: ASPxClientTabControlTabClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
