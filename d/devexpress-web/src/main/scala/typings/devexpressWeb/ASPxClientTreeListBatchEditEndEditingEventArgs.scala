package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
trait ASPxClientTreeListBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any
}

object ASPxClientTreeListBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditEndEditingEventArgs]
  }
}

