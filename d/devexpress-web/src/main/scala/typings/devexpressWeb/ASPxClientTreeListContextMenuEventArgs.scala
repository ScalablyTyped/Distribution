package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
trait ASPxClientTreeListContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  var cancel: Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets a value that identifies the right-clicked object.
    */
  var objectKey: js.Any
  /**
    * Identifies which tree list element has been right-clicked.
    */
  var objectType: String
}

object ASPxClientTreeListContextMenuEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, objectKey: js.Any, objectType: String): ASPxClientTreeListContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListContextMenuEventArgs]
  }
}

