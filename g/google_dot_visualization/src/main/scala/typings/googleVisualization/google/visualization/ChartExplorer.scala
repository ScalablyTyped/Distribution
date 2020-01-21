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
    maxZoomIn: Int | Double = null,
    maxZoomOut: Int | Double = null,
    zoomDelta: Int | Double = null
  ): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInBounds)) __obj.updateDynamic("keepInBounds")(keepInBounds.asInstanceOf[js.Any])
    if (maxZoomIn != null) __obj.updateDynamic("maxZoomIn")(maxZoomIn.asInstanceOf[js.Any])
    if (maxZoomOut != null) __obj.updateDynamic("maxZoomOut")(maxZoomOut.asInstanceOf[js.Any])
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartExplorer]
  }
}

