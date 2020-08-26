package typings.dygraphs.dygraphs

import org.scalablytyped.runtime.StringDictionary
import typings.dygraphs.Dygraph
import typings.dygraphs.anon.X
import typings.dygraphs.dygraphsStrings.always
import typings.dygraphs.dygraphsStrings.follow
import typings.dygraphs.dygraphsStrings.never
import typings.dygraphs.dygraphsStrings.onmouseover
import typings.std.CanvasRenderingContext2D
import typings.std.Date
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends PerSeriesOptions
     with PerAxisOptions {
  /**
    * Set this option to animate the transition between zoom windows. Applies to programmatic
    * and interactive zooms. Note that if you also set a drawCallback, it will be called several
    * times on each zoom. If you set a zoomCallback, it will only be called after the animation
    * is complete.
    */
  var animatedZooms: js.UndefOr[Boolean] = js.native
  /**
    * If provided, this function is called whenever the user clicks on an annotation.
    */
  var annotationClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user double-clicks on an annotation.
    */
  var annotationDblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user mouses out of an annotation.
    */
  var annotationMouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user mouses over an annotation.
    */
  var annotationMouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
    * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
    * See also documentation on <a href='http://dygraphs.com/per-axis.html'>per-series and
    * per-axis options</a>.
    */
  var axes: js.UndefOr[X] = js.native
  /**
    * A function to call when the canvas is clicked.
    */
  var clickCallback: js.UndefOr[
    js.Function3[/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], _]
  ] = js.native
  /**
    * If <strong>colors</strong> is not specified, saturation of the automatically-generated
    * data series colors. (0.0-1.0).
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * If colors is not specified, value of the data series colors, as in hue/saturation/value.
    * (0.0-1.0, default 0.5)
    */
  var colorValue: js.UndefOr[Double] = js.native
  /**
    * List of colors for the data series. These can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
    * color wheel are used. Overridden by the 'color' option.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
    * a gap and draws it as such. If, instead, the missing values represents an x-value for
    * which only a different series has data, then you'll want to connect the dots by setting
    * this to true. To explicitly include a gap with this option set, use a value of NaN.
    */
  var connectSeparatedPoints: js.UndefOr[Boolean] = js.native
  /**
    * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
    * point between low and high, with the series itself going through middle.
    */
  var customBars: js.UndefOr[Boolean] = js.native
  /**
    * Custom DataHandler. This is an advanced customization. See http://bit.ly/151E7Aq.
    */
  var dataHandler: js.UndefOr[js.Any] = js.native
  /**
    * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
    * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
    * values in dateWindow must also be numbers.
    */
  var dateWindow: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
    * not usually necessary, since tab-delimited data is auto-detected.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Unless it's run in scientific mode (see the <code>sigFigs</code> option), dygraphs
    * displays numbers with <code>digitsAfterDecimal</code> digits after the decimal point.
    * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
    * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
    * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
    * displayed in scientific notation.
    */
  var digitsAfterDecimal: js.UndefOr[Double] = js.native
  /**
    * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
    * series to be interpreted as annotations on points in that series. This is the same format
    * used by Google's AnnotatedTimeLine chart.
    */
  var displayAnnotations: js.UndefOr[Boolean] = js.native
  /**
    * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
    * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
    * left graph edge as usual.
    */
  var drawAxesAtZero: js.UndefOr[Boolean] = js.native
  /**
    * When set, this callback gets called every time the dygraph is drawn. This includes the
    * initial draw, after zooming and repeatedly while panning.
    */
  var drawCallback: js.UndefOr[js.Function2[/* dygraph */ Dygraph, /* is_initial */ Boolean, _]] = js.native
  /**
    * Draw points at the edges of gaps in the data. This improves visibility of small data
    * segments or other data irregularities.
    */
  var drawGapEdgePoints: js.UndefOr[Boolean] = js.native
  /**
    * Draw a custom item when a point is highlighted.    Default is a small dot matching the
    * series color. This method should constrain drawing to within pointSize pixels from (cx,
    * cy) Also see <a href='#drawPointCallback'>drawPointCallback</a>
    */
  var drawHighlightPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.native
  /**
    * Draw a custom item when drawPoints is enabled. Default is a small dot matching the series
    * color. This method should constrain drawing to within pointSize pixels from (cx, cy).
    * Also see <a href='#drawHighlightPointCallback'>drawHighlightPointCallback</a>
    */
  var drawPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.native
  /**
    * Does the data contain standard deviations? Setting this to true alters the input format.
    */
  var errorBars: js.UndefOr[Boolean] = js.native
  /**
    * Sets the data being displayed in the chart. This can only be set when calling
    * updateOptions; it cannot be set from the constructor. For a full description of valid data
    * formats, see the <a href='http://dygraphs.com/data.html'>Data Formats</a> page.
    */
  var file: js.UndefOr[Data] = js.native
  /**
    * When set, attempt to parse each cell in the CSV file as "a/b", where a and b are integers.
    * The ratio will be plotted. This allows computation of Wilson confidence intervals (see
    * below).
    */
  var fractions: js.UndefOr[Boolean] = js.native
  /**
    * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether to hide the legend when the mouse leaves the chart area.
    */
  var hideOverlayOnMouseOut: js.UndefOr[Boolean] = js.native
  /**
    * When set, this callback gets called every time a new point is highlighted.
    */
  var highlightCallback: js.UndefOr[
    js.Function5[
      /* event */ MouseEvent, 
      /* xval */ Double, 
      /* points */ js.Array[Point], 
      /* row */ Double, 
      /* seriesName */ String, 
      _
    ]
  ] = js.native
  /**
    * Fade the background while highlighting series. 1=fully visible background (disable
    * fading), 0=hiddden background (show highlighted series only).
    */
  var highlightSeriesBackgroundAlpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
    * Default: rgb(255, 255, 255)
    */
  var highlightSeriesBackgroundColor: js.UndefOr[String] = js.native
  /**
    * When set, the options from this object are applied to the timeseries closest to the mouse
    * pointer for interactive highlighting. See also 'highlightCallback'. Example:
    * highlightSeriesOpts: { strokeWidth: 3 }.
    */
  var highlightSeriesOpts: js.UndefOr[PerSeriesOptions] = js.native
  /**
    * Usually, dygraphs will use the range of the data plus some padding to set the range of the
    * y-axis. If this option is set, the y-axis will always include zero, typically as the
    * lowest value. This can be used to avoid exaggerating the variance in the data
    */
  var includeZero: js.UndefOr[Boolean] = js.native
  var interactionModel: js.UndefOr[js.Any] = js.native
  /**
    * When this option is passed to updateOptions() along with either the
    * <code>dateWindow</code> or <code>valueRange</code> options, the zoom flags are not changed
    * to reflect a zoomed state. This is primarily useful for when the display area of a chart
    * is changed programmatically and also where manual zooming is allowed and use is made of
    * the <code>isZoomed</code> method to determine this.
    */
  var isZoomedIgnoreProgrammaticZoom: js.UndefOr[Boolean] = js.native
  /**
    * A name for each data series, including the independent (X) series. For CSV files and
    * DataTable objections, this is determined by context. For raw data, this must be specified.
    * If it is not, default values are supplied and a warning is logged.
    */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Show data labels in an external div, rather than on the graph.    This value can either be a
    * div element or a div id.
    */
  var labelsDiv: js.UndefOr[String | HTMLElement] = js.native
  /**
    * Additional styles to apply to the currently-highlighted points div. For example, {
    * 'fontWeight': 'bold' } will make the labels bold. In general, it is better to use CSS to
    * style the .dygraph-legend class than to use this property.
    */
  var labelsDivStyles: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Width (in pixels) of the div which shows information on the currently-highlighted points.
    */
  var labelsDivWidth: js.UndefOr[Double] = js.native
  /**
    * Put <code>&lt;br/&gt;</code> between lines in the label string. Often used in conjunction
    * with <strong>labelsDiv</strong>.
    */
  var labelsSeparateLines: js.UndefOr[Boolean] = js.native
  /**
    * Show zero value labels in the labelsDiv.
    */
  var labelsShowZeroValues: js.UndefOr[Boolean] = js.native
  /**
    * Show date/time labels according to UTC (instead of local time).
    */
  var labelsUTC: js.UndefOr[Boolean] = js.native
  /**
    * When to display the legend. By default, it only appears when a user mouses over the chart.
    * Set it to "always" to always display a legend of some sort. When set to "follow", legend
    * follows highlighted points. If set to 'never' then it will not appear at all.
    */
  var legend: js.UndefOr[always | follow | onmouseover | never] = js.native
  /**
    * for details see https://github.com/danvk/dygraphs/pull/683
    */
  var legendFormatter: js.UndefOr[js.Function1[/* legendData */ LegendData, String]] = js.native
  /**
    * A value representing the farthest a graph may be panned, in percent of the display. For
    * example, a value of 0.1 means that the graph can only be panned 10% pased the edges of the
    * displayed values. null means no bounds.
    */
  var panEdgeFraction: js.UndefOr[Double] = js.native
  /**
    * Defines per-graph plugins. Useful for per-graph customization
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * A function to call when a data point is clicked. and the point that was clicked.
    */
  var pointClickCallback: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ Point, _]] = js.native
  /**
    * Height, in pixels, of the range selector widget. This option can only be specified at
    * Dygraph creation time.
    */
  var rangeSelectorHeight: js.UndefOr[Double] = js.native
  /**
    * The range selector mini plot fill color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
    */
  var rangeSelectorPlotFillColor: js.UndefOr[String] = js.native
  /**
    * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
    */
  var rangeSelectorPlotStrokeColor: js.UndefOr[String] = js.native
  /**
    * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
    * highlight the right-most data point.
    */
  var rightGap: js.UndefOr[Double] = js.native
  /**
    * Number of days over which to average data. Discussed extensively above.
    */
  var rollPeriod: js.UndefOr[Double] = js.native
  /**
    * Defines per-series options. Its keys match the y-axis label names, and the values are
    * dictionaries themselves that contain options specific to that series. When this option is
    * missing, it falls back on the old-style of per-series options comingled with global
    * options.
    */
  var series: js.UndefOr[StringDictionary[PerSeriesOptions]] = js.native
  /**
    * Whether to show the legend upon mouseover.
    */
  var showLabelsOnHighlight: js.UndefOr[Boolean] = js.native
  /**
    * Show or hide the range selector widget.
    */
  var showRangeSelector: js.UndefOr[Boolean] = js.native
  /**
    * If the rolling average period text box should be shown.
    */
  var showRoller: js.UndefOr[Boolean] = js.native
  /**
    * When errorBars is set, shade this many standard deviations above/below each point.
    */
  var sigma: js.UndefOr[Double] = js.native
  /**
    * If set, stack series on top of one another rather than drawing them independently. The
    * first series specified in the input data will wind up on top of the chart and the last
    * will be on bottom. NaN values are drawn as white areas without a line on top, see
    * stackedGraphNaNFill for details.
    */
  var stackedGraph: js.UndefOr[Boolean] = js.native
  /**
    * Controls handling of NaN values inside a stacked graph. NaN values are
    * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
    * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
    * rightmost value as needed), "inside" (interpolate internally only, use zero outside
    * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
    */
  var stackedGraphNaNFill: js.UndefOr[String] = js.native
  /**
    * Text to display above the chart. You can supply any HTML for this value, not just text. If
    * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Height of the chart title, in pixels. This also controls the default font size of the
    * title. If you style the title on your own, this controls how much space is set aside above
    * the chart for the title's div.
    */
  var titleHeight: js.UndefOr[Double] = js.native
  /**
    * When set, this callback gets called before the chart is drawn. It details on how to use
    * this.
    */
  var underlayCallback: js.UndefOr[
    js.Function3[/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph, _]
  ] = js.native
  /**
    * When set, this callback gets called every time the user stops highlighting any point by
    * mousing out of the graph.
    */
  var unhighlightCallback: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  /**
    * Which series should initially be visible? Once the Dygraph has been constructed, you can
    * access and modify the visibility of each series using the <code>visibility</code> and
    * <code>setVisibility</code> methods.
    */
  var visibility: js.UndefOr[js.Array[Boolean]] = js.native
  /**
    * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
    * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
    * more reasonable behavior for ratios close to 0 or 1.
    */
  var wilsonInterval: js.UndefOr[Boolean] = js.native
  /**
    * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
    * axisLabelFontSize and axisTickSize.
    */
  var xAxisHeight: js.UndefOr[Double] = js.native
  /**
    * Height of the x-axis label, in pixels. This also controls the default font size of the
    * x-axis label. If you style the label on your own, this controls how much space is set
    * aside below the chart for the x-axis label's div.
    */
  var xLabelHeight: js.UndefOr[Double] = js.native
  /**
    * Add the specified amount of extra space (in pixels) around the X-axis value range to
    * ensure points at the edges remain visible.
    */
  var xRangePad: js.UndefOr[Double] = js.native
  /**
    * A function which parses x-values (i.e. the dependent series). Must return a number, even
    * when the values are dates. In this case, millis since epoch are used. This is used
    * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
    * it will parse. See code for details.
    */
  var xValueParser: js.UndefOr[js.Function1[/* val */ String, Double]] = js.native
  /**
    * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
    * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
    * classes.
    */
  var xlabel: js.UndefOr[String] = js.native
  /**
    * Text to display to the right of the chart's secondary y-axis. This label is only displayed
    * if a secondary y-axis is present. See <a
    * href='http://dygraphs.com/tests/two-axes.html'>this test</a> for an example of how to do
    * this. The comments for the 'ylabel' option generally apply here as well. This label gets a
    * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
    */
  var y2label: js.UndefOr[String] = js.native
  /**
    * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
    * 90 degrees, this actually affects the height of its div.
    */
  var yLabelWidth: js.UndefOr[Double] = js.native
  /**
    * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
    * to ensure points at the edges remain visible. If unset, use the traditional Y padding
    * algorithm.
    */
  var yRangePad: js.UndefOr[Double] = js.native
  /**
    * Text to display to the left of the chart's y-axis. You can supply any HTML for this value,
    * not just text. If you wish to style it using CSS, use the 'dygraph-label' or
    * 'dygraph-ylabel' classes. The text will be rotated 90 degrees by default, so CSS rules may
    * behave in unintuitive ways. No additional space is set aside for a y-axis label. If you
    * need more space, increase the width of the y-axis tick labels using the yAxisLabelWidth
    * option. If you need a wider div for the y-axis label, either style it that way with CSS
    * (but remember that it's rotated, so width is controlled by the 'height' property) or set
    * the yLabelWidth option.
    */
  var ylabel: js.UndefOr[String] = js.native
  /**
    * A function to call when the zoom window is changed (either by zooming in or out).
    */
  var zoomCallback: js.UndefOr[
    js.Function3[
      /* minDate */ Double, 
      /* maxDate */ Double, 
      /* yRanges */ js.Array[js.Tuple2[Double, Double]], 
      _
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAnimatedZooms(value: Boolean): Self = this.set("animatedZooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimatedZooms: Self = this.set("animatedZooms", js.undefined)
    @scala.inline
    def setAnnotationClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = this.set("annotationClickHandler", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAnnotationClickHandler: Self = this.set("annotationClickHandler", js.undefined)
    @scala.inline
    def setAnnotationDblClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = this.set("annotationDblClickHandler", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAnnotationDblClickHandler: Self = this.set("annotationDblClickHandler", js.undefined)
    @scala.inline
    def setAnnotationMouseOutHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = this.set("annotationMouseOutHandler", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAnnotationMouseOutHandler: Self = this.set("annotationMouseOutHandler", js.undefined)
    @scala.inline
    def setAnnotationMouseOverHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = this.set("annotationMouseOverHandler", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAnnotationMouseOverHandler: Self = this.set("annotationMouseOverHandler", js.undefined)
    @scala.inline
    def setAxes(value: X): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setClickCallback(value: (/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point]) => _): Self = this.set("clickCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteClickCallback: Self = this.set("clickCallback", js.undefined)
    @scala.inline
    def setColorSaturation(value: Double): Self = this.set("colorSaturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSaturation: Self = this.set("colorSaturation", js.undefined)
    @scala.inline
    def setColorValue(value: Double): Self = this.set("colorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValue: Self = this.set("colorValue", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setConnectSeparatedPoints(value: Boolean): Self = this.set("connectSeparatedPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectSeparatedPoints: Self = this.set("connectSeparatedPoints", js.undefined)
    @scala.inline
    def setCustomBars(value: Boolean): Self = this.set("customBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomBars: Self = this.set("customBars", js.undefined)
    @scala.inline
    def setDataHandler(value: js.Any): Self = this.set("dataHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHandler: Self = this.set("dataHandler", js.undefined)
    @scala.inline
    def setDateWindowVarargs(value: Double*): Self = this.set("dateWindow", js.Array(value :_*))
    @scala.inline
    def setDateWindow(value: js.Array[Double]): Self = this.set("dateWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateWindow: Self = this.set("dateWindow", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDigitsAfterDecimal(value: Double): Self = this.set("digitsAfterDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigitsAfterDecimal: Self = this.set("digitsAfterDecimal", js.undefined)
    @scala.inline
    def setDisplayAnnotations(value: Boolean): Self = this.set("displayAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayAnnotations: Self = this.set("displayAnnotations", js.undefined)
    @scala.inline
    def setDrawAxesAtZero(value: Boolean): Self = this.set("drawAxesAtZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawAxesAtZero: Self = this.set("drawAxesAtZero", js.undefined)
    @scala.inline
    def setDrawCallback(value: (/* dygraph */ Dygraph, /* is_initial */ Boolean) => _): Self = this.set("drawCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrawCallback: Self = this.set("drawCallback", js.undefined)
    @scala.inline
    def setDrawGapEdgePoints(value: Boolean): Self = this.set("drawGapEdgePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawGapEdgePoints: Self = this.set("drawGapEdgePoints", js.undefined)
    @scala.inline
    def setDrawHighlightPointCallback(
      value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => _
    ): Self = this.set("drawHighlightPointCallback", js.Any.fromFunction7(value))
    @scala.inline
    def deleteDrawHighlightPointCallback: Self = this.set("drawHighlightPointCallback", js.undefined)
    @scala.inline
    def setDrawPointCallback(
      value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => _
    ): Self = this.set("drawPointCallback", js.Any.fromFunction7(value))
    @scala.inline
    def deleteDrawPointCallback: Self = this.set("drawPointCallback", js.undefined)
    @scala.inline
    def setErrorBars(value: Boolean): Self = this.set("errorBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorBars: Self = this.set("errorBars", js.undefined)
    @scala.inline
    def setFileVarargs(value: (js.Array[Double | Date | Null])*): Self = this.set("file", js.Array(value :_*))
    @scala.inline
    def setFile(value: Data): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFractions(value: Boolean): Self = this.set("fractions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractions: Self = this.set("fractions", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideOverlayOnMouseOut(value: Boolean): Self = this.set("hideOverlayOnMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOverlayOnMouseOut: Self = this.set("hideOverlayOnMouseOut", js.undefined)
    @scala.inline
    def setHighlightCallback(
      value: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], /* row */ Double, /* seriesName */ String) => _
    ): Self = this.set("highlightCallback", js.Any.fromFunction5(value))
    @scala.inline
    def deleteHighlightCallback: Self = this.set("highlightCallback", js.undefined)
    @scala.inline
    def setHighlightSeriesBackgroundAlpha(value: Double): Self = this.set("highlightSeriesBackgroundAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSeriesBackgroundAlpha: Self = this.set("highlightSeriesBackgroundAlpha", js.undefined)
    @scala.inline
    def setHighlightSeriesBackgroundColor(value: String): Self = this.set("highlightSeriesBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSeriesBackgroundColor: Self = this.set("highlightSeriesBackgroundColor", js.undefined)
    @scala.inline
    def setHighlightSeriesOpts(value: PerSeriesOptions): Self = this.set("highlightSeriesOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSeriesOpts: Self = this.set("highlightSeriesOpts", js.undefined)
    @scala.inline
    def setIncludeZero(value: Boolean): Self = this.set("includeZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeZero: Self = this.set("includeZero", js.undefined)
    @scala.inline
    def setInteractionModel(value: js.Any): Self = this.set("interactionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionModel: Self = this.set("interactionModel", js.undefined)
    @scala.inline
    def setIsZoomedIgnoreProgrammaticZoom(value: Boolean): Self = this.set("isZoomedIgnoreProgrammaticZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsZoomedIgnoreProgrammaticZoom: Self = this.set("isZoomedIgnoreProgrammaticZoom", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLabelsDiv(value: String | HTMLElement): Self = this.set("labelsDiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsDiv: Self = this.set("labelsDiv", js.undefined)
    @scala.inline
    def setLabelsDivStyles(value: StringDictionary[String]): Self = this.set("labelsDivStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsDivStyles: Self = this.set("labelsDivStyles", js.undefined)
    @scala.inline
    def setLabelsDivWidth(value: Double): Self = this.set("labelsDivWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsDivWidth: Self = this.set("labelsDivWidth", js.undefined)
    @scala.inline
    def setLabelsSeparateLines(value: Boolean): Self = this.set("labelsSeparateLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsSeparateLines: Self = this.set("labelsSeparateLines", js.undefined)
    @scala.inline
    def setLabelsShowZeroValues(value: Boolean): Self = this.set("labelsShowZeroValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsShowZeroValues: Self = this.set("labelsShowZeroValues", js.undefined)
    @scala.inline
    def setLabelsUTC(value: Boolean): Self = this.set("labelsUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsUTC: Self = this.set("labelsUTC", js.undefined)
    @scala.inline
    def setLegend(value: always | follow | onmouseover | never): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendFormatter(value: /* legendData */ LegendData => String): Self = this.set("legendFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendFormatter: Self = this.set("legendFormatter", js.undefined)
    @scala.inline
    def setPanEdgeFraction(value: Double): Self = this.set("panEdgeFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanEdgeFraction: Self = this.set("panEdgeFraction", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPointClickCallback(value: (/* e */ MouseEvent, /* point */ Point) => _): Self = this.set("pointClickCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deletePointClickCallback: Self = this.set("pointClickCallback", js.undefined)
    @scala.inline
    def setRangeSelectorHeight(value: Double): Self = this.set("rangeSelectorHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorHeight: Self = this.set("rangeSelectorHeight", js.undefined)
    @scala.inline
    def setRangeSelectorPlotFillColor(value: String): Self = this.set("rangeSelectorPlotFillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorPlotFillColor: Self = this.set("rangeSelectorPlotFillColor", js.undefined)
    @scala.inline
    def setRangeSelectorPlotStrokeColor(value: String): Self = this.set("rangeSelectorPlotStrokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelectorPlotStrokeColor: Self = this.set("rangeSelectorPlotStrokeColor", js.undefined)
    @scala.inline
    def setRightGap(value: Double): Self = this.set("rightGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightGap: Self = this.set("rightGap", js.undefined)
    @scala.inline
    def setRollPeriod(value: Double): Self = this.set("rollPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollPeriod: Self = this.set("rollPeriod", js.undefined)
    @scala.inline
    def setSeries(value: StringDictionary[PerSeriesOptions]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setShowLabelsOnHighlight(value: Boolean): Self = this.set("showLabelsOnHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabelsOnHighlight: Self = this.set("showLabelsOnHighlight", js.undefined)
    @scala.inline
    def setShowRangeSelector(value: Boolean): Self = this.set("showRangeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRangeSelector: Self = this.set("showRangeSelector", js.undefined)
    @scala.inline
    def setShowRoller(value: Boolean): Self = this.set("showRoller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoller: Self = this.set("showRoller", js.undefined)
    @scala.inline
    def setSigma(value: Double): Self = this.set("sigma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigma: Self = this.set("sigma", js.undefined)
    @scala.inline
    def setStackedGraph(value: Boolean): Self = this.set("stackedGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedGraph: Self = this.set("stackedGraph", js.undefined)
    @scala.inline
    def setStackedGraphNaNFill(value: String): Self = this.set("stackedGraphNaNFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedGraphNaNFill: Self = this.set("stackedGraphNaNFill", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleHeight(value: Double): Self = this.set("titleHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleHeight: Self = this.set("titleHeight", js.undefined)
    @scala.inline
    def setUnderlayCallback(value: (/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph) => _): Self = this.set("underlayCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUnderlayCallback: Self = this.set("underlayCallback", js.undefined)
    @scala.inline
    def setUnhighlightCallback(value: /* event */ MouseEvent => _): Self = this.set("unhighlightCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnhighlightCallback: Self = this.set("unhighlightCallback", js.undefined)
    @scala.inline
    def setVisibilityVarargs(value: Boolean*): Self = this.set("visibility", js.Array(value :_*))
    @scala.inline
    def setVisibility(value: js.Array[Boolean]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWilsonInterval(value: Boolean): Self = this.set("wilsonInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWilsonInterval: Self = this.set("wilsonInterval", js.undefined)
    @scala.inline
    def setXAxisHeight(value: Double): Self = this.set("xAxisHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisHeight: Self = this.set("xAxisHeight", js.undefined)
    @scala.inline
    def setXLabelHeight(value: Double): Self = this.set("xLabelHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXLabelHeight: Self = this.set("xLabelHeight", js.undefined)
    @scala.inline
    def setXRangePad(value: Double): Self = this.set("xRangePad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXRangePad: Self = this.set("xRangePad", js.undefined)
    @scala.inline
    def setXValueParser(value: /* val */ String => Double): Self = this.set("xValueParser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteXValueParser: Self = this.set("xValueParser", js.undefined)
    @scala.inline
    def setXlabel(value: String): Self = this.set("xlabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlabel: Self = this.set("xlabel", js.undefined)
    @scala.inline
    def setY2label(value: String): Self = this.set("y2label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2label: Self = this.set("y2label", js.undefined)
    @scala.inline
    def setYLabelWidth(value: Double): Self = this.set("yLabelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYLabelWidth: Self = this.set("yLabelWidth", js.undefined)
    @scala.inline
    def setYRangePad(value: Double): Self = this.set("yRangePad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYRangePad: Self = this.set("yRangePad", js.undefined)
    @scala.inline
    def setYlabel(value: String): Self = this.set("ylabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYlabel: Self = this.set("ylabel", js.undefined)
    @scala.inline
    def setZoomCallback(
      value: (/* minDate */ Double, /* maxDate */ Double, /* yRanges */ js.Array[js.Tuple2[Double, Double]]) => _
    ): Self = this.set("zoomCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteZoomCallback: Self = this.set("zoomCallback", js.undefined)
  }
  
}

