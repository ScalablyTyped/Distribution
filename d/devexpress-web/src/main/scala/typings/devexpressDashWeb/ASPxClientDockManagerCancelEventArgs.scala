package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforeDock event.
  */
trait ASPxClientDockManagerCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockManagerCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, panel = panel)
  
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
}

