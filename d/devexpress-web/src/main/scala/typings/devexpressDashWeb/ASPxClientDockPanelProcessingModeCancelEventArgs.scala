package typings.devexpressDashWeb

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
  def apply(cancel: Boolean, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, processOnServer = processOnServer, zone = zone)
  
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeCancelEventArgs]
  }
}

