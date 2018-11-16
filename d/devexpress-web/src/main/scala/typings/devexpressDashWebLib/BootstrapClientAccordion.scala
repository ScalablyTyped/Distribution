package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapAccordion control.
 */
@js.native
trait BootstrapClientAccordion extends ASPxClientNavBar {
  /**
       * Makes the specified group active.
       * @param group A BootstrapClientAccordionGroup object that specifies the active group.
       */
  def SetActiveGroup(group: BootstrapClientAccordionGroup): scala.Unit = js.native
  /**
       * Selects the specified item within the Accordion control on the client side.
       * @param item A BootstrapClientAccordionItem object specifying the item to select.
       */
  def SetSelectedItem(item: BootstrapClientAccordionItem): scala.Unit = js.native
}

