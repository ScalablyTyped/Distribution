package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLabelPosition class.
  */
trait ASPxClientCrosshairPosition extends js.Object {
  /**
    * Gets the horizontal offset of a crosshair cursor.
    * Value: An integer value that is the X-offset.
    */
  var offsetX: Double
  /**
    * Gets the vertical offset of a crosshair cursor.
    * Value: An integer value that is the Y-offset.
    */
  var offsetY: Double
}

object ASPxClientCrosshairPosition {
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientCrosshairPosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[ASPxClientCrosshairPosition]
  }
}

