package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsStripStyleLabel extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.stripStyle.label.font */
  var font: js.UndefOr[Font] = js.undefined
}

object dxPolarChartCommonAxisSettingsStripStyleLabel {
  @scala.inline
  def apply(font: Font = null): dxPolarChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyleLabel]
  }
}

