package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
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
  implicit class GridViewColumnMovingEventArgsMutableBuilder[Self <: GridViewColumnMovingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDropBefore(value: Boolean): Self = StObject.set(x, "isDropBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupPanel(value: Boolean): Self = StObject.set(x, "isGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
  }
}
