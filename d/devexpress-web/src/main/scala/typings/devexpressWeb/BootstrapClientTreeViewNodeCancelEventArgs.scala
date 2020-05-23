package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
trait BootstrapClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}

object BootstrapClientTreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeCancelEventArgs]
  }
}

