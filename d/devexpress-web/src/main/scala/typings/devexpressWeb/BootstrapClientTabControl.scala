package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapTabControl control.
  */
@JSGlobal("BootstrapClientTabControl")
@js.native
class BootstrapClientTabControl () extends ASPxClientTabControl {
  /**
    * Makes the specified tab active within the Tab Control on the client side.
    * @param tab A BootstrapClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: BootstrapClientTab): Unit = js.native
}

