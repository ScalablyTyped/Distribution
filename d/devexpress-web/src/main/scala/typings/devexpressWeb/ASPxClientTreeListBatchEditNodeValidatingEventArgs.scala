package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeValidating event.
  */
@js.native
trait ASPxClientTreeListBatchEditNodeValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the node's key value.
    */
  var nodeKey: String = js.native
  /**
    * Provides validation information of a validated node.
    */
  var validationInfo: js.Any = js.native
}

object ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  @scala.inline
  def apply(nodeKey: String, validationInfo: js.Any): ASPxClientTreeListBatchEditNodeValidatingEventArgs = {
    val __obj = js.Dynamic.literal(nodeKey = nodeKey.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeValidatingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListBatchEditNodeValidatingEventArgsOps[Self <: ASPxClientTreeListBatchEditNodeValidatingEventArgs] (val x: Self) extends AnyVal {
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
    def setValidationInfo(value: js.Any): Self = this.set("validationInfo", value.asInstanceOf[js.Any])
  }
  
}

