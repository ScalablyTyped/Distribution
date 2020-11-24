package typings.devexpressWeb

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
  implicit class BootstrapUIWidgetEventArgsBaseOps[Self <: BootstrapUIWidgetEventArgsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
