package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeInsertingEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeInsertingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeInsertingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param parentNodeKey A String value that identifies the processed node's parent node.
    */
  def this(nodeKey: String, parentNodeKey: String) = this()
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
    * Gets the parent node key.
    */
  /* CompleteClass */
  override var parentNodeKey: String = js.native
}

