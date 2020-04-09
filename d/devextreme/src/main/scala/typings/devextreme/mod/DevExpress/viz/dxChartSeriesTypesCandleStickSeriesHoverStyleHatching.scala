package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CandleStickSeries.hoverStyle.hatching */
trait dxChartSeriesTypesCandleStickSeriesHoverStyleHatching extends dxChartSeriesTypesCommonSeriesHoverStyleHatching

object dxChartSeriesTypesCandleStickSeriesHoverStyleHatching {
  @scala.inline
  def apply(
    direction: left | none | right = null,
    opacity: Int | Double = null,
    step: Int | Double = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCandleStickSeriesHoverStyleHatching = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching]
  }
}

