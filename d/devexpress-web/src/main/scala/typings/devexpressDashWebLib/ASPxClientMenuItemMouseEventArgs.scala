package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
trait ASPxClientMenuItemMouseEventArgs extends ASPxClientMenuItemEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    * Value: An HTML object representing a container for the item related to the event.
    */
  var htmlElement: js.Object
}

object ASPxClientMenuItemMouseEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, item: ASPxClientMenuItem): ASPxClientMenuItemMouseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[ASPxClientMenuItemMouseEventArgs]
  }
}

