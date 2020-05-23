package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
trait ASPxClientSpreadsheetPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
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
  @scala.inline
  def apply(
    cancel: Boolean,
    menuItems: ASPxClientSpreadsheetPopupMenuItemCollection,
    menuType: ASPxClientSpreadsheetPopupMenuType
  ): ASPxClientSpreadsheetPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], menuType = menuType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuShowingEventArgs]
  }
}

