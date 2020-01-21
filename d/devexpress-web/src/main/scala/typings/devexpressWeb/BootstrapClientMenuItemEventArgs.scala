package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on menu items.
  */
@JSGlobal("BootstrapClientMenuItemEventArgs")
@js.native
class BootstrapClientMenuItemEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the BootstrapClientMenuItemEventArgs type with the specified value.
    * @param item An BootstrapClientMenuItem object representing the group related to the event.
    */
  def this(item: BootstrapClientMenuItem) = this()
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem = js.native
}

