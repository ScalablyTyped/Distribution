package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabEventArgs")
@js.native
class ASPxClientTabControlTabEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabEventArgs type with the specified value.
    * @param tab An ASPxClientTab object representing the tab related to the event.
    */
  def this(tab: ASPxClientTab) = this()
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab = js.native
}

