package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user selects it. */
trait dxChartSeriesTypesCommonSeriesSelectionStyle extends js.Object {
  /** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series. */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleBorder] = js.undefined
  /** Specifies the color of the series in the selected state. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the dash style of the series line when the series is in the selected state. Applies only to line-like series. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Configures hatching that applies when a user selects the series. */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleHatching] = js.undefined
  /** Specifies the pixel-measured width of the series line when the series is in the selected state. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesSelectionStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyle]
  }
}

