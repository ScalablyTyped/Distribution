package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuShowingEventArgs")
@js.native
open class ASPxClientSpreadsheetPopupMenuShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetPopupMenuShowingEventArgs class with the specified settings.
    * @param menuItems Provides access to the context menu's item collection.
    * @param menuType Specifies the currently displayed context menu's type.
    */
  def this(menuItems: Any, menuType: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  /* CompleteClass */
  var menuItems: typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItemCollection = js.native
  
  /**
    * Gets the currently displayed context menu's type.
    */
  /* CompleteClass */
  var menuType: typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuType = js.native
}
