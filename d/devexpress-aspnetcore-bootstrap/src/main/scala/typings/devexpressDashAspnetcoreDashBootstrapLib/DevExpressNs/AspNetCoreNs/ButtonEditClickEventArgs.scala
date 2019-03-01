package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEditClickEventArgs extends ProcessingModeEventArgs {
  val buttonIndex: scala.Double
}

object ButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: scala.Double, processOnServer: scala.Boolean, sender: Control): ButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonIndex")(buttonIndex)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ButtonEditClickEventArgs]
  }
}

