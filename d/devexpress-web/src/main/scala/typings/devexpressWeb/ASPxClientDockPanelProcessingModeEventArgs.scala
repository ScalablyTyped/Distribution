package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
trait ASPxClientDockPanelProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone
}

object ASPxClientDockPanelProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeEventArgs]
  }
}

