package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dataSeries extends seriesOptions {
  var data: js.Array[_]
}

object dataSeries {
  @scala.inline
  def apply(
    data: js.Array[_],
    bars: barsOptions = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: js.Any = null,
    highlightColor: js.Any = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    lines: linesOptions = null,
    points: pointsOptions = null,
    shadowSize: js.UndefOr[Double] = js.undefined,
    xaxis: js.UndefOr[Double] = js.undefined,
    yaxis: js.UndefOr[Double] = js.undefined
  ): dataSeries = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (bars != null) __obj.updateDynamic("bars")(bars.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowSize)) __obj.updateDynamic("shadowSize")(shadowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xaxis)) __obj.updateDynamic("xaxis")(xaxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yaxis)) __obj.updateDynamic("yaxis")(yaxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataSeries]
  }
}

