package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on tabs.
  */
@JSGlobal("BootstrapClientTabControlTabEventArgs")
@js.native
class BootstrapClientTabControlTabEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTabControlTabEventArgs type with the specified value.
    * @param tab An BootstrapClientTab object representing the tab related to the event.
    */
  def this(tab: BootstrapClientTab) = this()
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab = js.native
}

