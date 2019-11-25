package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait barsOptions extends seriesTypeBase {
  var align: js.UndefOr[String] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
}

object barsOptions {
  @scala.inline
  def apply(
    align: String = null,
    barWidth: Int | Double = null,
    fill: js.Any = null,
    fillColor: js.Any = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): barsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[barsOptions]
  }
}

