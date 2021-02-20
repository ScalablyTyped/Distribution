package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to clicking on the control's items.
  */
@js.native
trait BootstrapClientMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Menu item.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem = js.native
}
object BootstrapClientMenuItemClickEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: BootstrapClientMenuItem, processOnServer: Boolean): BootstrapClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemClickEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientMenuItemClickEventArgsMutableBuilder[Self <: BootstrapClientMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: BootstrapClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
