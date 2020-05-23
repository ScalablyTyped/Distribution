package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartArgumentAxisConstantLines extends dxChartCommonAxisSettingsConstantLineStyle {
  /** @name dxChart.Options.argumentAxis.constantLines.displayBehindSeries */
  var displayBehindSeries: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.argumentAxis.constantLines.extendAxis */
  var extendAxis: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.argumentAxis.constantLines.label */
  @JSName("label")
  var label_dxChartArgumentAxisConstantLines: js.UndefOr[dxChartArgumentAxisConstantLinesLabel] = js.undefined
  /** @name dxChart.Options.argumentAxis.constantLines.value */
  var value: js.UndefOr[Double | Date | String] = js.undefined
}

object dxChartArgumentAxisConstantLines {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    displayBehindSeries: js.UndefOr[Boolean] = js.undefined,
    extendAxis: js.UndefOr[Boolean] = js.undefined,
    label: dxChartArgumentAxisConstantLinesLabel = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    value: Double | Date | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartArgumentAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBehindSeries)) __obj.updateDynamic("displayBehindSeries")(displayBehindSeries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extendAxis)) __obj.updateDynamic("extendAxis")(extendAxis.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartArgumentAxisConstantLines]
  }
}

