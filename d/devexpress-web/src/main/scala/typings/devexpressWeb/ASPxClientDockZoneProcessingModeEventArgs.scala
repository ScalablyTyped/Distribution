package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockZone.AfterDock event.
  */
trait ASPxClientDockZoneProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockZoneProcessingModeEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: Boolean): ASPxClientDockZoneProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockZoneProcessingModeEventArgs]
  }
}

