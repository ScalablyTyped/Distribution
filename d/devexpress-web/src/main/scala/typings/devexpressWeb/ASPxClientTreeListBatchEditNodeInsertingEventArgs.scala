package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
trait ASPxClientTreeListBatchEditNodeInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  /**
    * Gets the parent node key.
    */
  var parentNodeKey: String
}

object ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, parentNodeKey: String): ASPxClientTreeListBatchEditNodeInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], parentNodeKey = parentNodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeInsertingEventArgs]
  }
}

