package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies adaptive layout options. */
trait BaseChartAdaptiveLayout extends js.Object {
  /** Specifies the minimum container height at which the layout begins to adapt. */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies whether point labels should be kept when the widget adapts the layout. */
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the minimum container width at which the layout begins to adapt. */
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

