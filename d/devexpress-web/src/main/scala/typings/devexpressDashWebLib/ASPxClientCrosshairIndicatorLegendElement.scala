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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AxisLabelElement")(AxisLabelElement)
    __obj.updateDynamic("Indicator")(Indicator)
    __obj.updateDynamic("LineElement")(LineElement)
    __obj.updateDynamic("Point")(Point)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorLegendElement]
  }
}

