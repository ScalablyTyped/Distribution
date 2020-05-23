package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.PopupMenuShowing event.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuShowingEventArgs")
@js.native
class ASPxClientSpreadsheetPopupMenuShowingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetPopupMenuShowingEventArgs class with the specified settings.
    * @param menuItems Provides access to the context menu's item collection.
    * @param menuType Specifies the currently displayed context menu's type.
    */
  def this(menuItems: js.Any, menuType: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  /* CompleteClass */
  override var menuItems: typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItemCollection = js.native
  /**
    * Gets the currently displayed context menu's type.
    */
  /* CompleteClass */
  override var menuType: typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuType = js.native
}

