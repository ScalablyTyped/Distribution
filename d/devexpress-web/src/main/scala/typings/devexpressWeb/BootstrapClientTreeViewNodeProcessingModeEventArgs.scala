package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events related to node processing, and allowing the event's processing to be passed to the server side.
  */
@js.native
trait BootstrapClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode = js.native
}
object BootstrapClientTreeViewNodeProcessingModeEventArgs {
  
  @scala.inline
  def apply(node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientTreeViewNodeProcessingModeEventArgsOps[Self <: BootstrapClientTreeViewNodeProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNode(value: BootstrapClientTreeViewNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
