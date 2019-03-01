package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANCxClientBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  var customArgs: js.Object
}

object ANCxClientBeginCallbackEventArgs {
  @scala.inline
  def apply(command: java.lang.String, customArgs: js.Object): ANCxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("customArgs")(customArgs)
    __obj.asInstanceOf[ANCxClientBeginCallbackEventArgs]
  }
}

