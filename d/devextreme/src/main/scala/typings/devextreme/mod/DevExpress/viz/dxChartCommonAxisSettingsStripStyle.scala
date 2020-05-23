package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsStripStyle extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.stripStyle.label */
  var label: js.UndefOr[dxChartCommonAxisSettingsStripStyleLabel] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.stripStyle.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.stripStyle.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettingsStripStyle {
  @scala.inline
  def apply(
    label: dxChartCommonAxisSettingsStripStyleLabel = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined
  ): dxChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyle]
  }
}

