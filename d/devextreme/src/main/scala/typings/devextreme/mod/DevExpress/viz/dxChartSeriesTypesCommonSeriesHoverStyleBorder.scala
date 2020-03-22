package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series. */
trait dxChartSeriesTypesCommonSeriesHoverStyleBorder extends js.Object {
  /** Colors the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series. */
  var color: js.UndefOr[String] = js.undefined
  /** Sets a dash style for the series border (in area-like series) or for the series point border (in bar-like and bubble series) when a user points to the series. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Shows the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Sets a pixel-measured width for the series border (in area-like series) or for the series point border (in bar-like and bubble series) when a user points to the series. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesHoverStyleBorder {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesHoverStyleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyleBorder]
  }
}

