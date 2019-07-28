package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditNodeRecovering event.
  */
trait ASPxClientTreeListBatchEditNodeRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: String
  /**
    * Gets a hashtable that maintains information about recovered cells.
    * Value: A hashtable that stores information about recovered cells.
    */
  var nodeValues: js.Object
}

object ASPxClientTreeListBatchEditNodeRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Object): ASPxClientTreeListBatchEditNodeRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, nodeKey = nodeKey, nodeValues = nodeValues)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeRecoveringEventArgs]
  }
}

