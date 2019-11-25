package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeProcessingModeEventArgs extends ProcessingModeEventArgs {
  val node: BootstrapTreeViewNode
}

object TreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeViewNodeProcessingModeEventArgs]
  }
}

