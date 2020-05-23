package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
trait ASPxClientTreeViewNodeClickEventArgs extends ASPxClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Gets the HTML object that contains the processed node.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientTreeViewNodeClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeClickEventArgs]
  }
}

