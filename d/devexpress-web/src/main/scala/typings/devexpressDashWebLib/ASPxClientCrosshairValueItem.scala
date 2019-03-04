package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairValueItem class.
  */
trait ASPxClientCrosshairValueItem extends js.Object {
  /**
    * Gets an index of a point for which this crosshair value item is displayed.
    * Value: An integer value.
    */
  var pointIndex: scala.Double
  /**
    * Gets the value that is displayed in a crosshair label.
    * Value: A float value.
    */
  var value: scala.Double
}

object ASPxClientCrosshairValueItem {
  @scala.inline
  def apply(pointIndex: scala.Double, value: scala.Double): ASPxClientCrosshairValueItem = {
    val __obj = js.Dynamic.literal(pointIndex = pointIndex, value = value)
  
    __obj.asInstanceOf[ASPxClientCrosshairValueItem]
  }
}

