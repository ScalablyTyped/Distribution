package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@js.native
trait ASPxClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}

object ASPxClientTreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeViewNodeCancelEventArgsOps[Self <: ASPxClientTreeViewNodeCancelEventArgs] (val x: Self) extends AnyVal {
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
    def setNode(value: ASPxClientTreeViewNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

