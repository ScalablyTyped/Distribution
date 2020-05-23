package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PopupMenuShowing event.
  */
trait ASPxClientRichEditPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientRichEditPopupMenuItemCollection
}

object ASPxClientRichEditPopupMenuShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, menuItems: ASPxClientRichEditPopupMenuItemCollection): ASPxClientRichEditPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuShowingEventArgs]
  }
}

