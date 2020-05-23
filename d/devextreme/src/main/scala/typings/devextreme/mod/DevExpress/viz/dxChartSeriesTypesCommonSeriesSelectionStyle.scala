package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.selectionStyle */
trait dxChartSeriesTypesCommonSeriesSelectionStyle extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleBorder] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleHatching] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesSelectionStyleHatching = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesCommonSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyle]
  }
}

