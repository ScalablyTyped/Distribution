package typings
package devexpressDashWebLib

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
  var nodeKey: java.lang.String
  /**
    * Gets the parent node key.
    * Value: A String value that identifies the parent node.
    */
  var parentNodeKey: java.lang.String
}

object ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, nodeKey: java.lang.String, parentNodeKey: java.lang.String): ASPxClientTreeListBatchEditNodeInsertingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("nodeKey")(nodeKey)
    __obj.updateDynamic("parentNodeKey")(parentNodeKey)
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeInsertingEventArgs]
  }
}

