package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CandleStickSeries.selectionStyle */
trait dxChartSeriesTypesCandleStickSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** @name dxChartSeriesTypes.CandleStickSeries.selectionStyle.hatching */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching] = js.undefined
}

object dxChartSeriesTypesCandleStickSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesCandleStickSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesSelectionStyle]
  }
}

