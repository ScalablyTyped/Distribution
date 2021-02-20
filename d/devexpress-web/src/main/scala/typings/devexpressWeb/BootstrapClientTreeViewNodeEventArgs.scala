package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@js.native
trait BootstrapClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode = js.native
}
object BootstrapClientTreeViewNodeEventArgs {
  
  @scala.inline
  def apply(node: BootstrapClientTreeViewNode): BootstrapClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientTreeViewNodeEventArgsMutableBuilder[Self <: BootstrapClientTreeViewNodeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
