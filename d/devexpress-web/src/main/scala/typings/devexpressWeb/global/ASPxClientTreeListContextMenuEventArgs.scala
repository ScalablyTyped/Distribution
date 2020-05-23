package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
@JSGlobal("ASPxClientTreeListContextMenuEventArgs")
@js.native
class ASPxClientTreeListContextMenuEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListContextMenuEventArgs {
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets a value that identifies the right-clicked object.
    */
  /* CompleteClass */
  override var objectKey: js.Any = js.native
  /**
    * Identifies which tree list element has been right-clicked.
    */
  /* CompleteClass */
  override var objectType: String = js.native
}

