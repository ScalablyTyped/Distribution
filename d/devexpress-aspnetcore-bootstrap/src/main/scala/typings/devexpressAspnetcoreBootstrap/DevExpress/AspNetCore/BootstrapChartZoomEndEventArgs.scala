package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapChartZoomEndEventArgs extends BootstrapChartEventArgsBase {
  
  val rangeEnd: js.Any = js.native
  
  val rangeStart: js.Any = js.native
}
object BootstrapChartZoomEndEventArgs {
  
  @scala.inline
  def apply(component: js.Any, element: js.Any, rangeEnd: js.Any, rangeStart: js.Any, sender: Control): BootstrapChartZoomEndEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapChartZoomEndEventArgsOps[Self <: BootstrapChartZoomEndEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRangeEnd(value: js.Any): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStart(value: js.Any): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
  }
}
