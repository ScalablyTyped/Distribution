package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.hoverStyle */
trait dxChartSeriesTypesCommonSeriesHoverStyle extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleBorder] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.hatching */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleHatching] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesHoverStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesHoverStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesHoverStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyle]
  }
}

