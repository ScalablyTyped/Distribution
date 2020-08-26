package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
@js.native
trait ASPxClientTreeListBatchEditNodeInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  /**
    * Gets the parent node key.
    */
  var parentNodeKey: String = js.native
}

object ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, parentNodeKey: String): ASPxClientTreeListBatchEditNodeInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], parentNodeKey = parentNodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeInsertingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListBatchEditNodeInsertingEventArgsOps[Self <: ASPxClientTreeListBatchEditNodeInsertingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNodeKey(value: String): Self = this.set("nodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNodeKey(value: String): Self = this.set("parentNodeKey", value.asInstanceOf[js.Any])
  }
  
}

