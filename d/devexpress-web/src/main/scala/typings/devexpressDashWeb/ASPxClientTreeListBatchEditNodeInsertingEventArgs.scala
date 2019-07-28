package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditNodeInserting event.
  */
trait ASPxClientTreeListBatchEditNodeInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: String
  /**
    * Gets the parent node key.
    * Value: A String value that identifies the parent node.
    */
  var parentNodeKey: String
}

object ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, parentNodeKey: String): ASPxClientTreeListBatchEditNodeInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, nodeKey = nodeKey, parentNodeKey = parentNodeKey)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeInsertingEventArgs]
  }
}

