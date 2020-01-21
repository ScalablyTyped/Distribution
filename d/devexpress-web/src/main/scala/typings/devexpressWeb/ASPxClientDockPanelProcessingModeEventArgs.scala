package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeEventArgs")
@js.native
class ASPxClientDockPanelProcessingModeEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: ASPxClientDockZone) = this()
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}

