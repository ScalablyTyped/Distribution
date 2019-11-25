package typings.googleDotVisualization.google.visualization

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
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
}

