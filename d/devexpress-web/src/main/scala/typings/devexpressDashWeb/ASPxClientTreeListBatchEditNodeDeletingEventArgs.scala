package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeDeleting event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeDeletingEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeDeletingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeDeletingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param nodeValues An object representing a data source field values.
    */
  def this(nodeKey: String, nodeValues: js.Any) = this()
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any = js.native
}

