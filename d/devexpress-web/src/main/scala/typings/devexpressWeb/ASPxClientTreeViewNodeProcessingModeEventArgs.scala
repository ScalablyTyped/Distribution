package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events concerned with node processing, and that allow the event's processing to be passed to the server side.
  */
@js.native
trait ASPxClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}
object ASPxClientTreeViewNodeProcessingModeEventArgs {
  
  @scala.inline
  def apply(node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeViewNodeProcessingModeEventArgsMutableBuilder[Self <: ASPxClientTreeViewNodeProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: ASPxClientTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
