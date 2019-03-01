package typings
package fpsmeterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FPSMeterOptions extends js.Object {
  			// Meter right offset.
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  		// Toggle between show 'fps' and 'ms' on this event.
  var decimals: js.UndefOr[scala.Double] = js.undefined
  			// Allow themes to use coloring by FPS heat. 0 FPS = red, maxFps = green.
  var graph: js.UndefOr[scala.Double] = js.undefined
  			// Meter theme. Build in: 'dark', 'light', 'transparent', 'colorful'.
  var heat: js.UndefOr[scala.Double] = js.undefined
  			// Whether to show history graph.
  var history: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  		// Meter Z index.
  var left: js.UndefOr[java.lang.String] = js.undefined
  		// Meter bottom offset.
  var margin: js.UndefOr[java.lang.String] = js.undefined
  		// Number of decimals in FPS number. 1 = 59.9, 2 = 59.94, ...
  var maxFps: js.UndefOr[scala.Double] = js.undefined
  		// Minimal tick reporting interval in milliseconds.
  var position: js.UndefOr[java.lang.String] = js.undefined
  			// Meter top offset.
  var right: js.UndefOr[java.lang.String] = js.undefined
  		// Spike smoothing strength. 1 means no smoothing.
  var show: js.UndefOr[java.lang.String] = js.undefined
   		// Update interval in milliseconds.
  var smoothing: js.UndefOr[scala.Double] = js.undefined
  		// Meter margin. Helps with centering the counter when left: 50%;
  var theme: js.UndefOr[java.lang.String] = js.undefined
  		// Max expected FPS value.
  var threshold: js.UndefOr[scala.Double] = js.undefined
  			// Whether to show 'fps', or 'ms' = frame duration in milliseconds.
  var toggleOn: js.UndefOr[java.lang.String] = js.undefined
  			// Meter left offset.
  var top: js.UndefOr[java.lang.String] = js.undefined
  		// Meter position.
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object FPSMeterOptions {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    decimals: scala.Int | scala.Double = null,
    graph: scala.Int | scala.Double = null,
    heat: scala.Int | scala.Double = null,
    history: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    left: java.lang.String = null,
    margin: java.lang.String = null,
    maxFps: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    right: java.lang.String = null,
    show: java.lang.String = null,
    smoothing: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    threshold: scala.Int | scala.Double = null,
    toggleOn: java.lang.String = null,
    top: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): FPSMeterOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (heat != null) __obj.updateDynamic("heat")(heat.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxFps != null) __obj.updateDynamic("maxFps")(maxFps.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (right != null) __obj.updateDynamic("right")(right)
    if (show != null) __obj.updateDynamic("show")(show)
    if (smoothing != null) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (toggleOn != null) __obj.updateDynamic("toggleOn")(toggleOn)
    if (top != null) __obj.updateDynamic("top")(top)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSMeterOptions]
  }
}

