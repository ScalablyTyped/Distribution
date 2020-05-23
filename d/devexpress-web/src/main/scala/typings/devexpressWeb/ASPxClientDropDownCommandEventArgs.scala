package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
trait ASPxClientDropDownCommandEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  var commandName: String
}

object ASPxClientDropDownCommandEventArgs {
  @scala.inline
  def apply(cancel: Boolean, commandName: String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
}

