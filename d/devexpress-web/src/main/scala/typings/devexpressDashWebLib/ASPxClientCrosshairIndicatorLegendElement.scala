package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCrosshairIndicatorLegendElement extends ASPxClientCrosshairLegendElementBase {
  var Indicator: ASPxClientIndicator
  var Point: ASPxClientIndicatorPoint
}

object ASPxClientCrosshairIndicatorLegendElement {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    Indicator: ASPxClientIndicator,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientIndicatorPoint,
    visible: scala.Boolean
  ): ASPxClientCrosshairIndicatorLegendElement = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement, Indicator = Indicator, LineElement = LineElement, Point = Point, visible = visible)
  
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorLegendElement]
  }
}

