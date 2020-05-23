package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairLegendElement class.
  */
trait ASPxClientCrosshairLegendElement extends ASPxClientCrosshairLegendElementBase {
  /**
    * Returns a series whose point the Crosshair Cursor legend element highlights.
    */
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
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairLegendElement]
  }
}

