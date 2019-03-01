package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforeDock event.
  */
trait ASPxClientDockPanelProcessingModeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the zone currently being processed.
    * Value: An ASPxClientDockZone object that is the processed zone.
    */
  var zone: ASPxClientDockZone
}

object ASPxClientDockPanelProcessingModeCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, processOnServer: scala.Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeCancelEventArgs]
  }
}

