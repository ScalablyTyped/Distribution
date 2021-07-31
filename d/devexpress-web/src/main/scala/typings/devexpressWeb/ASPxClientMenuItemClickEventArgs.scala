package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's items.
  */
trait ASPxClientMenuItemClickEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem
}
object ASPxClientMenuItemClickEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientMenuItemClickEventArgsMutableBuilder[Self <: ASPxClientMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
