package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(component = component, element = element, fullName = fullName, name = name, previousValue = previousValue, sender = sender, value = value)
  
    __obj.asInstanceOf[BootstrapChartOptionChangedEventArgs]
  }
}

