package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
@JSGlobal("ASPxClientMenuItemMouseEventArgs")
@js.native
class ASPxClientMenuItemMouseEventArgs protected () extends ASPxClientMenuItemEventArgs {
  /**
    * Initializes a new ASPxClientMenuItemMouseEventArgs object with the specified settings.
    * @param item An ASPxClientMenuItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    */
  def this(item: ASPxClientMenuItem, htmlElement: js.Any) = this()
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
}

