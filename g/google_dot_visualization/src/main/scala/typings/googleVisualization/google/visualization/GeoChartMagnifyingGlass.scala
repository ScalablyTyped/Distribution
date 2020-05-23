package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartMagnifyingGlass extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object GeoChartMagnifyingGlass {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, zoomFactor: js.UndefOr[Double] = js.undefined): GeoChartMagnifyingGlass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomFactor)) __obj.updateDynamic("zoomFactor")(zoomFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
}

