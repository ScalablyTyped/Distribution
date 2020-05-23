package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.BarLabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
  var avoidOverlappingGridLines: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var timeline: js.UndefOr[BarLabelStyle] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TimelineOptions {
  @scala.inline
  def apply(
    avoidOverlappingGridLines: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String | ChartStrokeFill = null,
    colors: js.Array[String] = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    timeline: BarLabelStyle = null,
    width: js.UndefOr[Double] = js.undefined
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverlappingGridLines)) __obj.updateDynamic("avoidOverlappingGridLines")(avoidOverlappingGridLines.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOptions]
  }
}

