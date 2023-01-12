package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to clicking on the control's items.
  */
trait BootstrapClientMenuItemClickEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Menu item.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem
}
object BootstrapClientMenuItemClickEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, item: BootstrapClientMenuItem, processOnServer: Boolean): BootstrapClientMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapClientMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setItem(value: BootstrapClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
