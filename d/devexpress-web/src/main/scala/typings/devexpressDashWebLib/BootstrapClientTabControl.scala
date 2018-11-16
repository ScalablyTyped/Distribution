package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapTabControl control.
 */
@js.native
trait BootstrapClientTabControl extends ASPxClientTabControlBase {
  /**
       * Makes the specified tab active within the Tab Control on the client side.
       * @param tab A BootstrapClientTab object specifying the tab to select.
       */
  def SetActiveTab(tab: BootstrapClientTab): scala.Unit = js.native
}

