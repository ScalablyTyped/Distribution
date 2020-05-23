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
    opacity: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesCandleStickSeriesHoverStyleHatching = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching]
  }
}

