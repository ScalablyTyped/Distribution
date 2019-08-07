package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockZone.BeforeDock event.
  */
@JSGlobal("ASPxClientDockZoneCancelEventArgs")
@js.native
class ASPxClientDockZoneCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockZoneCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    */
  def this(processOnServer: Boolean, panel: ASPxClientDockPanel) = this()
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}

