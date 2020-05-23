package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairFreePosition class.
  */
trait ASPxClientCrosshairFreePosition extends ASPxClientCrosshairPosition {
  /**
    * Gets a string containing information on a crosshair label's dock position when the crosshair cursor is in the free position mode.
    */
  var dockPosition: String
  /**
    * Gets a Pane's ID when the crosshair cursor is in the free position mode.
    */
  var paneID: Double
}

object ASPxClientCrosshairFreePosition {
  @scala.inline
  def apply(dockPosition: String, offsetX: Double, offsetY: Double, paneID: Double): ASPxClientCrosshairFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], paneID = paneID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairFreePosition]
  }
}

