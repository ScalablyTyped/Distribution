package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartErrorEventArgs extends BootstrapChartEventArgsBase {
  val target: js.Any
}

object BootstrapChartErrorEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control, target: js.Any): BootstrapChartErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BootstrapChartErrorEventArgs]
  }
}

