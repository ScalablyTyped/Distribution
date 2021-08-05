package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewNodeClickEventArgs
  extends StObject
     with TreeViewNodeProcessingModeEventArgs {
  
  val htmlElement: js.Any
  
  val htmlEvent: js.Any
}
object TreeViewNodeClickEventArgs {
  
  inline def apply(
    htmlElement: js.Any,
    htmlEvent: js.Any,
    node: BootstrapTreeViewNode,
    processOnServer: Boolean,
    sender: Control
  ): TreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeClickEventArgs]
  }
  
  extension [Self <: TreeViewNodeClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
