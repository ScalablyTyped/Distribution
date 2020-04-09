package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxisStrips extends dxPolarChartCommonAxisSettingsStripStyle {
  /** @name dxPolarChart.Options.valueAxis.strips.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.strips.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.strips.label */
  @JSName("label")
  var label_dxPolarChartValueAxisStrips: js.UndefOr[dxPolarChartValueAxisStripsLabel] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.strips.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object dxPolarChartValueAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | Date | String = null,
    label: dxPolarChartValueAxisStripsLabel = null,
    startValue: Double | Date | String = null
  ): dxPolarChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxisStrips]
  }
}

