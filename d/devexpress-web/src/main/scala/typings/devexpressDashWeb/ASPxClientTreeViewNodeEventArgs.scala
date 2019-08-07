package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("ASPxClientTreeViewNodeEventArgs")
@js.native
class ASPxClientTreeViewNodeEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeEventArgs type with the specified value.
    * @param node An ASPxClientTreeViewNode object representing the node related to the event.
    */
  def this(node: ASPxClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}

