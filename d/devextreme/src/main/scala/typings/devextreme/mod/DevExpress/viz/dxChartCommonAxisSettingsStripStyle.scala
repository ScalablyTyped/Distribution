package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsStripStyle extends js.Object {
  /** Configures the appearance of strip labels. */
  var label: js.UndefOr[dxChartCommonAxisSettingsStripStyleLabel] = js.undefined
  /** Generates a pixel-measured empty space between the left/right border of a strip and the strip label. */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** Generates a pixel-measured empty space between the top/bottom border of a strip and the strip label. */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettingsStripStyle {
  @scala.inline
  def apply(
    label: dxChartCommonAxisSettingsStripStyleLabel = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null
  ): dxChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyle]
  }
}

