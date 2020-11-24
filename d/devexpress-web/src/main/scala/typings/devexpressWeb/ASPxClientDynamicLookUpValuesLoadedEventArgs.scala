package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DynamicLookUpValuesLoaded event.
  */
@js.native
trait ASPxClientDynamicLookUpValuesLoadedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the dashboard parameter name whose values have been loaded.
    */
  var ParameterName: String = js.native
}
object ASPxClientDynamicLookUpValuesLoadedEventArgs {
  
  @scala.inline
  def apply(ParameterName: String): ASPxClientDynamicLookUpValuesLoadedEventArgs = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDynamicLookUpValuesLoadedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDynamicLookUpValuesLoadedEventArgsOps[Self <: ASPxClientDynamicLookUpValuesLoadedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
  }
}
