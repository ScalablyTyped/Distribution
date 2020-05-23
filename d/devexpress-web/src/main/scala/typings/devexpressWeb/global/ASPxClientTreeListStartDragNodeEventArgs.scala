package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.StartDragNode event.
  */
@JSGlobal("ASPxClientTreeListStartDragNodeEventArgs")
@js.native
class ASPxClientTreeListStartDragNodeEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListStartDragNodeEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  override var nodeKey: String = js.native
  /**
    * Gets an array of targets where a node can be dragged.
    */
  /* CompleteClass */
  override var targets: js.Array[_] = js.native
}

