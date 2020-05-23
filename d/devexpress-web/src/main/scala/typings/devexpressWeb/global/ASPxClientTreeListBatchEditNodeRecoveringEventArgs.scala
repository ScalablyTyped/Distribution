package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeRecovering event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeRecoveringEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeRecoveringEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditNodeRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeRecoveringEventArgs class.
    * @param nodeKey A string object that is the node key.
    * @param nodeValues An object representing the node values.
    */
  def this(nodeKey: String, nodeValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  override var nodeKey: String = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  override var nodeValues: js.Any = js.native
}

