package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartElementClickEventArgs
  extends StObject
     with BootstrapChartElementActionEventArgs {
  
  val jQueryEvent: Any
}
object BootstrapChartElementClickEventArgs {
  
  inline def apply(component: Any, element: Any, jQueryEvent: Any, sender: Control, target: Any): BootstrapChartElementClickEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], jQueryEvent = jQueryEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapChartElementClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setJQueryEvent(value: Any): Self = StObject.set(x, "jQueryEvent", value.asInstanceOf[js.Any])
  }
}
