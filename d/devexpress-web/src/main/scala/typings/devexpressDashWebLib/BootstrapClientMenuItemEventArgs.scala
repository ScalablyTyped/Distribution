package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for events related to manipulations on menu items.
 */

trait BootstrapClientMenuItemEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the menu item object related to the event.
       * Value: A BootstrapClientMenuItem object, manipulations on which forced the event to be raised.
       */
  var item: BootstrapClientMenuItem
}

