package typings
package devexpressDashWebLib

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
  var dockPosition: java.lang.String
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
  /**
    * Gets the ID of a pane.
    * Value: An integer value.
    */
  var paneID: scala.Double
}

object ASPxClientToolTipFreePosition {
  @scala.inline
  def apply(dockPosition: java.lang.String, offsetX: scala.Double, offsetY: scala.Double, paneID: scala.Double): ASPxClientToolTipFreePosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dockPosition")(dockPosition)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("paneID")(paneID)
    __obj.asInstanceOf[ASPxClientToolTipFreePosition]
  }
}

