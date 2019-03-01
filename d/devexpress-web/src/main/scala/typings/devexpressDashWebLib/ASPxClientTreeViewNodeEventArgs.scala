package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ExpandedChanged events.
  */
trait ASPxClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a node object related to the event.
    * Value: An ASPxClientTreeViewNode object, manipulations on which forced the event to be raised.
    */
  var node: ASPxClientTreeViewNode
}

object ASPxClientTreeViewNodeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode): ASPxClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ASPxClientTreeViewNodeEventArgs]
  }
}

