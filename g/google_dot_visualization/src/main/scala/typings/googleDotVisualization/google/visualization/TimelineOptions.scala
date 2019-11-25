package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.Anon_BarLabelStyle
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
  var timeline: js.UndefOr[Anon_BarLabelStyle] = js.undefined
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
    height: Int | Double = null,
    timeline: Anon_BarLabelStyle = null,
    width: Int | Double = null
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverlappingGridLines)) __obj.updateDynamic("avoidOverlappingGridLines")(avoidOverlappingGridLines.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOptions]
  }
}

