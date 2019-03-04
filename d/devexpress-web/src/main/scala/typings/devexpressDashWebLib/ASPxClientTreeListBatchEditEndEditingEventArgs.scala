package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditEndEditing event.
  */
trait ASPxClientTreeListBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: java.lang.String
  /**
    * Gets the value of the processed cell.
    * Value: A String value that identifies the node values.
    */
  var nodeValues: js.Object
}

object ASPxClientTreeListBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, nodeKey: java.lang.String, nodeValues: js.Object): ASPxClientTreeListBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, nodeKey = nodeKey, nodeValues = nodeValues)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditEndEditingEventArgs]
  }
}

