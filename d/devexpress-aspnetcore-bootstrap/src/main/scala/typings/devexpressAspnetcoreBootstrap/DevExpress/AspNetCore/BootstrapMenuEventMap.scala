package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapMenuEventMap
  extends StObject
     with ControlEventMap {
  
  var closeUp: MenuItemEventArgs
  
  var itemClick: MenuItemClickEventArgs
  
  var itemMouseOut: MenuItemMouseEventArgs
  
  var itemMouseOver: MenuItemMouseEventArgs
  
  var popUp: MenuItemEventArgs
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
  implicit class BootstrapMenuEventMapMutableBuilder[Self <: BootstrapMenuEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseUp(value: MenuItemEventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClick(value: MenuItemClickEventArgs): Self = StObject.set(x, "itemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOut(value: MenuItemMouseEventArgs): Self = StObject.set(x, "itemMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOver(value: MenuItemMouseEventArgs): Self = StObject.set(x, "itemMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopUp(value: MenuItemEventArgs): Self = StObject.set(x, "popUp", value.asInstanceOf[js.Any])
  }
}
