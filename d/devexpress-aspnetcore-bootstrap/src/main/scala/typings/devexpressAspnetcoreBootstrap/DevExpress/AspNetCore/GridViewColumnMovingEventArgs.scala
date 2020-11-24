package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewColumnMovingEventArgs extends EventArgs {
  
  var allow: Boolean = js.native
  
  val destinationColumn: BootstrapGridViewColumn = js.native
  
  val isDropBefore: Boolean = js.native
  
  val isGroupPanel: Boolean = js.native
  
  val sourceColumn: BootstrapGridViewColumn = js.native
}
object GridViewColumnMovingEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: BootstrapGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sender: Control,
    sourceColumn: BootstrapGridViewColumn
  ): GridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], destinationColumn = destinationColumn.asInstanceOf[js.Any], isDropBefore = isDropBefore.asInstanceOf[js.Any], isGroupPanel = isGroupPanel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnMovingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewColumnMovingEventArgsOps[Self <: GridViewColumnMovingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationColumn(value: BootstrapGridViewColumn): Self = this.set("destinationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDropBefore(value: Boolean): Self = this.set("isDropBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupPanel(value: Boolean): Self = this.set("isGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: BootstrapGridViewColumn): Self = this.set("sourceColumn", value.asInstanceOf[js.Any])
  }
}
