package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
trait ASPxClientDockManagerProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}

object ASPxClientDockManagerProcessingModeEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeEventArgs]
  }
}

