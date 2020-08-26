package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapChartOptionChangedEventArgs extends BootstrapChartEventArgsBase {
  val fullName: String = js.native
  val name: String = js.native
  val previousValue: js.Any = js.native
  val value: js.Any = js.native
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
  @scala.inline
  implicit class BootstrapChartOptionChangedEventArgsOps[Self <: BootstrapChartOptionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousValue(value: js.Any): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

