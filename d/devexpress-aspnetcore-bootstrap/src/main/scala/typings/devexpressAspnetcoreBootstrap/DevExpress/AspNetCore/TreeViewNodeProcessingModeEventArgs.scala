package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewNodeProcessingModeEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val node: BootstrapTreeViewNode
}
object TreeViewNodeProcessingModeEventArgs {
  
  inline def apply(node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeViewNodeProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    inline def setNode(value: BootstrapTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
