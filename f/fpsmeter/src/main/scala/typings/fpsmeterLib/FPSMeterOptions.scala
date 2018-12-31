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

