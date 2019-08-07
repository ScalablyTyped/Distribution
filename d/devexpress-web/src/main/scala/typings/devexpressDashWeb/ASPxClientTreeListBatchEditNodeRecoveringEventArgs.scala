package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeRecovering event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeRecoveringEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeRecoveringEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeRecoveringEventArgs class.
    * @param nodeKey A string object that is the node key.
    * @param nodeValues An object representing the node values.
    */
  def this(nodeKey: String, nodeValues: js.Any) = this()
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var nodeValues: js.Any = js.native
}

