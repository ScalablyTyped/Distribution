package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsConstantLineStyle extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label */
  var label: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettingsConstantLineStyle {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    label: dxChartCommonAxisSettingsConstantLineStyleLabel = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    width: Int | Double = null
  ): dxChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyle]
  }
}

