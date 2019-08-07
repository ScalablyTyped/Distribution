package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.BeforeDock event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeCancelEventArgs")
@js.native
class ASPxClientDockPanelProcessingModeCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: ASPxClientDockZone) = this()
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}

