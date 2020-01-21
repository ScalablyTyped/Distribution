package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
@JSGlobal("ASPxClientTreeListContextMenuEventArgs")
@js.native
class ASPxClientTreeListContextMenuEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  var cancel: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets a value that identifies the right-clicked object.
    */
  var objectKey: js.Any = js.native
  /**
    * Identifies which tree list element has been right-clicked.
    */
  var objectType: String = js.native
}

