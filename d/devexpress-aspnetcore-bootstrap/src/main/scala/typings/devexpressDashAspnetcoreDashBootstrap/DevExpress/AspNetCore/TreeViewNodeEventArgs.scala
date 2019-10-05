package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeEventArgs extends EventArgs {
  val node: BootstrapTreeViewNode
}

object TreeViewNodeEventArgs {
  @scala.inline
  def apply(node: BootstrapTreeViewNode, sender: Control): TreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node, sender = sender)
  
    __obj.asInstanceOf[TreeViewNodeEventArgs]
  }
}

