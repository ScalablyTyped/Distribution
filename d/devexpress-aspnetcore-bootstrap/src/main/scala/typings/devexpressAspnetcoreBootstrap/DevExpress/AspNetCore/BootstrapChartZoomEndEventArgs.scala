package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
}

