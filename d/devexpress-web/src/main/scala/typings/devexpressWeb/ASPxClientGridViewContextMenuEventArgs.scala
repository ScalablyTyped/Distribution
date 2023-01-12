package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
trait ASPxClientGridViewContextMenuEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: Any
  
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double
  
  /**
    * Gets the currently processed menu object.
    */
  var menu: Any
  
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String
  
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean
}
object ASPxClientGridViewContextMenuEventArgs {
  
  inline def apply(htmlEvent: Any, index: Double, menu: Any, objectType: String, showBrowserMenu: Boolean): ASPxClientGridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setShowBrowserMenu(value: Boolean): Self = StObject.set(x, "showBrowserMenu", value.asInstanceOf[js.Any])
  }
}
