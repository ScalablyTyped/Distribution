package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapMenuEventMap extends ControlEventMap {
  
  var closeUp: MenuItemEventArgs = js.native
  
  var itemClick: MenuItemClickEventArgs = js.native
  
  var itemMouseOut: MenuItemMouseEventArgs = js.native
  
  var itemMouseOver: MenuItemMouseEventArgs = js.native
  
  var popUp: MenuItemEventArgs = js.native
}
object BootstrapMenuEventMap {
  
  @scala.inline
  def apply(
    closeUp: MenuItemEventArgs,
    init: EventArgs,
    itemClick: MenuItemClickEventArgs,
    itemMouseOut: MenuItemMouseEventArgs,
    itemMouseOver: MenuItemMouseEventArgs,
    popUp: MenuItemEventArgs
  ): BootstrapMenuEventMap = {
    val __obj = js.Dynamic.literal(closeUp = closeUp.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any], itemMouseOut = itemMouseOut.asInstanceOf[js.Any], itemMouseOver = itemMouseOver.asInstanceOf[js.Any], popUp = popUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuEventMap]
  }
  
  @scala.inline
  implicit class BootstrapMenuEventMapOps[Self <: BootstrapMenuEventMap] (val x: Self) extends AnyVal {
    
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
    def setCloseUp(value: MenuItemEventArgs): Self = this.set("closeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClick(value: MenuItemClickEventArgs): Self = this.set("itemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOut(value: MenuItemMouseEventArgs): Self = this.set("itemMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOver(value: MenuItemMouseEventArgs): Self = this.set("itemMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopUp(value: MenuItemEventArgs): Self = this.set("popUp", value.asInstanceOf[js.Any])
  }
}
