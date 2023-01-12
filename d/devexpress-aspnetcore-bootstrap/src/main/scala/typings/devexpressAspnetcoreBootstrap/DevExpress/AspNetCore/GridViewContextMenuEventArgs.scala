package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewContextMenuEventArgs
  extends StObject
     with EventArgs {
  
  val htmlEvent: Any
  
  val index: Double
  
  val menu: Any
  
  val objectType: String
  
  var showBrowserMenu: Boolean
}
object GridViewContextMenuEventArgs {
  
  inline def apply(
    htmlEvent: Any,
    index: Double,
    menu: Any,
    objectType: String,
    sender: Control,
    showBrowserMenu: Boolean
  ): GridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setShowBrowserMenu(value: Boolean): Self = StObject.set(x, "showBrowserMenu", value.asInstanceOf[js.Any])
  }
}
