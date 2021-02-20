package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewContextMenuEventArgs extends EventArgs {
  
  val htmlEvent: js.Any = js.native
  
  val index: Double = js.native
  
  val menu: js.Any = js.native
  
  val objectType: String = js.native
  
  var showBrowserMenu: Boolean = js.native
}
object GridViewContextMenuEventArgs {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GridViewContextMenuEventArgsMutableBuilder[Self <: GridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: js.Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBrowserMenu(value: Boolean): Self = StObject.set(x, "showBrowserMenu", value.asInstanceOf[js.Any])
  }
}
