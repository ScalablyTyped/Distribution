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
    val __obj = js.Dynamic.literal(node = node, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[TreeViewNodeProcessingModeEventArgs]
  }
}

