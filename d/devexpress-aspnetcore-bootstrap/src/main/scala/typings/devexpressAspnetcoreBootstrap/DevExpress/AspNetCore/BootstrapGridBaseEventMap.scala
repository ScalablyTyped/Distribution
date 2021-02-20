package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapGridBaseEventMap extends ControlEventMap {
  
  var toolbarItemClick: GridToolbarItemClickEventArgs = js.native
}
object BootstrapGridBaseEventMap {
  
  @scala.inline
  def apply(init: EventArgs, toolbarItemClick: GridToolbarItemClickEventArgs): BootstrapGridBaseEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridBaseEventMap]
  }
  
  @scala.inline
  implicit class BootstrapGridBaseEventMapMutableBuilder[Self <: BootstrapGridBaseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToolbarItemClick(value: GridToolbarItemClickEventArgs): Self = StObject.set(x, "toolbarItemClick", value.asInstanceOf[js.Any])
  }
}
