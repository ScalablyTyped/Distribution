package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait barsOptions extends seriesTypeBase {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
}

object barsOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    barWidth: scala.Int | scala.Double = null,
    fill: js.Any = null,
    fillColor: js.Any = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    lineWidth: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): barsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[barsOptions]
  }
}

