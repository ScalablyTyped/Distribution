package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ActionExpanding event.
  */
@js.native
trait ASPxClientFloatingActionButtonActionExpandingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String = js.native
}
object ASPxClientFloatingActionButtonActionExpandingEventArgs {
  
  @scala.inline
  def apply(contextName: String): ASPxClientFloatingActionButtonActionExpandingEventArgs = {
    val __obj = js.Dynamic.literal(contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionExpandingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFloatingActionButtonActionExpandingEventArgsOps[Self <: ASPxClientFloatingActionButtonActionExpandingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContextName(value: String): Self = this.set("contextName", value.asInstanceOf[js.Any])
  }
}
