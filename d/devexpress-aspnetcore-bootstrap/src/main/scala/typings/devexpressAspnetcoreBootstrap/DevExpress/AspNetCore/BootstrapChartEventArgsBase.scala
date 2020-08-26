package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapChartEventArgsBase extends EventArgs {
  val component: js.Any = js.native
  val element: js.Any = js.native
}

object BootstrapChartEventArgsBase {
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control): BootstrapChartEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartEventArgsBase]
  }
  @scala.inline
  implicit class BootstrapChartEventArgsBaseOps[Self <: BootstrapChartEventArgsBase] (val x: Self) extends AnyVal {
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
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
  }
  
}

