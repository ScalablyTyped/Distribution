package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairFreePosition class.
  */
trait ASPxClientCrosshairFreePosition extends ASPxClientCrosshairPosition {
  /**
    * Gets a string containing information on a crosshair label's dock position when the crosshair cursor is in the free position mode.
    * Value: A string value containing information on a crosshair label's dock position.
    */
  var dockPosition: String
  /**
    * Gets a Pane's ID when the crosshair cursor is in the free position mode.
    * Value: An integer value that is the pane's ID.
    */
  var paneID: Double
}

object ASPxClientCrosshairFreePosition {
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientCrosshairFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition, offsetX = offsetX, offsetY = offsetY, paneID = paneID)
  
    __obj.asInstanceOf[ASPxClientCrosshairFreePosition]
  }
}

