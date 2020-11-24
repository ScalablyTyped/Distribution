package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on panels.
  */
@js.native
trait ASPxClientDockManagerEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}
object ASPxClientDockManagerEventArgs {
  
  @scala.inline
  def apply(panel: ASPxClientDockPanel): ASPxClientDockManagerEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockManagerEventArgsOps[Self <: ASPxClientDockManagerEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPanel(value: ASPxClientDockPanel): Self = this.set("panel", value.asInstanceOf[js.Any])
  }
}
