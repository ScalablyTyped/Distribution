package typings.fpsmeter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FPSMeterOptions extends js.Object {
              // Meter right offset.
  var bottom: js.UndefOr[String] = js.native
          // Toggle between show 'fps' and 'ms' on this event.
  var decimals: js.UndefOr[Double] = js.native
              // Allow themes to use coloring by FPS heat. 0 FPS = red, maxFps = green.
  var graph: js.UndefOr[Double] = js.native
              // Meter theme. Build in: 'dark', 'light', 'transparent', 'colorful'.
  var heat: js.UndefOr[Double] = js.native
              // Whether to show history graph.
  var history: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
          // Meter Z index.
  var left: js.UndefOr[String] = js.native
          // Meter bottom offset.
  var margin: js.UndefOr[String] = js.native
          // Number of decimals in FPS number. 1 = 59.9, 2 = 59.94, ...
  var maxFps: js.UndefOr[Double] = js.native
          // Minimal tick reporting interval in milliseconds.
  var position: js.UndefOr[String] = js.native
              // Meter top offset.
  var right: js.UndefOr[String] = js.native
          // Spike smoothing strength. 1 means no smoothing.
  var show: js.UndefOr[String] = js.native
           // Update interval in milliseconds.
  var smoothing: js.UndefOr[Double] = js.native
          // Meter margin. Helps with centering the counter when left: 50%;
  var theme: js.UndefOr[String] = js.native
          // Max expected FPS value.
  var threshold: js.UndefOr[Double] = js.native
              // Whether to show 'fps', or 'ms' = frame duration in milliseconds.
  var toggleOn: js.UndefOr[String] = js.native
              // Meter left offset.
  var top: js.UndefOr[String] = js.native
          // Meter position.
  var zIndex: js.UndefOr[Double] = js.native
}

object FPSMeterOptions {
  @scala.inline
  def apply(): FPSMeterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSMeterOptions]
  }
  @scala.inline
  implicit class FPSMeterOptionsOps[Self <: FPSMeterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setGraph(value: Double): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    @scala.inline
    def setHeat(value: Double): Self = this.set("heat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeat: Self = this.set("heat", js.undefined)
    @scala.inline
    def setHistory(value: Double): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxFps(value: Double): Self = this.set("maxFps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFps: Self = this.set("maxFps", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSmoothing(value: Double): Self = this.set("smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothing: Self = this.set("smoothing", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setToggleOn(value: String): Self = this.set("toggleOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleOn: Self = this.set("toggleOn", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

