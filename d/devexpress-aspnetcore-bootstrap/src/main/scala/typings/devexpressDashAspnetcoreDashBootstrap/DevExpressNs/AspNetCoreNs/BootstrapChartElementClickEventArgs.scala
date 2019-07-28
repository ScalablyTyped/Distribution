package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartElementClickEventArgs extends BootstrapChartElementActionEventArgs {
  val jQueryEvent: js.Any
}

object BootstrapChartElementClickEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, jQueryEvent: js.Any, sender: Control, target: js.Any): BootstrapChartElementClickEventArgs = {
    val __obj = js.Dynamic.literal(component = component, element = element, jQueryEvent = jQueryEvent, sender = sender, target = target)
  
    __obj.asInstanceOf[BootstrapChartElementClickEventArgs]
  }
}

