package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
trait ASPxClientTreeViewNodeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode
}
object ASPxClientTreeViewNodeEventArgs {
  
  inline def apply(node: ASPxClientTreeViewNode): ASPxClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeEventArgs]
  }
  
  extension [Self <: ASPxClientTreeViewNodeEventArgs](x: Self) {
    
    inline def setNode(value: ASPxClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
