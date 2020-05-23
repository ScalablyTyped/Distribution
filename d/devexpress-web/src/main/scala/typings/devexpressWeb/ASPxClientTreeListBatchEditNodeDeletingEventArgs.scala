package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeDeleting event.
  */
trait ASPxClientTreeListBatchEditNodeDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any
}

object ASPxClientTreeListBatchEditNodeDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditNodeDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeDeletingEventArgs]
  }
}

