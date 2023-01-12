package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartElementActionEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val target: Any
}
object BootstrapChartElementActionEventArgs {
  
  inline def apply(component: Any, element: Any, sender: Control, target: Any): BootstrapChartElementActionEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementActionEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapChartElementActionEventArgs] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
