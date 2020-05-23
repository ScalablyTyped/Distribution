package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLabelPosition class.
  */
trait ASPxClientCrosshairPosition extends js.Object {
  /**
    * Gets the horizontal offset of a crosshair cursor.
    */
  var offsetX: Double
  /**
    * Gets the vertical offset of a crosshair cursor.
    */
  var offsetY: Double
}

object ASPxClientCrosshairPosition {
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientCrosshairPosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairPosition]
  }
}

