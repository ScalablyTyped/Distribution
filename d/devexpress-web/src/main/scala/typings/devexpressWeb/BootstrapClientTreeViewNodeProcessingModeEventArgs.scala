package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events related to node processing, and allowing the event's processing to be passed to the server side.
  */
trait BootstrapClientTreeViewNodeProcessingModeEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}
object BootstrapClientTreeViewNodeProcessingModeEventArgs {
  
  inline def apply(node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeProcessingModeEventArgs]
  }
  
  extension [Self <: BootstrapClientTreeViewNodeProcessingModeEventArgs](x: Self) {
    
    inline def setNode(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
