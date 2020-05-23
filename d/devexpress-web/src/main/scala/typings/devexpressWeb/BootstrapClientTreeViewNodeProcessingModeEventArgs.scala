package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events related to node processing, and allowing the event's processing to be passed to the server side.
  */
trait BootstrapClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}

object BootstrapClientTreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeProcessingModeEventArgs]
  }
}

