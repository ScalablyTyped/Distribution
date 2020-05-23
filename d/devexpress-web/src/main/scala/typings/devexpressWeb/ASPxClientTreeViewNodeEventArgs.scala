package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
trait ASPxClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode
}

object ASPxClientTreeViewNodeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode): ASPxClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeEventArgs]
  }
}

