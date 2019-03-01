package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewCustomButtonEventArgs extends ProcessingModeEventArgs {
  val buttonID: java.lang.String
  val visibleIndex: scala.Double
}

object GridViewCustomButtonEventArgs {
  @scala.inline
  def apply(
    buttonID: java.lang.String,
    processOnServer: scala.Boolean,
    sender: Control,
    visibleIndex: scala.Double
  ): GridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonID")(buttonID)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[GridViewCustomButtonEventArgs]
  }
}

