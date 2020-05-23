package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
trait BootstrapClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode
}

object BootstrapClientTreeViewNodeEventArgs {
  @scala.inline
  def apply(node: BootstrapClientTreeViewNode): BootstrapClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeEventArgs]
  }
}

