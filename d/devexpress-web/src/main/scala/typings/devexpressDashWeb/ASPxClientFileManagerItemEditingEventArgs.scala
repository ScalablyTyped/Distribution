package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the item editing event.
  */
trait ASPxClientFileManagerItemEditingEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
}

object ASPxClientFileManagerItemEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerItemEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, fullName = fullName, isFolder = isFolder, name = name)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemEditingEventArgs]
  }
}

