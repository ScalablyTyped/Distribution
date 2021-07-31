package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartEventArgsBase
  extends StObject
     with EventArgs {
  
  val component: js.Any
  
  val element: js.Any
}
object BootstrapChartEventArgsBase {
  
  @scala.inline
  def apply(component: js.Any, element: js.Any, sender: Control): BootstrapChartEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartEventArgsBase]
  }
  
  @scala.inline
  implicit class BootstrapChartEventArgsBaseMutableBuilder[Self <: BootstrapChartEventArgsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
