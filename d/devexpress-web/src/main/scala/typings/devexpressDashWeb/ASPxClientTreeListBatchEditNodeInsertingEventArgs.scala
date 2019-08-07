package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeInsertingEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeInsertingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeInsertingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param parentNodeKey A String value that identifies the processed node's parent node.
    */
  def this(nodeKey: String, parentNodeKey: String) = this()
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  /**
    * Gets the parent node key.
    */
  var parentNodeKey: String = js.native
}

