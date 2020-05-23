package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeValidating event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeValidatingEventArgs")
@js.native
class ASPxClientTreeListBatchEditNodeValidatingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeValidatingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param validationInfo An object containing validation information.
    */
  def this(nodeKey: String, validationInfo: js.Any) = this()
  /**
    * Gets the node's key value.
    */
  /* CompleteClass */
  override var nodeKey: String = js.native
  /**
    * Provides validation information of a validated node.
    */
  /* CompleteClass */
  override var validationInfo: js.Any = js.native
}

