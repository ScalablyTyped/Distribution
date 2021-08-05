package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
trait ASPxClientFileManagerToolbarUpdatingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the currently active file manager area.
    */
  var activeAreaName: String
}
object ASPxClientFileManagerToolbarUpdatingEventArgs {
  
  inline def apply(activeAreaName: String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(activeAreaName = activeAreaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerToolbarUpdatingEventArgs](x: Self) {
    
    inline def setActiveAreaName(value: String): Self = StObject.set(x, "activeAreaName", value.asInstanceOf[js.Any])
  }
}
