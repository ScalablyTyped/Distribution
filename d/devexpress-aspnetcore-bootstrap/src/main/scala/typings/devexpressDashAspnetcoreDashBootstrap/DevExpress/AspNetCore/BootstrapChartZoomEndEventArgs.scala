package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(component = component, element = element, rangeEnd = rangeEnd, rangeStart = rangeStart, sender = sender)
  
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
}

