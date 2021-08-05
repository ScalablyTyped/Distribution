package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewColumnMovingEventArgs
  extends StObject
     with EventArgs {
  
  var allow: Boolean
  
  val destinationColumn: BootstrapGridViewColumn
  
  val isDropBefore: Boolean
  
  val isGroupPanel: Boolean
  
  val sourceColumn: BootstrapGridViewColumn
}
object GridViewColumnMovingEventArgs {
  
  inline def apply(
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
  
  extension [Self <: GridViewColumnMovingEventArgs](x: Self) {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setDestinationColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
    
    inline def setIsDropBefore(value: Boolean): Self = StObject.set(x, "isDropBefore", value.asInstanceOf[js.Any])
    
    inline def setIsGroupPanel(value: Boolean): Self = StObject.set(x, "isGroupPanel", value.asInstanceOf[js.Any])
    
    inline def setSourceColumn(value: BootstrapGridViewColumn): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
  }
}
