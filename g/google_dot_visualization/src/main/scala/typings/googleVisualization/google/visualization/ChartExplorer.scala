package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartExplorer extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var keepInBounds: js.UndefOr[Boolean] = js.undefined
  var maxZoomIn: js.UndefOr[Double] = js.undefined
  var maxZoomOut: js.UndefOr[Double] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
}

object ChartExplorer {
  @scala.inline
  def apply(
    actions: js.Array[String] = null,
    axis: String = null,
    keepInBounds: js.UndefOr[Boolean] = js.undefined,
    maxZoomIn: js.UndefOr[Double] = js.undefined,
    maxZoomOut: js.UndefOr[Double] = js.undefined,
    zoomDelta: js.UndefOr[Double] = js.undefined
  ): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInBounds)) __obj.updateDynamic("keepInBounds")(keepInBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomIn)) __obj.updateDynamic("maxZoomIn")(maxZoomIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomOut)) __obj.updateDynamic("maxZoomOut")(maxZoomOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDelta)) __obj.updateDynamic("zoomDelta")(zoomDelta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartExplorer]
  }
}

