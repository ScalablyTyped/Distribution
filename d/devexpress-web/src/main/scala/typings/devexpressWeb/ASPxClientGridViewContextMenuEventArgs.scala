package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
@js.native
trait ASPxClientGridViewContextMenuEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double = js.native
  
  /**
    * Gets the currently processed menu object.
    */
  var menu: js.Any = js.native
  
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean = js.native
}
object ASPxClientGridViewContextMenuEventArgs {
  
  @scala.inline
  def apply(htmlEvent: js.Any, index: Double, menu: js.Any, objectType: String, showBrowserMenu: Boolean): ASPxClientGridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewContextMenuEventArgsMutableBuilder[Self <: ASPxClientGridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    
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
