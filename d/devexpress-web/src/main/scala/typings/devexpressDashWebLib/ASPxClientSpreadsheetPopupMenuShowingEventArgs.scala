package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PopupMenuShowing event.
  */
trait ASPxClientSpreadsheetPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    * Value: A <see cref="ASPxClientSpreadsheetPopupMenuItemCollection" /> object representing the context menu's item collection.
    */
  var menuItems: ASPxClientSpreadsheetPopupMenuItemCollection
  /**
    * Gets the currently displayed context menu's type.
    * Value: One of the <see cref="ASPxClientSpreadsheetPopupMenuType" /> enumeration values.
    */
  var menuType: js.Any
}

