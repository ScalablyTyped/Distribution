package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the EndDragNode event.
  */
trait ASPxClientTreeListEndDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  /**
    * Gets the target element.
    * Value: An object that represents the target element to which the dragged node has been dropped.
    */
  var targetElement: js.Object
}

object ASPxClientTreeListEndDragNodeEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Object, nodeKey: java.lang.String, targetElement: js.Object): ASPxClientTreeListEndDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, nodeKey = nodeKey, targetElement = targetElement)
  
    __obj.asInstanceOf[ASPxClientTreeListEndDragNodeEventArgs]
  }
}

