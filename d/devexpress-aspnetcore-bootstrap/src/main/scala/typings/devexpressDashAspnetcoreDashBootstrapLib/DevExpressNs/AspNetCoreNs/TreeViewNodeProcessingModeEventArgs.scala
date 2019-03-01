package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeProcessingModeEventArgs extends ProcessingModeEventArgs {
  val node: BootstrapTreeViewNode
}

object TreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: BootstrapTreeViewNode, processOnServer: scala.Boolean, sender: Control): TreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[TreeViewNodeProcessingModeEventArgs]
  }
}

