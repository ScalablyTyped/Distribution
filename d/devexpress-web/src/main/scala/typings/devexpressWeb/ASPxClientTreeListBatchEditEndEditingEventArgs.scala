package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditEndEditingEventArgs")
@js.native
class ASPxClientTreeListBatchEditEndEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditEndEditingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param nodeValues An object representing a data source’s field values.
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

