package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
  */
trait ASPxClientTreeListNodeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
}
object ASPxClientTreeListNodeEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String): ASPxClientTreeListNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListNodeEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListNodeEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
  }
}
