package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartElementActionEventArgs extends BootstrapChartEventArgsBase {
  val target: js.Any
}

object BootstrapChartElementActionEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control, target: js.Any): BootstrapChartElementActionEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementActionEventArgs]
  }
}

