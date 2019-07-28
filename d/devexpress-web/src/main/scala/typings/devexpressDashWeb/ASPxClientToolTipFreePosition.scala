package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ToolTipFreePosition class.
  */
trait ASPxClientToolTipFreePosition extends ASPxClientToolTipPosition {
  /**
    * Gets an object containing settings that define how a tooltip should be docked.
    * Value: A string value.
    */
  var dockPosition: String
  /**
    * Gets the horizontal offset of a tooltip.
    * Value: An integer value.
    */
  var offsetX: Double
  /**
    * Gets the vertical offset of a tooltip.
    * Value: An integer value.
    */
  var offsetY: Double
  /**
    * Gets the ID of a pane.
    * Value: An integer value.
    */
  var paneID: Double
}

object ASPxClientToolTipFreePosition {
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientToolTipFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition, offsetX = offsetX, offsetY = offsetY, paneID = paneID)
  
    __obj.asInstanceOf[ASPxClientToolTipFreePosition]
  }
}

