package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AfterFloat event.
  */
trait ASPxClientDockPanelProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the zone currently being processed.
    * Value: An ASPxClientDockZone object that is the processed zone.
    */
  var zone: ASPxClientDockZone
}

object ASPxClientDockPanelProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer, zone = zone)
  
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeEventArgs]
  }
}

