package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
@JSGlobal("BootstrapClientTreeViewNodeClickEventArgs")
@js.native
class BootstrapClientTreeViewNodeClickEventArgs protected () extends BootstrapClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTreeViewNodeClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An BootstrapClientTreeViewNode object that represents a node related to the event.
    * @param htmlElement An HTML object that contains the processed node.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    node: BootstrapClientTreeViewNode,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
  /**
    * Gets an HTML object that contains the processed Tree View node.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

