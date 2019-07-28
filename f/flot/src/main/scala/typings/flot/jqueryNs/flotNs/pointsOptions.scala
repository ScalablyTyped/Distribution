package typings.flot.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pointsOptions extends seriesTypeBase {
  var radius: js.UndefOr[Double] = js.undefined
  var symbol: js.UndefOr[js.Any] = js.undefined
}

object pointsOptions {
  @scala.inline
  def apply(
    fill: js.Any = null,
    fillColor: js.Any = null,
    lineWidth: Int | Double = null,
    radius: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    symbol: js.Any = null
  ): pointsOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[pointsOptions]
  }
}

