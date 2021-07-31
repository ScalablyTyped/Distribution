package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartElementActionEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val target: js.Any
}
object BootstrapChartElementActionEventArgs {
  
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control, target: js.Any): BootstrapChartElementActionEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementActionEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapChartElementActionEventArgsMutableBuilder[Self <: BootstrapChartElementActionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
