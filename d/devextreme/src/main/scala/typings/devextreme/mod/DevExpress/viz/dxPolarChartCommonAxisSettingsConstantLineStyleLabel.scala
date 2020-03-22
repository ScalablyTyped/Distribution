package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsConstantLineStyleLabel extends js.Object {
  /** Specifies font options for a constant line label. */
  var font: js.UndefOr[Font] = js.undefined
  /** Indicates whether or not to display labels for the axis constant lines. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  @scala.inline
  def apply(font: Font = null, visible: js.UndefOr[Boolean] = js.undefined): dxPolarChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyleLabel]
  }
}

