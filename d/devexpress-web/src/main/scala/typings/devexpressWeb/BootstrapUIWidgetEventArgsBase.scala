package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base data for the client-side events.
  */
@js.native
trait BootstrapUIWidgetEventArgsBase extends ASPxClientEventArgs {
  
  /**
    * The widget instance.
    */
  var component: js.Any = js.native
  
  /**
    * The widget's container.
    */
  var element: js.Any = js.native
}
object BootstrapUIWidgetEventArgsBase {
  
  @scala.inline
  def apply(component: js.Any, element: js.Any): BootstrapUIWidgetEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUIWidgetEventArgsBase]
  }
  
  @scala.inline
  implicit class BootstrapUIWidgetEventArgsBaseMutableBuilder[Self <: BootstrapUIWidgetEventArgsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
