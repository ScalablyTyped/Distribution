package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewNodeEventArgs
  extends StObject
     with EventArgs {
  
  val node: BootstrapTreeViewNode
}
object TreeViewNodeEventArgs {
  
  @scala.inline
  def apply(node: BootstrapTreeViewNode, sender: Control): TreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeEventArgs]
  }
  
  @scala.inline
  implicit class TreeViewNodeEventArgsMutableBuilder[Self <: TreeViewNodeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: BootstrapTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
