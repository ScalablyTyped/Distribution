package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsStripStyle extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.stripStyle.label */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyleLabel] = js.undefined
}

object dxPolarChartCommonAxisSettingsStripStyle {
  @scala.inline
  def apply(label: dxPolarChartCommonAxisSettingsStripStyleLabel = null): dxPolarChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyle]
  }
}

