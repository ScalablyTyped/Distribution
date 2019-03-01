package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeCancelEventArgs extends ProcessingModeCancelEventArgs {
  val node: BootstrapTreeViewNode
}

object TreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    node: BootstrapTreeViewNode,
    processOnServer: scala.Boolean,
    sender: Control
  ): TreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[TreeViewNodeCancelEventArgs]
  }
}

