package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditNodeValidating event.
  */
trait ASPxClientTreeListBatchEditNodeValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: String
  /**
    * Provides validation information of a validated node.
    * Value: An object that is a hashtable containing validation information.
    */
  var validationInfo: js.Object
}

object ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  @scala.inline
  def apply(nodeKey: String, validationInfo: js.Object): ASPxClientTreeListBatchEditNodeValidatingEventArgs = {
    val __obj = js.Dynamic.literal(nodeKey = nodeKey, validationInfo = validationInfo)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeValidatingEventArgs]
  }
}

