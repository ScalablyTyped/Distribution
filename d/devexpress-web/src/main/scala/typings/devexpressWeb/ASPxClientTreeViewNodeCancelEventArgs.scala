package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@js.native
trait ASPxClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}
object ASPxClientTreeViewNodeCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeViewNodeCancelEventArgsMutableBuilder[Self <: ASPxClientTreeViewNodeCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: ASPxClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
