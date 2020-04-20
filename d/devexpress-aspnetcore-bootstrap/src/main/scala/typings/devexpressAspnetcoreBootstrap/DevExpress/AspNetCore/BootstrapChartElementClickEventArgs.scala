package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartElementClickEventArgs extends BootstrapChartElementActionEventArgs {
  val jQueryEvent: js.Any
}

object BootstrapChartElementClickEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, jQueryEvent: js.Any, sender: Control, target: js.Any): BootstrapChartElementClickEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], jQueryEvent = jQueryEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementClickEventArgs]
  }
}

