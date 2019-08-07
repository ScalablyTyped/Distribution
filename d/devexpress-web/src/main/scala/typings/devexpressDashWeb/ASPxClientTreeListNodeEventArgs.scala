package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
  */
@JSGlobal("ASPxClientTreeListNodeEventArgs")
@js.native
class ASPxClientTreeListNodeEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
}

