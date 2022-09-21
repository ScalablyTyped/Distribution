package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartEventArgsBase
  extends StObject
     with EventArgs {
  
  val component: Any
  
  val element: Any
}
object BootstrapChartEventArgsBase {
  
  inline def apply(component: Any, element: Any, sender: Control): BootstrapChartEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartEventArgsBase]
  }
  
  extension [Self <: BootstrapChartEventArgsBase](x: Self) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
