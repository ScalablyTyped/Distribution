package typings
package devexpressDashWebLib

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
  def apply(panel: ASPxClientDockPanel, processOnServer: scala.Boolean): ASPxClientDockZoneProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("panel")(panel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientDockZoneProcessingModeEventArgs]
  }
}

