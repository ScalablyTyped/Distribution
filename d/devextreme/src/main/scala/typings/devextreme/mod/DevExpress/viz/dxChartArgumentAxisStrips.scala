package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartArgumentAxisStrips extends dxChartCommonAxisSettingsStripStyle {
  /** @name dxChart.Options.argumentAxis.strips.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.argumentAxis.strips.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChart.Options.argumentAxis.strips.label */
  @JSName("label")
  var label_dxChartArgumentAxisStrips: js.UndefOr[dxChartArgumentAxisStripsLabel] = js.undefined
  /** @name dxChart.Options.argumentAxis.strips.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object dxChartArgumentAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | Date | String = null,
    label: dxChartArgumentAxisStripsLabel = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    startValue: Double | Date | String = null
  ): dxChartArgumentAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartArgumentAxisStrips]
  }
}

