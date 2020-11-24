package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFilterControl.Applied event.
  */
@js.native
trait ASPxClientFilterAppliedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the filter expression currently being applied.
    */
  var filterExpression: String = js.native
}
object ASPxClientFilterAppliedEventArgs {
  
  @scala.inline
  def apply(filterExpression: String): ASPxClientFilterAppliedEventArgs = {
    val __obj = js.Dynamic.literal(filterExpression = filterExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterAppliedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFilterAppliedEventArgsOps[Self <: ASPxClientFilterAppliedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setFilterExpression(value: String): Self = this.set("filterExpression", value.asInstanceOf[js.Any])
  }
}
