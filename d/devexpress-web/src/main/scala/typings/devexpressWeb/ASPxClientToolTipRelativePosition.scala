package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ToolTipRelativePosition class.
  */
trait ASPxClientToolTipRelativePosition extends ASPxClientToolTipPosition {
  /**
    * Gets the horizontal offset of a tooltip.
    */
  var offsetX: Double
  /**
    * Gets the vertical offset of a tooltip.
    */
  var offsetY: Double
}

object ASPxClientToolTipRelativePosition {
  @scala.inline
  def apply(offsetX: Double, offsetY: Double): ASPxClientToolTipRelativePosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipRelativePosition]
  }
}

