package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
  var avoidOverlappingGridLines: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined
  var forceIFrame: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var timeline: js.UndefOr[googleDotVisualizationLib.Anon_BarLabelStyle] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TimelineOptions {
  @scala.inline
  def apply(
    avoidOverlappingGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: js.Any = null,
    colors: js.Array[java.lang.String] = null,
    enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined,
    forceIFrame: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    timeline: googleDotVisualizationLib.Anon_BarLabelStyle = null,
    width: scala.Int | scala.Double = null
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverlappingGridLines)) __obj.updateDynamic("avoidOverlappingGridLines")(avoidOverlappingGridLines)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOptions]
  }
}

