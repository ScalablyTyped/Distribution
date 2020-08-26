package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabCancelEventArgs")
@js.native
class ASPxClientTabControlTabCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTabControlTabCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param tab An ASPxClientTab object representing a tab related to the event.
    */
  def this(processOnServer: Boolean, tab: typings.devexpressWeb.ASPxClientTab) = this()
}

