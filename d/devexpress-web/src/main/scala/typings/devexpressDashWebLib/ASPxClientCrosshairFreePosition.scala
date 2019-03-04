package typings
package devexpressDashWebLib

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
  var dockPosition: java.lang.String
  /**
    * Gets a Pane's ID when the crosshair cursor is in the free position mode.
    * Value: An integer value that is the pane's ID.
    */
  var paneID: scala.Double
}

object ASPxClientCrosshairFreePosition {
  @scala.inline
  def apply(dockPosition: java.lang.String, offsetX: scala.Double, offsetY: scala.Double, paneID: scala.Double): ASPxClientCrosshairFreePosition = {
    val __obj = js.Dynamic.literal(dockPosition = dockPosition, offsetX = offsetX, offsetY = offsetY, paneID = paneID)
  
    __obj.asInstanceOf[ASPxClientCrosshairFreePosition]
  }
}

