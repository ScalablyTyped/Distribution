package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.EndDragNode event.
  */
trait ASPxClientTreeListEndDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  /**
    * Gets the target element.
    */
  var targetElement: js.Any
}

object ASPxClientTreeListEndDragNodeEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targetElement: js.Any): ASPxClientTreeListEndDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListEndDragNodeEventArgs]
  }
}

