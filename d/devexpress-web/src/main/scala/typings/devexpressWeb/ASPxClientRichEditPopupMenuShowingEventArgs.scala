package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PopupMenuShowing event.
  */
@js.native
trait ASPxClientRichEditPopupMenuShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientRichEditPopupMenuItemCollection = js.native
}

object ASPxClientRichEditPopupMenuShowingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, menuItems: ASPxClientRichEditPopupMenuItemCollection): ASPxClientRichEditPopupMenuShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuShowingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRichEditPopupMenuShowingEventArgsOps[Self <: ASPxClientRichEditPopupMenuShowingEventArgs] (val x: Self) extends AnyVal {
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
    def setMenuItems(value: ASPxClientRichEditPopupMenuItemCollection): Self = this.set("menuItems", value.asInstanceOf[js.Any])
  }
  
}

