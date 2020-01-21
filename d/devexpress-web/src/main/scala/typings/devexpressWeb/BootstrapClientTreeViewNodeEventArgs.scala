package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("BootstrapClientTreeViewNodeEventArgs")
@js.native
class BootstrapClientTreeViewNodeEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTreeViewNodeEventArgs type with the specified value.
    * @param node An BootstrapClientTreeViewNode object representing the node related to the event.
    */
  def this(node: BootstrapClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  var node: BootstrapClientTreeViewNode = js.native
}

