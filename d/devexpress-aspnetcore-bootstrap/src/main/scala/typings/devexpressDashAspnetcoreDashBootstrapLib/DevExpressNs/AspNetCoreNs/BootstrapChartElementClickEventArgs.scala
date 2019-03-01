package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartElementClickEventArgs extends BootstrapChartElementActionEventArgs {
  val jQueryEvent: js.Any
}

object BootstrapChartElementClickEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, jQueryEvent: js.Any, sender: Control, target: js.Any): BootstrapChartElementClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("jQueryEvent")(jQueryEvent)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BootstrapChartElementClickEventArgs]
  }
}

