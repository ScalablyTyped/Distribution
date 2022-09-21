package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.StartDragNode event.
  */
trait ASPxClientTreeListStartDragNodeEventArgs
  extends StObject
     with ASPxClientTreeListNodeEventArgs {
  
  /**
    * Gets an array of targets where a node can be dragged.
    */
  var targets: js.Array[Any]
}
object ASPxClientTreeListStartDragNodeEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, nodeKey: String, targets: js.Array[Any]): ASPxClientTreeListStartDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListStartDragNodeEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListStartDragNodeEventArgs](x: Self) {
    
    inline def setTargets(value: js.Array[Any]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Any*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
