package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base data for the client-side events.
  */
trait BootstrapUIWidgetEventArgsBase
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The widget instance.
    */
  var component: Any
  
  /**
    * The widget's container.
    */
  var element: Any
}
object BootstrapUIWidgetEventArgsBase {
  
  inline def apply(component: Any, element: Any): BootstrapUIWidgetEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUIWidgetEventArgsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapUIWidgetEventArgsBase] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
