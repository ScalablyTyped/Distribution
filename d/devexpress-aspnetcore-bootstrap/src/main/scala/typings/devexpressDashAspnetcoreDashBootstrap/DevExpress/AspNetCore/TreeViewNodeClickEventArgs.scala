package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewNodeClickEventArgs extends TreeViewNodeProcessingModeEventArgs {
  val htmlElement: js.Any
  val htmlEvent: js.Any
}

object TreeViewNodeClickEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Any,
    htmlEvent: js.Any,
    node: BootstrapTreeViewNode,
    processOnServer: Boolean,
    sender: Control
  ): TreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement, htmlEvent = htmlEvent, node = node, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[TreeViewNodeClickEventArgs]
  }
}

