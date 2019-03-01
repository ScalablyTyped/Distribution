package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingModeEventArgs extends EventArgs {
  var processOnServer: scala.Boolean
}

object ProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: scala.Boolean, sender: Control): ProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ProcessingModeEventArgs]
  }
}

