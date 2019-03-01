package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditCardValidatingEventArgs extends EventArgs {
  val validationInfo: js.Any
  val visibleIndex: scala.Double
}

object CardViewBatchEditCardValidatingEventArgs {
  @scala.inline
  def apply(sender: Control, validationInfo: js.Any, visibleIndex: scala.Double): CardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("validationInfo")(validationInfo)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[CardViewBatchEditCardValidatingEventArgs]
  }
}

