package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartOptionChangedEventArgs extends BootstrapChartEventArgsBase {
  val fullName: String
  val name: String
  val previousValue: js.Any
  val value: js.Any
}

object BootstrapChartOptionChangedEventArgs {
  @scala.inline
  def apply(
    component: js.Any,
    element: js.Any,
    fullName: String,
    name: String,
    previousValue: js.Any,
    sender: Control,
    value: js.Any
  ): BootstrapChartOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapChartOptionChangedEventArgs]
  }
}

