package typings.googleVisualization.google.visualization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxis extends js.Object {
  var allowContainerBoundaryTextCufoff: js.UndefOr[Boolean] = js.native
  var baseline: js.UndefOr[Double] = js.native
   // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[String] = js.native
   // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[Double] = js.native
   // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[String] = js.native
   // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.native
  var logScale: js.UndefOr[Boolean] = js.native
  var maxAlternation: js.UndefOr[Double] = js.native
  var maxTextLines: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double | Date | js.Array[Double]] = js.native
  var minTextSpacing: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double | Date | js.Array[Double]] = js.native
  var minorGridlines: js.UndefOr[ChartGridlines] = js.native
  var showTextEvery: js.UndefOr[Double] = js.native
  var slantedText: js.UndefOr[Boolean] = js.native
  var slantedTextAngle: js.UndefOr[Double] = js.native
  var textPosition: js.UndefOr[String] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  var ticks: js.UndefOr[js.Array[_]] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  var viewWindow: js.UndefOr[ChartViewWindow] = js.native
  var viewWindowMode: js.UndefOr[String] = js.native
}

object ChartAxis {
  @scala.inline
  def apply(): ChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxis]
  }
  @scala.inline
  implicit class ChartAxisOps[Self <: ChartAxis] (val x: Self) extends AnyVal {
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
    def setAllowContainerBoundaryTextCufoff(value: Boolean): Self = this.set("allowContainerBoundaryTextCufoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowContainerBoundaryTextCufoff: Self = this.set("allowContainerBoundaryTextCufoff", js.undefined)
    @scala.inline
    def setBaseline(value: Double): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    @scala.inline
    def setBaselineColor(value: String): Self = this.set("baselineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineColor: Self = this.set("baselineColor", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGridlines(value: ChartGridlines): Self = this.set("gridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridlines: Self = this.set("gridlines", js.undefined)
    @scala.inline
    def setLogScale(value: Boolean): Self = this.set("logScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogScale: Self = this.set("logScale", js.undefined)
    @scala.inline
    def setMaxAlternation(value: Double): Self = this.set("maxAlternation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAlternation: Self = this.set("maxAlternation", js.undefined)
    @scala.inline
    def setMaxTextLines(value: Double): Self = this.set("maxTextLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTextLines: Self = this.set("maxTextLines", js.undefined)
    @scala.inline
    def setMaxValueVarargs(value: Double*): Self = this.set("maxValue", js.Array(value :_*))
    @scala.inline
    def setMaxValue(value: Double | Date | js.Array[Double]): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinTextSpacing(value: Double): Self = this.set("minTextSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTextSpacing: Self = this.set("minTextSpacing", js.undefined)
    @scala.inline
    def setMinValueVarargs(value: Double*): Self = this.set("minValue", js.Array(value :_*))
    @scala.inline
    def setMinValue(value: Double | Date | js.Array[Double]): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setMinorGridlines(value: ChartGridlines): Self = this.set("minorGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorGridlines: Self = this.set("minorGridlines", js.undefined)
    @scala.inline
    def setShowTextEvery(value: Double): Self = this.set("showTextEvery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTextEvery: Self = this.set("showTextEvery", js.undefined)
    @scala.inline
    def setSlantedText(value: Boolean): Self = this.set("slantedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlantedText: Self = this.set("slantedText", js.undefined)
    @scala.inline
    def setSlantedTextAngle(value: Double): Self = this.set("slantedTextAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlantedTextAngle: Self = this.set("slantedTextAngle", js.undefined)
    @scala.inline
    def setTextPosition(value: String): Self = this.set("textPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPosition: Self = this.set("textPosition", js.undefined)
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = this.set("ticks", js.Array(value :_*))
    @scala.inline
    def setTicks(value: js.Array[_]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    @scala.inline
    def setViewWindow(value: ChartViewWindow): Self = this.set("viewWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewWindow: Self = this.set("viewWindow", js.undefined)
    @scala.inline
    def setViewWindowMode(value: String): Self = this.set("viewWindowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewWindowMode: Self = this.set("viewWindowMode", js.undefined)
  }
  
}

