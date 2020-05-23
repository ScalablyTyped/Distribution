package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeValidating event.
  */
trait ASPxClientTreeListBatchEditNodeValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the node's key value.
    */
  var nodeKey: String
  /**
    * Provides validation information of a validated node.
    */
  var validationInfo: js.Any
}

object ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  @scala.inline
  def apply(nodeKey: String, validationInfo: js.Any): ASPxClientTreeListBatchEditNodeValidatingEventArgs = {
    val __obj = js.Dynamic.literal(nodeKey = nodeKey.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeValidatingEventArgs]
  }
}

