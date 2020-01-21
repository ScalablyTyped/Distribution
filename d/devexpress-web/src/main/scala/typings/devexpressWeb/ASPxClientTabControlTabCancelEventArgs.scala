package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabCancelEventArgs")
@js.native
class ASPxClientTabControlTabCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param tab An ASPxClientTab object representing a tab related to the event.
    */
  def this(processOnServer: Boolean, tab: ASPxClientTab) = this()
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  var reloadContentOnCallback: Boolean = js.native
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab = js.native
}

