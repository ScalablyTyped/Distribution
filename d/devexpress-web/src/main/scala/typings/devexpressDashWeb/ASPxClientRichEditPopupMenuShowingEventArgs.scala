package typings.devexpressDashWeb

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
  def apply(cancel: Boolean, menuItems: ASPxClientRichEditPopupMenuItemCollection): ASPxClientRichEditPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, menuItems = menuItems)
  
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuShowingEventArgs]
  }
}

