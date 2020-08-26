package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.BarLabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineOptions extends js.Object {
  var avoidOverlappingGridLines: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var enableInteractivity: js.UndefOr[Boolean] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var timeline: js.UndefOr[BarLabelStyle] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TimelineOptions {
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
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
    def setAvoidOverlappingGridLines(value: Boolean): Self = this.set("avoidOverlappingGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidOverlappingGridLines: Self = this.set("avoidOverlappingGridLines", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String | ChartStrokeFill): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = this.set("enableInteractivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableInteractivity: Self = this.set("enableInteractivity", js.undefined)
    @scala.inline
    def setForceIFrame(value: Boolean): Self = this.set("forceIFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIFrame: Self = this.set("forceIFrame", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setTimeline(value: BarLabelStyle): Self = this.set("timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

