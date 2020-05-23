package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on menu items.
  */
trait ASPxClientMenuItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem
}

object ASPxClientMenuItemEventArgs {
  @scala.inline
  def apply(item: ASPxClientMenuItem): ASPxClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemEventArgs]
  }
}

