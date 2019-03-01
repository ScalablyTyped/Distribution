package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AfterDock event.
  */
trait ASPxClientDockManagerProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
  /**
    * Gets the zone currently being processed.
    * Value: An ASPxClientDockZone object that is the processed zone.
    */
  var zone: ASPxClientDockZone
}

object ASPxClientDockManagerProcessingModeEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel, processOnServer: scala.Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("panel")(panel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeEventArgs]
  }
}

