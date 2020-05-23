package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border */
trait dxChartSeriesTypesCommonSeriesSelectionStyleBorder extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesSelectionStyleBorder {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesCommonSeriesSelectionStyleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyleBorder]
  }
}

