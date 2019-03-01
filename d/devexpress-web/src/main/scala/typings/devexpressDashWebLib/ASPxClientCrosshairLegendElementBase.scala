package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCrosshairLegendElementBase extends js.Object {
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    * Value: An ASPxClientCrosshairAxisLabelElement object that represents the crosshair axis label element.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    * Value: An ASPxClientCrosshairLineElement object that represents the crosshair line element.
    */
  var LineElement: ASPxClientCrosshairLineElement
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    * Value: true, if the crosshair legend element is visible; otherwise, false.
    */
  var visible: scala.Boolean
}

object ASPxClientCrosshairLegendElementBase {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    visible: scala.Boolean
  ): ASPxClientCrosshairLegendElementBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AxisLabelElement")(AxisLabelElement)
    __obj.updateDynamic("LineElement")(LineElement)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ASPxClientCrosshairLegendElementBase]
  }
}

