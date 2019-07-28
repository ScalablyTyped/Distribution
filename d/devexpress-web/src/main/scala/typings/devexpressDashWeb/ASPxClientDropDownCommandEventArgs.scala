package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDropDownCommandEventArgs extends ASPxClientCancelEventArgs {
  var commandName: String
}

object ASPxClientDropDownCommandEventArgs {
  @scala.inline
  def apply(cancel: Boolean, commandName: String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, commandName = commandName)
  
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
}

