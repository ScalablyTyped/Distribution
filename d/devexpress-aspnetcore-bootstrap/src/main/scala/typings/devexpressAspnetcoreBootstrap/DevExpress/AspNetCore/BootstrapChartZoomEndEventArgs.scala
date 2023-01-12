package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartZoomEndEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val rangeEnd: Any
  
  val rangeStart: Any
}
object BootstrapChartZoomEndEventArgs {
  
  inline def apply(component: Any, element: Any, rangeEnd: Any, rangeStart: Any, sender: Control): BootstrapChartZoomEndEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartZoomEndEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapChartZoomEndEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRangeEnd(value: Any): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeStart(value: Any): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
  }
}
