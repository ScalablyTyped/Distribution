package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on menu items.
  */
@JSGlobal("ASPxClientMenuItemEventArgs")
@js.native
class ASPxClientMenuItemEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientMenuItemEventArgs type with the specified value.
    * @param item An ASPxClientMenuItem object representing the group related to the event.
    */
  def this(item: ASPxClientMenuItem) = this()
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem = js.native
}

