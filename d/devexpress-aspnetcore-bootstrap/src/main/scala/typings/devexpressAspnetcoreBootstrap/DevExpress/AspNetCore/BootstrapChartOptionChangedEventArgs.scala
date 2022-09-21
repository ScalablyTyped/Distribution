package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapChartOptionChangedEventArgs
  extends StObject
     with BootstrapChartEventArgsBase {
  
  val fullName: String
  
  val name: String
  
  val previousValue: Any
  
  val value: Any
}
object BootstrapChartOptionChangedEventArgs {
  
  inline def apply(
    component: Any,
    element: Any,
    fullName: String,
    name: String,
    previousValue: Any,
    sender: Control,
    value: Any
  ): BootstrapChartOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartOptionChangedEventArgs]
  }
  
  extension [Self <: BootstrapChartOptionChangedEventArgs](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
