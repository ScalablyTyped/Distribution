package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.EndDragNode event.
  */
trait ASPxClientTreeListEndDragNodeEventArgs
  extends StObject
     with ASPxClientTreeListNodeEventArgs {
  
  /**
    * Gets the target element.
    */
  var targetElement: js.Any
}
object ASPxClientTreeListEndDragNodeEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targetElement: js.Any): ASPxClientTreeListEndDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListEndDragNodeEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListEndDragNodeEventArgs](x: Self) {
    
    inline def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
  }
}
