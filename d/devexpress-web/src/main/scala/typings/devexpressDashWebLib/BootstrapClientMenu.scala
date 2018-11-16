package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapMenu control.
 */
@js.native
trait BootstrapClientMenu extends ASPxClientMenu {
  /**
       * Selects the specified menu item within the Menu control on the client side.
       * @param item A BootstrapClientMenuItem object specifying the menu item to select.
       */
  def SetSelectedItem(item: BootstrapClientMenuItem): scala.Unit = js.native
}

