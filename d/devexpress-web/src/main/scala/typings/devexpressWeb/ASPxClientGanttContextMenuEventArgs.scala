package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ContextMenu event.
  */
trait ASPxClientGanttContextMenuEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the DHTML event object that contains information about the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets information about the right-clicked object.
    */
  var objectInfo: Any
}
object ASPxClientGanttContextMenuEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, objectInfo: Any): ASPxClientGanttContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], objectInfo = objectInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttContextMenuEventArgs]
  }
  
  extension [Self <: ASPxClientGanttContextMenuEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setObjectInfo(value: Any): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
  }
}
