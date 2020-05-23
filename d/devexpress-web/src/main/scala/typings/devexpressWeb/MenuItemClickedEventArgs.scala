package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.MenuItemClicked event.
  */
trait MenuItemClickedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean
  /**
    * Gets the name of the menu item which is clicked.
    */
  var itemName: String
}

object MenuItemClickedEventArgs {
  @scala.inline
  def apply(handled: Boolean, itemName: String): MenuItemClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemClickedEventArgs]
  }
}

