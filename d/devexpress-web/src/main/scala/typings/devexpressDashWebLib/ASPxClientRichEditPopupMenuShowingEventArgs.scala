package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PopupMenuShowing event.
  */
trait ASPxClientRichEditPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    * Value: A <see cref="ASPxClientRichEditPopupMenuItemCollection" /> object representing the context menu's item collection.
    */
  var menuItems: ASPxClientRichEditPopupMenuItemCollection
}

object ASPxClientRichEditPopupMenuShowingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, menuItems: ASPxClientRichEditPopupMenuItemCollection): ASPxClientRichEditPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("menuItems")(menuItems)
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuShowingEventArgs]
  }
}

