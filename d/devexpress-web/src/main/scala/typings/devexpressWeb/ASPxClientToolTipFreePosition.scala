package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ToolTipFreePosition class.
  */
trait ASPxClientToolTipFreePosition extends ASPxClientToolTipPosition {
  /**
    * Gets an object containing settings that define how a tooltip should be docked.
    */
  var dockPosition: String
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double
  /**
    * Gets the ID of a pane.
    */
  var paneID: Double
}

object ASPxClientToolTipFreePosition {
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientToolTipFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paneID = paneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipFreePosition]
  }
}

