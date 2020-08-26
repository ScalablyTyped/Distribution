package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events concerned with node processing, and that allow the event's processing to be passed to the server side.
  */
@js.native
trait ASPxClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}

object ASPxClientTreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeProcessingModeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeViewNodeProcessingModeEventArgsOps[Self <: ASPxClientTreeViewNodeProcessingModeEventArgs] (val x: Self) extends AnyVal {
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

