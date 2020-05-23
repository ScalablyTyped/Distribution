package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait linesOptions extends seriesTypeBase {
  var steps: js.UndefOr[Boolean] = js.undefined
}

object linesOptions {
  @scala.inline
  def apply(
    fill: js.Any = null,
    fillColor: js.Any = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    steps: js.UndefOr[Boolean] = js.undefined
  ): linesOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[linesOptions]
  }
}

