package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AfterDock event.
  */
trait ASPxClientDockZoneProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockZoneProcessingModeEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: Boolean): ASPxClientDockZoneProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientDockZoneProcessingModeEventArgs]
  }
}

