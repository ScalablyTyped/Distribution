package typings
package devexpressDashWebLib

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
  def apply(cancel: scala.Boolean, panel: ASPxClientDockPanel): ASPxClientDockManagerCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("panel")(panel)
    __obj.asInstanceOf[ASPxClientDockManagerCancelEventArgs]
  }
}

