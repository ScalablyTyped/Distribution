package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartAdaptiveLayout extends BaseChartAdaptiveLayout

object dxPieChartAdaptiveLayout {
  @scala.inline
  def apply(
    height: Int | Double = null,
    keepLabels: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPieChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLabels)) __obj.updateDynamic("keepLabels")(keepLabels.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartAdaptiveLayout]
  }
}

