package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.StartDragNode event.
  */
trait ASPxClientTreeListStartDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  /**
    * Gets an array of targets where a node can be dragged.
    */
  var targets: js.Array[_]
}

object ASPxClientTreeListStartDragNodeEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targets: js.Array[_]): ASPxClientTreeListStartDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListStartDragNodeEventArgs]
  }
}

