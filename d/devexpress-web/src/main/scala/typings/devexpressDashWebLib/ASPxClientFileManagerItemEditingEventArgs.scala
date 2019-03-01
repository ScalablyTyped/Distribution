package typings
package devexpressDashWebLib

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
  var cancel: scala.Boolean
}

object ASPxClientFileManagerItemEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, fullName: java.lang.String, isFolder: scala.Boolean, name: java.lang.String): ASPxClientFileManagerItemEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("isFolder")(isFolder)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientFileManagerItemEditingEventArgs]
  }
}

