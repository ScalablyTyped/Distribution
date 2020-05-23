package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColor extends js.Object {
  var seriesColor: js.UndefOr[String] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var seriesName: js.UndefOr[js.Any] = js.undefined
}

object SeriesColor {
  @scala.inline
  def apply(
    seriesColor: String = null,
    seriesIndex: js.UndefOr[Double] = js.undefined,
    seriesName: js.Any = null
  ): SeriesColor = {
    val __obj = js.Dynamic.literal()
    if (seriesColor != null) __obj.updateDynamic("seriesColor")(seriesColor.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesIndex)) __obj.updateDynamic("seriesIndex")(seriesIndex.get.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesColor]
  }
}

