package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's tabs.
  */
@JSGlobal("BootstrapClientTabControlTabClickEventArgs")
@js.native
class BootstrapClientTabControlTabClickEventArgs protected () extends BootstrapClientTabControlTabCancelEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTabControlTabClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param tab An BootstrapClientTab object that represents a tab related to the event.
    * @param htmlElement An HTML object that contains the processed tab.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, tab: BootstrapClientTab, htmlElement: js.Any, htmlEvent: js.Any) = this()
  /**
    * Gets an HTML object that contains the processed tab.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

