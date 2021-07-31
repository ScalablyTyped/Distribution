package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
trait ASPxClientTreeViewNodeClickEventArgs
  extends StObject
     with ASPxClientTreeViewNodeProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed node.
    */
  var htmlElement: js.Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}
object ASPxClientTreeViewNodeClickEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeViewNodeClickEventArgsMutableBuilder[Self <: ASPxClientTreeViewNodeClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
