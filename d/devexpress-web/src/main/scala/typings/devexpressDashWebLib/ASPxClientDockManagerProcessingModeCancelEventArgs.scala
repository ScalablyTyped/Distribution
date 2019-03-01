package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforeDock event.
  */
trait ASPxClientDockManagerProcessingModeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
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

object ASPxClientDockManagerProcessingModeCancelEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    panel: ASPxClientDockPanel,
    processOnServer: scala.Boolean,
    zone: ASPxClientDockZone
  ): ASPxClientDockManagerProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("panel")(panel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeCancelEventArgs]
  }
}

