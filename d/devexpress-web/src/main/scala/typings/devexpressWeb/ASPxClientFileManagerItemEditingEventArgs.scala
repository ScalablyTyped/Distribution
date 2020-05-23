package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the item editing event.
  */
trait ASPxClientFileManagerItemEditingEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientFileManagerItemEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerItemEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemEditingEventArgs]
  }
}

