package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events concerned with node processing, and that allow the event's processing to be passed to the server side.
  */
trait ASPxClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets a node object related to the event.
    * Value: An ASPxClientTreeViewNode object, manipulations on which forced the event to be raised.
    */
  var node: ASPxClientTreeViewNode
}

object ASPxClientTreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: ASPxClientTreeViewNode, processOnServer: scala.Boolean): ASPxClientTreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientTreeViewNodeProcessingModeEventArgs]
  }
}

