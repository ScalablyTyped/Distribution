package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MenuItemClicked event.
  */
trait MenuItemClickedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    * Value: true if no default processing is required; otherwise, false.
    */
  var handled: scala.Boolean
  /**
    * Gets the name of the menu item which is clicked.
    * Value: A string, containing the menu item name.
    */
  var itemName: java.lang.String
}

