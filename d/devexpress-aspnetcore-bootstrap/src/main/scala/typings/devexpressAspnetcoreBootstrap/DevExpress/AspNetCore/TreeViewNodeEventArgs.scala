package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewNodeEventArgs extends EventArgs {
  val node: BootstrapTreeViewNode = js.native
}

object TreeViewNodeEventArgs {
  @scala.inline
  def apply(node: BootstrapTreeViewNode, sender: Control): TreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeEventArgs]
  }
  @scala.inline
  implicit class TreeViewNodeEventArgsOps[Self <: TreeViewNodeEventArgs] (val x: Self) extends AnyVal {
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

