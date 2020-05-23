package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
  */
trait ASPxClientTreeListNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  var htmlEvent: js.Any
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
}

object ASPxClientTreeListNodeEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String): ASPxClientTreeListNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListNodeEventArgs]
  }
}

