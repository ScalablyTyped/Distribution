package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuShowingEventArgs")
@js.native
class ASPxClientSpreadsheetPopupMenuShowingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetPopupMenuShowingEventArgs class with the specified settings.
    * @param menuItems Provides access to the context menu's item collection.
    * @param menuType Specifies the currently displayed context menu's type.
    */
  def this(menuItems: js.Any, menuType: js.Any) = this()
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientSpreadsheetPopupMenuItemCollection = js.native
  /**
    * Gets the currently displayed context menu's type.
    */
  var menuType: ASPxClientSpreadsheetPopupMenuType = js.native
}

