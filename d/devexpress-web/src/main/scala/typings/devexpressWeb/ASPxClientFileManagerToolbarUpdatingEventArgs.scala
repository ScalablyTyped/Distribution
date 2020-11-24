package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
@js.native
trait ASPxClientFileManagerToolbarUpdatingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the currently active file manager area.
    */
  var activeAreaName: String = js.native
}
object ASPxClientFileManagerToolbarUpdatingEventArgs {
  
  @scala.inline
  def apply(activeAreaName: String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(activeAreaName = activeAreaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerToolbarUpdatingEventArgsOps[Self <: ASPxClientFileManagerToolbarUpdatingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setActiveAreaName(value: String): Self = this.set("activeAreaName", value.asInstanceOf[js.Any])
  }
}
