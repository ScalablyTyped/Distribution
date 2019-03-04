package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on panels.
  */
trait ASPxClientDockManagerEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockManagerEventArgs {
  @scala.inline
  def apply(panel: ASPxClientDockPanel): ASPxClientDockManagerEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel)
  
    __obj.asInstanceOf[ASPxClientDockManagerEventArgs]
  }
}

