package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapChartOptionChangedEventArgs extends BootstrapChartEventArgsBase {
  
  val fullName: String = js.native
  
  val name: String = js.native
  
  val previousValue: js.Any = js.native
  
  val value: js.Any = js.native
}
object BootstrapChartOptionChangedEventArgs {
  
  @scala.inline
  def apply(
    component: js.Any,
    element: js.Any,
    fullName: String,
    name: String,
    previousValue: js.Any,
    sender: Control,
    value: js.Any
  ): BootstrapChartOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartOptionChangedEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapChartOptionChangedEventArgsMutableBuilder[Self <: BootstrapChartOptionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
