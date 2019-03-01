package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on tabs.
  */
trait BootstrapClientTabControlTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    * Value: A BootstrapClientTab object, manipulations on which forced the event to be raised.
    */
  var tab: BootstrapClientTab
}

object BootstrapClientTabControlTabEventArgs {
  @scala.inline
  def apply(tab: BootstrapClientTab): BootstrapClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[BootstrapClientTabControlTabEventArgs]
  }
}

