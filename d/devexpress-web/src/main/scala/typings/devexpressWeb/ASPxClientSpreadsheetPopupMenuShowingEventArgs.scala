package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
@js.native
trait ASPxClientSpreadsheetPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientSpreadsheetPopupMenuItemCollection = js.native
  /**
    * Gets the currently displayed context menu's type.
    */
  var menuType: ASPxClientSpreadsheetPopupMenuType = js.native
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
  @scala.inline
  implicit class ASPxClientSpreadsheetPopupMenuShowingEventArgsOps[Self <: ASPxClientSpreadsheetPopupMenuShowingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMenuItems(value: ASPxClientSpreadsheetPopupMenuItemCollection): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuType(value: ASPxClientSpreadsheetPopupMenuType): Self = this.set("menuType", value.asInstanceOf[js.Any])
  }
  
}

