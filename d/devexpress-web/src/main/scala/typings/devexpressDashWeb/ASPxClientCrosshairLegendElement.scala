package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLegendElement class.
  */
trait ASPxClientCrosshairLegendElement extends ASPxClientCrosshairLegendElementBase {
  var Point: ASPxClientSeriesPoint
  var Series: ASPxClientSeries
}

object ASPxClientCrosshairLegendElement {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    Series: ASPxClientSeries,
    visible: Boolean
  ): ASPxClientCrosshairLegendElement = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement, LineElement = LineElement, Point = Point, Series = Series, visible = visible)
  
    __obj.asInstanceOf[ASPxClientCrosshairLegendElement]
  }
}

