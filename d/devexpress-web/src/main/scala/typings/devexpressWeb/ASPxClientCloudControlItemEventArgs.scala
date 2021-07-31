package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which involve clicking on the control's items.
  */
trait ASPxClientCloudControlItemEventArgs
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
    * Gets the name that uniquely identifies the processed item.
    */
  var name: js.Any
}
object ASPxClientCloudControlItemEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, name: js.Any, processOnServer: Boolean): ASPxClientCloudControlItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCloudControlItemEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCloudControlItemEventArgsMutableBuilder[Self <: ASPxClientCloudControlItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
