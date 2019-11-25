package typings.fpsmeter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FPSMeterOptions extends js.Object {
  			// Meter right offset.
  var bottom: js.UndefOr[String] = js.undefined
  		// Toggle between show 'fps' and 'ms' on this event.
  var decimals: js.UndefOr[Double] = js.undefined
  			// Allow themes to use coloring by FPS heat. 0 FPS = red, maxFps = green.
  var graph: js.UndefOr[Double] = js.undefined
  			// Meter theme. Build in: 'dark', 'light', 'transparent', 'colorful'.
  var heat: js.UndefOr[Double] = js.undefined
  			// Whether to show history graph.
  var history: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  		// Meter Z index.
  var left: js.UndefOr[String] = js.undefined
  		// Meter bottom offset.
  var margin: js.UndefOr[String] = js.undefined
  		// Number of decimals in FPS number. 1 = 59.9, 2 = 59.94, ...
  var maxFps: js.UndefOr[Double] = js.undefined
  		// Minimal tick reporting interval in milliseconds.
  var position: js.UndefOr[String] = js.undefined
  			// Meter top offset.
  var right: js.UndefOr[String] = js.undefined
  		// Spike smoothing strength. 1 means no smoothing.
  var show: js.UndefOr[String] = js.undefined
   		// Update interval in milliseconds.
  var smoothing: js.UndefOr[Double] = js.undefined
  		// Meter margin. Helps with centering the counter when left: 50%;
  var theme: js.UndefOr[String] = js.undefined
  		// Max expected FPS value.
  var threshold: js.UndefOr[Double] = js.undefined
  			// Whether to show 'fps', or 'ms' = frame duration in milliseconds.
  var toggleOn: js.UndefOr[String] = js.undefined
  			// Meter left offset.
  var top: js.UndefOr[String] = js.undefined
  		// Meter position.
  var zIndex: js.UndefOr[Double] = js.undefined
}

object FPSMeterOptions {
  @scala.inline
  def apply(
    bottom: String = null,
    decimals: Int | Double = null,
    graph: Int | Double = null,
    heat: Int | Double = null,
    history: Int | Double = null,
    interval: Int | Double = null,
    left: String = null,
    margin: String = null,
    maxFps: Int | Double = null,
    position: String = null,
    right: String = null,
    show: String = null,
    smoothing: Int | Double = null,
    theme: String = null,
    threshold: Int | Double = null,
    toggleOn: String = null,
    top: String = null,
    zIndex: Int | Double = null
  ): FPSMeterOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (heat != null) __obj.updateDynamic("heat")(heat.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxFps != null) __obj.updateDynamic("maxFps")(maxFps.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (smoothing != null) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (toggleOn != null) __obj.updateDynamic("toggleOn")(toggleOn.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSMeterOptions]
  }
}

