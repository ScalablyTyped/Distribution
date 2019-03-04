package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ToolTipRelativePosition class.
  */
trait ASPxClientToolTipRelativePosition extends ASPxClientToolTipPosition {
  /**
    * Gets the horizontal offset of a tooltip.
    * Value: An integer value.
    */
  var offsetX: scala.Double
  /**
    * Gets the vertical offset of a tooltip.
    * Value: An integer value.
    */
  var offsetY: scala.Double
}

object ASPxClientToolTipRelativePosition {
  @scala.inline
  def apply(offsetX: scala.Double, offsetY: scala.Double): ASPxClientToolTipRelativePosition = {
    val __obj = js.Dynamic.literal(offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[ASPxClientToolTipRelativePosition]
  }
}

