package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait seriesTypeBase extends js.Object {
  var fill: js.UndefOr[js.Any] = js.undefined
                //boolean or number
  var fillColor: js.UndefOr[js.Any] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object seriesTypeBase {
  @scala.inline
  def apply(
    fill: js.Any = null,
    fillColor: js.Any = null,
    lineWidth: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): seriesTypeBase = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[seriesTypeBase]
  }
}

