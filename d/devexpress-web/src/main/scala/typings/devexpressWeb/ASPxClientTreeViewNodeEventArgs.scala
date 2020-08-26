package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@js.native
trait ASPxClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}

object ASPxClientTreeViewNodeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode): ASPxClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeViewNodeEventArgsOps[Self <: ASPxClientTreeViewNodeEventArgs] (val x: Self) extends AnyVal {
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

