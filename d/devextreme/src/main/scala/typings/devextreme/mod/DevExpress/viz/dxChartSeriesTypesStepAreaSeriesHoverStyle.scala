package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StepAreaSeries.hoverStyle */
trait dxChartSeriesTypesStepAreaSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  /** @name dxChartSeriesTypes.StepAreaSeries.hoverStyle.border */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyleBorder] = js.undefined
}

object dxChartSeriesTypesStepAreaSeriesHoverStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesStepAreaSeriesHoverStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesHoverStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesStepAreaSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesHoverStyle]
  }
}

