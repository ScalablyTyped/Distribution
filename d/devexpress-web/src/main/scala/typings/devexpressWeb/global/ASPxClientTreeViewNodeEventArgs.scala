package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanged events.
  */
@JSGlobal("ASPxClientTreeViewNodeEventArgs")
@js.native
class ASPxClientTreeViewNodeEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeViewNodeEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeEventArgs type with the specified value.
    * @param node An ASPxClientTreeViewNode object representing the node related to the event.
    */
  def this(node: typings.devexpressWeb.ASPxClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  override var node: typings.devexpressWeb.ASPxClientTreeViewNode = js.native
}

