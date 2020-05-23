package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events concerned with node processing, and that allow the event's processing to be passed to the server side.
  */
trait ASPxClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode
}

object ASPxClientTreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeProcessingModeEventArgs]
  }
}

