package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisStrips extends dxChartCommonAxisSettingsStripStyle {
  /** @name dxChart.Options.valueAxis.strips.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.label */
  @JSName("label")
  var label_dxChartValueAxisStrips: js.UndefOr[dxChartValueAxisStripsLabel] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object dxChartValueAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | Date | String = null,
    label: dxChartValueAxisStripsLabel = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    startValue: Double | Date | String = null
  ): dxChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisStrips]
  }
}

