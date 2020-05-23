package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on panels.
  */
trait ASPxClientDockManagerEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockManagerEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel): ASPxClientDockManagerEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerEventArgs]
  }
}

