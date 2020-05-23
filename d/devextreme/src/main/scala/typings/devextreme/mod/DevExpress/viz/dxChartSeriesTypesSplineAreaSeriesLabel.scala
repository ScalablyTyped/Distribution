package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.ColorVisible
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.right
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.SplineAreaSeries.label */
trait dxChartSeriesTypesSplineAreaSeriesLabel extends dxChartSeriesTypesCommonSeriesLabel

object dxChartSeriesTypesSplineAreaSeriesLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    argumentFormat: format = null,
    backgroundColor: String = null,
    border: ColorDashStyle = null,
    connector: ColorVisible = null,
    customizeText: /* pointInfo */ js.Any => String = null,
    font: Font = null,
    format: format = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    position: inside | outside = null,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    verticalOffset: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartSeriesTypesSplineAreaSeriesLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOffset)) __obj.updateDynamic("verticalOffset")(verticalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesSplineAreaSeriesLabel]
  }
}

