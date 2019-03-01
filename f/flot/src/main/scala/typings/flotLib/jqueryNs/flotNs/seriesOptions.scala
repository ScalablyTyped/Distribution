package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait seriesOptions extends js.Object {
  var bars: js.UndefOr[barsOptions] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var highlightColor: js.UndefOr[js.Any] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
              // color or number
  var label: js.UndefOr[java.lang.String] = js.undefined
  var lines: js.UndefOr[linesOptions] = js.undefined
  var points: js.UndefOr[pointsOptions] = js.undefined
  var shadowSize: js.UndefOr[scala.Double] = js.undefined
  var xaxis: js.UndefOr[scala.Double] = js.undefined
  var yaxis: js.UndefOr[scala.Double] = js.undefined
}

object seriesOptions {
  @scala.inline
  def apply(
    bars: barsOptions = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.Any = null,
    highlightColor: js.Any = null,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    lines: linesOptions = null,
    points: pointsOptions = null,
    shadowSize: scala.Int | scala.Double = null,
    xaxis: scala.Int | scala.Double = null,
    yaxis: scala.Int | scala.Double = null
  ): seriesOptions = {
    val __obj = js.Dynamic.literal()
    if (bars != null) __obj.updateDynamic("bars")(bars)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (points != null) __obj.updateDynamic("points")(points)
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[seriesOptions]
  }
}

