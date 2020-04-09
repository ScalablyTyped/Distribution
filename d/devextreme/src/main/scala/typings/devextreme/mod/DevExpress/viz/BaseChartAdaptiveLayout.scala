package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseChart.Options.adaptiveLayout */
trait BaseChartAdaptiveLayout extends js.Object {
  /** @name BaseChart.Options.adaptiveLayout.height */
  var height: js.UndefOr[Double] = js.undefined
  /** @name BaseChart.Options.adaptiveLayout.keepLabels */
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  /** @name BaseChart.Options.adaptiveLayout.width */
  var width: js.UndefOr[Double] = js.undefined
}

object BaseChartAdaptiveLayout {
  @scala.inline
  def apply(
    height: Int | Double = null,
    keepLabels: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): BaseChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLabels)) __obj.updateDynamic("keepLabels")(keepLabels.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartAdaptiveLayout]
  }
}

