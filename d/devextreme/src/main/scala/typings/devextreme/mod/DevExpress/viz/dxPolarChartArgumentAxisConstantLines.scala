package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisConstantLines extends dxPolarChartCommonAxisSettingsConstantLineStyle {
  /** Specifies whether to display the constant line behind or in front of the series. */
  var displayBehindSeries: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to extend the axis to display the constant line. */
  var extendAxis: js.UndefOr[Boolean] = js.undefined
  /** An object defining constant line label options. */
  @JSName("label")
  var label_dxPolarChartArgumentAxisConstantLines: js.UndefOr[dxPolarChartArgumentAxisConstantLinesLabel] = js.undefined
  /** Specifies a value to be displayed by a constant line. */
  var value: js.UndefOr[Double | Date | String] = js.undefined
}

object dxPolarChartArgumentAxisConstantLines {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    displayBehindSeries: js.UndefOr[Boolean] = js.undefined,
    extendAxis: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartArgumentAxisConstantLinesLabel = null,
    value: Double | Date | String = null,
    width: Int | Double = null
  ): dxPolarChartArgumentAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBehindSeries)) __obj.updateDynamic("displayBehindSeries")(displayBehindSeries.asInstanceOf[js.Any])
    if (!js.isUndefined(extendAxis)) __obj.updateDynamic("extendAxis")(extendAxis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisConstantLines]
  }
}

