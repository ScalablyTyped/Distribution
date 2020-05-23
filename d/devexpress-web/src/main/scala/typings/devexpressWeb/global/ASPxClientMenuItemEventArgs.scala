package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on menu items.
  */
@JSGlobal("ASPxClientMenuItemEventArgs")
@js.native
class ASPxClientMenuItemEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientMenuItemEventArgs {
  /**
    * Initializes a new object of the ASPxClientMenuItemEventArgs type with the specified value.
    * @param item An ASPxClientMenuItem object representing the group related to the event.
    */
  def this(item: typings.devexpressWeb.ASPxClientMenuItem) = this()
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  override var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
}

