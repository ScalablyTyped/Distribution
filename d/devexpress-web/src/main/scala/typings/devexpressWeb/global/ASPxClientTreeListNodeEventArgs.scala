package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
  */
@JSGlobal("ASPxClientTreeListNodeEventArgs")
@js.native
class ASPxClientTreeListNodeEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListNodeEventArgs {
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
}

