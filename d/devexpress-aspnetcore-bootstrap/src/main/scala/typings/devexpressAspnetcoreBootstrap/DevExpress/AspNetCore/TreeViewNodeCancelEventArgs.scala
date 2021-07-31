package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewNodeCancelEventArgs
  extends StObject
     with ProcessingModeCancelEventArgs {
  
  val node: BootstrapTreeViewNode
}
object TreeViewNodeCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeCancelEventArgs]
  }
  
  @scala.inline
  implicit class TreeViewNodeCancelEventArgsMutableBuilder[Self <: TreeViewNodeCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: BootstrapTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
