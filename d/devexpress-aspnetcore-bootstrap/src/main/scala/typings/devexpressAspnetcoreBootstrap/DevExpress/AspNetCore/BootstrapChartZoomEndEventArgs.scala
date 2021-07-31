package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartZoomEndEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val rangeEnd: js.Any
  
  val rangeStart: js.Any
}
object BootstrapChartZoomEndEventArgs {
  
  @scala.inline
  def apply(component: js.Any, element: js.Any, rangeEnd: js.Any, rangeStart: js.Any, sender: Control): BootstrapChartZoomEndEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapChartZoomEndEventArgsMutableBuilder[Self <: BootstrapChartZoomEndEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangeEnd(value: js.Any): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStart(value: js.Any): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
  }
}
