package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeCancelEventArgs extends ProcessingModeCancelEventArgs {
  val node: BootstrapTreeViewNode
}

object TreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeViewNodeCancelEventArgs]
  }
}

