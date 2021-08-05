package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapGridBaseEventMap
  extends StObject
     with ControlEventMap {
  
  var toolbarItemClick: GridToolbarItemClickEventArgs
}
object BootstrapGridBaseEventMap {
  
  inline def apply(init: EventArgs, toolbarItemClick: GridToolbarItemClickEventArgs): BootstrapGridBaseEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridBaseEventMap]
  }
  
  extension [Self <: BootstrapGridBaseEventMap](x: Self) {
    
    inline def setToolbarItemClick(value: GridToolbarItemClickEventArgs): Self = StObject.set(x, "toolbarItemClick", value.asInstanceOf[js.Any])
  }
}
