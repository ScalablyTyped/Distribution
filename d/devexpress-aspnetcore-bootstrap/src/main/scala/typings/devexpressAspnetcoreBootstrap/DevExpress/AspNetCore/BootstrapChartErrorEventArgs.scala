package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartErrorEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val target: Any
}
object BootstrapChartErrorEventArgs {
  
  inline def apply(component: Any, element: Any, sender: Control, target: Any): BootstrapChartErrorEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartErrorEventArgs]
  }
  
  extension [Self <: BootstrapChartErrorEventArgs](x: Self) {
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
