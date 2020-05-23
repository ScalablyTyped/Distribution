package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CrosshairIndicatorLegendElement class's client-side equivalent.
  */
trait ASPxClientCrosshairIndicatorLegendElement extends ASPxClientCrosshairLegendElementBase {
  /**
    * Returns the Indicator whose point the legend element displays.
    */
  var Indicator: ASPxClientIndicator
}

object ASPxClientCrosshairIndicatorLegendElement {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    Indicator: ASPxClientIndicator,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairIndicatorLegendElement = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], Indicator = Indicator.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorLegendElement]
  }
}

