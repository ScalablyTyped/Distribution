package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
trait ASPxClientSpreadsheetPopupMenuShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientSpreadsheetPopupMenuItemCollection
  
  /**
    * Gets the currently displayed context menu's type.
    */
  var menuType: ASPxClientSpreadsheetPopupMenuType
}
object ASPxClientSpreadsheetPopupMenuShowingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    menuItems: ASPxClientSpreadsheetPopupMenuItemCollection,
    menuType: ASPxClientSpreadsheetPopupMenuType
  ): ASPxClientSpreadsheetPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], menuType = menuType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuShowingEventArgs]
  }
  
  extension [Self <: ASPxClientSpreadsheetPopupMenuShowingEventArgs](x: Self) {
    
    inline def setMenuItems(value: ASPxClientSpreadsheetPopupMenuItemCollection): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    inline def setMenuType(value: ASPxClientSpreadsheetPopupMenuType): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
  }
}
