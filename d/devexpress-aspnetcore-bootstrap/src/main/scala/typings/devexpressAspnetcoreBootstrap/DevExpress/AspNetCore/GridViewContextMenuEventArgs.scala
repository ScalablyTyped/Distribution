package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewContextMenuEventArgs
  extends StObject
     with EventArgs {
  
  val htmlEvent: js.Any
  
  val index: Double
  
  val menu: js.Any
  
  val objectType: String
  
  var showBrowserMenu: Boolean
}
object GridViewContextMenuEventArgs {
  
  inline def apply(
    htmlEvent: js.Any,
    index: Double,
    menu: js.Any,
    objectType: String,
    sender: Control,
    showBrowserMenu: Boolean
  ): GridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
  
  extension [Self <: GridViewContextMenuEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: js.Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setShowBrowserMenu(value: Boolean): Self = StObject.set(x, "showBrowserMenu", value.asInstanceOf[js.Any])
  }
}
