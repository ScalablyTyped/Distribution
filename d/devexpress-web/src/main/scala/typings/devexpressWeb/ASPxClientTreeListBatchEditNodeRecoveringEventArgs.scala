package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeRecovering event.
  */
trait ASPxClientTreeListBatchEditNodeRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var nodeValues: js.Any
}

object ASPxClientTreeListBatchEditNodeRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditNodeRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeRecoveringEventArgs]
  }
}

