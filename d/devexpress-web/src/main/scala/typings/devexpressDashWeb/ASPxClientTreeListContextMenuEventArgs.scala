package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ContextMenu event.
  */
trait ASPxClientTreeListContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether to invoke the browser's context menu.
    * Value: true to hide the browser's context menu; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that relates to the processed event.
    */
  var htmlEvent: js.Object
  /**
    * Gets a value that identifies the right-clicked object.
    * Value: The right-clicked object's identifier.
    */
  var objectKey: js.Object
  /**
    * Identifies which tree list element has been right-clicked.
    * Value: A string value that identifies which tree list element ('Header' or 'Node') has been right-clicked.
    */
  var objectType: String
}

object ASPxClientTreeListContextMenuEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Object, objectKey: js.Object, objectType: String): ASPxClientTreeListContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, objectKey = objectKey, objectType = objectType)
  
    __obj.asInstanceOf[ASPxClientTreeListContextMenuEventArgs]
  }
}

