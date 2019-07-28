package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforeDock event.
  */
trait ASPxClientDockZoneCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockZoneCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel, processOnServer: Boolean): ASPxClientDockZoneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, panel = panel, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientDockZoneCancelEventArgs]
  }
}

