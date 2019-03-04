package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartOptionChangedEventArgs extends BootstrapChartEventArgsBase {
  val fullName: java.lang.String
  val name: java.lang.String
  val previousValue: js.Any
  val value: js.Any
}

object BootstrapChartOptionChangedEventArgs {
  @scala.inline
  def apply(
    component: js.Any,
    element: js.Any,
    fullName: java.lang.String,
    name: java.lang.String,
    previousValue: js.Any,
    sender: Control,
    value: js.Any
  ): BootstrapChartOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(component = component, element = element, fullName = fullName, name = name, previousValue = previousValue, sender = sender, value = value)
  
    __obj.asInstanceOf[BootstrapChartOptionChangedEventArgs]
  }
}

