package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDropDownCommandEventArgs extends ASPxClientCancelEventArgs {
  var commandName: java.lang.String
}

object ASPxClientDropDownCommandEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, commandName: java.lang.String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, commandName = commandName)
  
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
}

