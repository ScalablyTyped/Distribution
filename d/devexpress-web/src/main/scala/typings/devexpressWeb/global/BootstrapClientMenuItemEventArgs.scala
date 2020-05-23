package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on menu items.
  */
@JSGlobal("BootstrapClientMenuItemEventArgs")
@js.native
class BootstrapClientMenuItemEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientMenuItemEventArgs {
  /**
    * Initializes a new object of the BootstrapClientMenuItemEventArgs type with the specified value.
    * @param item An BootstrapClientMenuItem object representing the group related to the event.
    */
  def this(item: typings.devexpressWeb.BootstrapClientMenuItem) = this()
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  override var item: typings.devexpressWeb.BootstrapClientMenuItem = js.native
}

