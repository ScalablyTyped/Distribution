package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ExpandedChanged events.
  */
trait BootstrapClientTreeViewNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a node object related to the event.
    * Value: A BootstrapClientTreeViewNode object, manipulations on which forced the event to be raised.
    */
  var node: BootstrapClientTreeViewNode
}

object BootstrapClientTreeViewNodeEventArgs {
  @scala.inline
  def apply(node: BootstrapClientTreeViewNode): BootstrapClientTreeViewNodeEventArgs = {
    val __obj = js.Dynamic.literal(node = node)
  
    __obj.asInstanceOf[BootstrapClientTreeViewNodeEventArgs]
  }
}

