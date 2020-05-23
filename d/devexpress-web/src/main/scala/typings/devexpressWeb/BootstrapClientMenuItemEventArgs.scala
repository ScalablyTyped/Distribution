package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on menu items.
  */
trait BootstrapClientMenuItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem
}

object BootstrapClientMenuItemEventArgs {
  @scala.inline
  def apply(item: BootstrapClientMenuItem): BootstrapClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemEventArgs]
  }
}

