package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on tabs.
  */
trait BootstrapClientTabControlTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab
}

object BootstrapClientTabControlTabEventArgs {
  @scala.inline
  def apply(tab: BootstrapClientTab): BootstrapClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabEventArgs]
  }
}

