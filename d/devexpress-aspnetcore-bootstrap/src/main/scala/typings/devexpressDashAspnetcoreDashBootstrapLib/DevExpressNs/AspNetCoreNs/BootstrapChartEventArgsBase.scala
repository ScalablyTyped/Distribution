package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartEventArgsBase extends EventArgs {
  val component: js.Any
  val element: js.Any
}

object BootstrapChartEventArgsBase {
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control): BootstrapChartEventArgsBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[BootstrapChartEventArgsBase]
  }
}

