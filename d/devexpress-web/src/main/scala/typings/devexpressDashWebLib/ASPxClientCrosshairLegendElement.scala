package typings
package devexpressDashWebLib

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
    visible: scala.Boolean
  ): ASPxClientCrosshairLegendElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AxisLabelElement")(AxisLabelElement)
    __obj.updateDynamic("LineElement")(LineElement)
    __obj.updateDynamic("Point")(Point)
    __obj.updateDynamic("Series")(Series)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ASPxClientCrosshairLegendElement]
  }
}

