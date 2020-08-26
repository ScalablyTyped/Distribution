package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.MenuItemClicked event.
  */
@js.native
trait MenuItemClickedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the name of the menu item which is clicked.
    */
  var itemName: String = js.native
}

object MenuItemClickedEventArgs {
  @scala.inline
  def apply(handled: Boolean, itemName: String): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
  @scala.inline
  implicit class MenuItemClickedEventArgsOps[Self <: MenuItemClickedEventArgs] (val x: Self) extends AnyVal {
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
  }
  
}

