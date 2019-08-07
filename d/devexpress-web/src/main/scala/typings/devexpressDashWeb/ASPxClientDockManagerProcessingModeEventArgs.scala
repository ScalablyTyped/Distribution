package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeEventArgs")
@js.native
class ASPxClientDockManagerProcessingModeEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockManagerProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    * @param zone An ASPxClientDockZone object that is a zone related to the event.
    */
  def this(processOnServer: Boolean, panel: ASPxClientDockPanel, zone: ASPxClientDockZone) = this()
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}

