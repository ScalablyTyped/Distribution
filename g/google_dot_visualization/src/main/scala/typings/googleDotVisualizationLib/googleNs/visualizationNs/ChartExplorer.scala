package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartExplorer extends js.Object {
  var actions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var keepInBounds: js.UndefOr[scala.Boolean] = js.undefined
  var maxZoomIn: js.UndefOr[scala.Double] = js.undefined
  var maxZoomOut: js.UndefOr[scala.Double] = js.undefined
  var zoomDelta: js.UndefOr[scala.Double] = js.undefined
}

object ChartExplorer {
  @scala.inline
  def apply(
    actions: js.Array[java.lang.String] = null,
    axis: java.lang.String = null,
    keepInBounds: js.UndefOr[scala.Boolean] = js.undefined,
    maxZoomIn: scala.Int | scala.Double = null,
    maxZoomOut: scala.Int | scala.Double = null,
    zoomDelta: scala.Int | scala.Double = null
  ): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (!js.isUndefined(keepInBounds)) __obj.updateDynamic("keepInBounds")(keepInBounds)
    if (maxZoomIn != null) __obj.updateDynamic("maxZoomIn")(maxZoomIn.asInstanceOf[js.Any])
    if (maxZoomOut != null) __obj.updateDynamic("maxZoomOut")(maxZoomOut.asInstanceOf[js.Any])
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartExplorer]
  }
}

