package typings.dygraphs.dygraphs

import typings.dygraphs.dygraphsStrings.y1
import typings.dygraphs.dygraphsStrings.y2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerSeriesOptions extends js.Object {
  /**
    * Set to either 'y1' or 'y2' to assign a series to a y-axis (primary or secondary). Must be
    * set per-series.
    */
  var axis: js.UndefOr[y1 | y2] = js.native
  /**
    * A per-series color definition. Used in conjunction with, and overrides, the colors option.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Draw a small dot at each point, in addition to a line going through the point. This makes
    * the individual data points easier to see, but can increase visual clutter in the chart.
    * The small dot can be replaced with a custom rendering by supplying a <a
    * href='#drawPointCallback'>drawPointCallback</a>.
    */
  var drawPoints: js.UndefOr[Boolean] = js.native
  /**
    * Error bars (or custom bars) for each series are drawn in the same color as the series, but
    * with partial transparency. This sets the transparency. A value of 0.0 means that the error
    * bars will not be drawn, whereas a value of 1.0 means that the error bars will be as dark
    * as the line for the series itself. This can be used to produce chart lines whose thickness
    * varies at each point.
    */
  var fillAlpha: js.UndefOr[Double] = js.native
  /**
    * Should the area underneath the graph be filled? This option is not compatible with error
    * bars. This may be set on a <a href='per-axis.html'>per-series</a> basis.
    */
  var fillGraph: js.UndefOr[Boolean] = js.native
  /**
    * The size in pixels of the dot drawn over highlighted points.
    */
  var highlightCircleSize: js.UndefOr[Double] = js.native
  /**
    * A function which plot data for this series on the chart.         
    */
  var plotter: js.UndefOr[js.Any] = js.native
  /**
    * The size of the dot to draw on each point in pixels (see drawPoints). A dot is always
    * drawn when a point is "isolated", i.e. there is a missing point on either side of it. This
    * also controls the size of those dots.
    */
  var pointSize: js.UndefOr[Double] = js.native
  /**
    * Mark this series for inclusion in the range selector. The mini plot curve will be an
    * average of all such series. If this is not specified for any series, the default behavior
    * is to average all the series. Setting it for one series will result in that series being
    * charted alone in the range selector.
    */
  var showInRangeSelector: js.UndefOr[Boolean] = js.native
  /**
    * When set, display the graph as a step plot instead of a line plot. This option may either
    * be set for the whole graph or for single series.
    */
  var stepPlot: js.UndefOr[Boolean] = js.native
  /**
    * Color for the line border used if strokeBorderWidth is set.
    */
  var strokeBorderColor: js.UndefOr[String] = js.native
  /**
    * Draw a border around graph lines to make crossing lines more easily distinguishable.
    * Useful for graphs with many lines.
    */
  var strokeBorderWidth: js.UndefOr[Double] = js.native
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * lines.
    */
  var strokePattern: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The width of the lines connecting data points. This can be used to increase the contrast
    * or some graphs.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object PerSeriesOptions {
  @scala.inline
  def apply(): PerSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerSeriesOptions]
  }
  @scala.inline
  implicit class PerSeriesOptionsOps[Self <: PerSeriesOptions] (val x: Self) extends AnyVal {
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
    def setAxis(value: y1 | y2): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDrawPoints(value: Boolean): Self = this.set("drawPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawPoints: Self = this.set("drawPoints", js.undefined)
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillAlpha: Self = this.set("fillAlpha", js.undefined)
    @scala.inline
    def setFillGraph(value: Boolean): Self = this.set("fillGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillGraph: Self = this.set("fillGraph", js.undefined)
    @scala.inline
    def setHighlightCircleSize(value: Double): Self = this.set("highlightCircleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCircleSize: Self = this.set("highlightCircleSize", js.undefined)
    @scala.inline
    def setPlotter(value: js.Any): Self = this.set("plotter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotter: Self = this.set("plotter", js.undefined)
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    @scala.inline
    def setShowInRangeSelector(value: Boolean): Self = this.set("showInRangeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInRangeSelector: Self = this.set("showInRangeSelector", js.undefined)
    @scala.inline
    def setStepPlot(value: Boolean): Self = this.set("stepPlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepPlot: Self = this.set("stepPlot", js.undefined)
    @scala.inline
    def setStrokeBorderColor(value: String): Self = this.set("strokeBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeBorderColor: Self = this.set("strokeBorderColor", js.undefined)
    @scala.inline
    def setStrokeBorderWidth(value: Double): Self = this.set("strokeBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeBorderWidth: Self = this.set("strokeBorderWidth", js.undefined)
    @scala.inline
    def setStrokePatternVarargs(value: Double*): Self = this.set("strokePattern", js.Array(value :_*))
    @scala.inline
    def setStrokePattern(value: js.Array[Double]): Self = this.set("strokePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokePattern: Self = this.set("strokePattern", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

