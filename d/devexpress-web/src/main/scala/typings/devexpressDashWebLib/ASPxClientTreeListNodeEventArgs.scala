package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the NodeDblClick events.
  */
trait ASPxClientTreeListNodeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
  /**
    * Provides access to the parameters associated with the NodeDblClick events.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
  /**
    * Gets the processed node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: java.lang.String
}

object ASPxClientTreeListNodeEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Object, nodeKey: java.lang.String): ASPxClientTreeListNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, nodeKey = nodeKey)
  
    __obj.asInstanceOf[ASPxClientTreeListNodeEventArgs]
  }
}

