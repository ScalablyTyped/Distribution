package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewNodeCancelEventArgs extends ProcessingModeCancelEventArgs {
  val node: BootstrapTreeViewNode = js.native
}

object TreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeCancelEventArgs]
  }
  @scala.inline
  implicit class TreeViewNodeCancelEventArgsOps[Self <: TreeViewNodeCancelEventArgs] (val x: Self) extends AnyVal {
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
    def setNode(value: BootstrapTreeViewNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

