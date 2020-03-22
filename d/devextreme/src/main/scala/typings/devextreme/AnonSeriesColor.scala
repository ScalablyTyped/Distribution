package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeriesColor extends js.Object {
  var seriesColor: js.UndefOr[String] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var seriesName: js.UndefOr[js.Any] = js.undefined
}

object AnonSeriesColor {
  @scala.inline
  def apply(seriesColor: String = null, seriesIndex: Int | Double = null, seriesName: js.Any = null): AnonSeriesColor = {
    val __obj = js.Dynamic.literal()
    if (seriesColor != null) __obj.updateDynamic("seriesColor")(seriesColor.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeriesColor]
  }
}

