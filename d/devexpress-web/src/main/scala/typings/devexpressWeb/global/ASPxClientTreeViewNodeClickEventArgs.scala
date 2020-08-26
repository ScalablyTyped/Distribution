package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
@JSGlobal("ASPxClientTreeViewNodeClickEventArgs")
@js.native
class ASPxClientTreeViewNodeClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeViewNodeClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An ASPxClientTreeViewNode object that represents a node related to the event.
    * @param htmlElement An HTML object that contains the processed node.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    node: typings.devexpressWeb.ASPxClientTreeViewNode,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
}

