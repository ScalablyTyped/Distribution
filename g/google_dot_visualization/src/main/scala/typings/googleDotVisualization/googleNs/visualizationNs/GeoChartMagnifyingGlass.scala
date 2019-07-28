package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartMagnifyingGlass extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object GeoChartMagnifyingGlass {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, zoomFactor: Int | Double = null): GeoChartMagnifyingGlass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
}

