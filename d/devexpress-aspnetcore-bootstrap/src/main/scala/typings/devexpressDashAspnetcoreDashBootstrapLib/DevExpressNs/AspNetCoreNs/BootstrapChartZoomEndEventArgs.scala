package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartZoomEndEventArgs extends BootstrapChartEventArgsBase {
  val rangeEnd: js.Any
  val rangeStart: js.Any
}

object BootstrapChartZoomEndEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, rangeEnd: js.Any, rangeStart: js.Any, sender: Control): BootstrapChartZoomEndEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("rangeEnd")(rangeEnd)
    __obj.updateDynamic("rangeStart")(rangeStart)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
}

