package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends PerSeriesOptions
     with PerAxisOptions {
  /**
    * Set this option to animate the transition between zoom windows. Applies to programmatic
    * and interactive zooms. Note that if you also set a drawCallback, it will be called several
    * times on each zoom. If you set a zoomCallback, it will only be called after the animation
    * is complete.
    */
  var animatedZooms: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If provided, this function is called whenever the user clicks on an annotation.
    */
  var annotationClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user double-clicks on an annotation.
    */
  var annotationDblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user mouses out of an annotation.
    */
  var annotationMouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * If provided, this function is called whenever the user mouses over an annotation.
    */
  var annotationMouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /**
    * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
    * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
    * See also documentation on <a href='http://dygraphs.com/per-axis.html'>per-series and
    * per-axis options</a>.
    */
  var axes: js.UndefOr[dygraphsLib.Anon_X] = js.undefined
  /**
    * A function to call when the canvas is clicked.
    */
  var clickCallback: js.UndefOr[
    js.Function3[/* e */ stdLib.MouseEvent, /* xval */ scala.Double, /* points */ js.Array[Point], _]
  ] = js.undefined
  /**
    * If <strong>colors</strong> is not specified, saturation of the automatically-generated
    * data series colors. (0.0-1.0).
    */
  var colorSaturation: js.UndefOr[scala.Double] = js.undefined
  /**
    * If colors is not specified, value of the data series colors, as in hue/saturation/value.
    * (0.0-1.0, default 0.5)
    */
  var colorValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of colors for the data series. These can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
    * color wheel are used. Overridden by the 'color' option.
    */
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
    * a gap and draws it as such. If, instead, the missing values represents an x-value for
    * which only a different series has data, then you'll want to connect the dots by setting
    * this to true. To explicitly include a gap with this option set, use a value of NaN.
    */
  var connectSeparatedPoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
    * point between low and high, with the series itself going through middle.
    */
  var customBars: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom DataHandler. This is an advanced customization. See http://bit.ly/151E7Aq.
    */
  var dataHandler: js.UndefOr[js.Any] = js.undefined
  /**
    * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
    * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
    * values in dateWindow must also be numbers.
    */
  var dateWindow: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
    * not usually necessary, since tab-delimited data is auto-detected.
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unless it's run in scientific mode (see the <code>sigFigs</code> option), dygraphs
    * displays numbers with <code>digitsAfterDecimal</code> digits after the decimal point.
    * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
    * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
    * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
    * displayed in scientific notation.
    */
  var digitsAfterDecimal: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
    * series to be interpreted as annotations on points in that series. This is the same format
    * used by Google's AnnotatedTimeLine chart.
    */
  var displayAnnotations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
    * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
    * left graph edge as usual.
    */
  var drawAxesAtZero: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, this callback gets called every time the dygraph is drawn. This includes the
    * initial draw, after zooming and repeatedly while panning.
    */
  var drawCallback: js.UndefOr[
    js.Function2[/* dygraph */ dygraphsLib.Dygraph, /* is_initial */ scala.Boolean, _]
  ] = js.undefined
  /**
    * Draw points at the edges of gaps in the data. This improves visibility of small data
    * segments or other data irregularities.
    */
  var drawGapEdgePoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Draw a custom item when a point is highlighted.    Default is a small dot matching the
    * series color. This method should constrain drawing to within pointSize pixels from (cx,
    * cy) Also see <a href='#drawPointCallback'>drawPointCallback</a>
    */
  var drawHighlightPointCallback: js.UndefOr[
    js.Function7[
      /* g */ dygraphsLib.Dygraph, 
      /* seriesName */ java.lang.String, 
      /* canvasContext */ stdLib.CanvasRenderingContext2D, 
      /* cx */ scala.Double, 
      /* cy */ scala.Double, 
      /* color */ java.lang.String, 
      /* pointSize */ scala.Double, 
      _
    ]
  ] = js.undefined
  /**
    * Draw a custom item when drawPoints is enabled. Default is a small dot matching the series
    * color. This method should constrain drawing to within pointSize pixels from (cx, cy).
    * Also see <a href='#drawHighlightPointCallback'>drawHighlightPointCallback</a>
    */
  var drawPointCallback: js.UndefOr[
    js.Function7[
      /* g */ dygraphsLib.Dygraph, 
      /* seriesName */ java.lang.String, 
      /* canvasContext */ stdLib.CanvasRenderingContext2D, 
      /* cx */ scala.Double, 
      /* cy */ scala.Double, 
      /* color */ java.lang.String, 
      /* pointSize */ scala.Double, 
      _
    ]
  ] = js.undefined
  /**
    * Does the data contain standard deviations? Setting this to true alters the input format.
    */
  var errorBars: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the data being displayed in the chart. This can only be set when calling
    * updateOptions; it cannot be set from the constructor. For a full description of valid data
    * formats, see the <a href='http://dygraphs.com/data.html'>Data Formats</a> page.
    */
  var file: js.UndefOr[Data] = js.undefined
  /**
    * When set, attempt to parse each cell in the CSV file as "a/b", where a and b are integers.
    * The ratio will be plotted. This allows computation of Wilson confidence intervals (see
    * below).
    */
  var fractions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to hide the legend when the mouse leaves the chart area.
    */
  var hideOverlayOnMouseOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set, this callback gets called every time a new point is highlighted.
    */
  var highlightCallback: js.UndefOr[
    js.Function5[
      /* event */ stdLib.MouseEvent, 
      /* xval */ scala.Double, 
      /* points */ js.Array[Point], 
      /* row */ scala.Double, 
      /* seriesName */ java.lang.String, 
      _
    ]
  ] = js.undefined
  /**
    * Fade the background while highlighting series. 1=fully visible background (disable
    * fading), 0=hiddden background (show highlighted series only).
    */
  var highlightSeriesBackgroundAlpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
    * Default: rgb(255, 255, 255)
    */
  var highlightSeriesBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When set, the options from this object are applied to the timeseries closest to the mouse
    * pointer for interactive highlighting. See also 'highlightCallback'. Example:
    * highlightSeriesOpts: { strokeWidth: 3 }.
    */
  var highlightSeriesOpts: js.UndefOr[PerSeriesOptions] = js.undefined
  /**
    * Usually, dygraphs will use the range of the data plus some padding to set the range of the
    * y-axis. If this option is set, the y-axis will always include zero, typically as the
    * lowest value. This can be used to avoid exaggerating the variance in the data
    */
  var includeZero: js.UndefOr[scala.Boolean] = js.undefined
  var interactionModel: js.UndefOr[js.Any] = js.undefined
  /**
    * When this option is passed to updateOptions() along with either the
    * <code>dateWindow</code> or <code>valueRange</code> options, the zoom flags are not changed
    * to reflect a zoomed state. This is primarily useful for when the display area of a chart
    * is changed programmatically and also where manual zooming is allowed and use is made of
    * the <code>isZoomed</code> method to determine this.
    */
  var isZoomedIgnoreProgrammaticZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A name for each data series, including the independent (X) series. For CSV files and
    * DataTable objections, this is determined by context. For raw data, this must be specified.
    * If it is not, default values are supplied and a warning is logged.
    */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Show data labels in an external div, rather than on the graph.    This value can either be a
    * div element or a div id.
    */
  var labelsDiv: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /**
    * Additional styles to apply to the currently-highlighted points div. For example, {
    * 'fontWeight': 'bold' } will make the labels bold. In general, it is better to use CSS to
    * style the .dygraph-legend class than to use this property.
    */
  var labelsDivStyles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Width (in pixels) of the div which shows information on the currently-highlighted points.
    */
  var labelsDivWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Put <code>&lt;br/&gt;</code> between lines in the label string. Often used in conjunction
    * with <strong>labelsDiv</strong>.
    */
  var labelsSeparateLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show zero value labels in the labelsDiv.
    */
  var labelsShowZeroValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show date/time labels according to UTC (instead of local time).
    */
  var labelsUTC: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When to display the legend. By default, it only appears when a user mouses over the chart.
    * Set it to "always" to always display a legend of some sort. When set to "follow", legend
    * follows highlighted points. If set to 'never' then it will not appear at all.
    */
  var legend: js.UndefOr[
    dygraphsLib.dygraphsLibStrings.always | dygraphsLib.dygraphsLibStrings.follow | dygraphsLib.dygraphsLibStrings.onmouseover | dygraphsLib.dygraphsLibStrings.never
  ] = js.undefined
  /**
    * for details see https://github.com/danvk/dygraphs/pull/683
    */
  var legendFormatter: js.UndefOr[js.Function1[/* legendData */ LegendData, java.lang.String]] = js.undefined
  /**
    * A value representing the farthest a graph may be panned, in percent of the display. For
    * example, a value of 0.1 means that the graph can only be panned 10% pased the edges of the
    * displayed values. null means no bounds.
    */
  var panEdgeFraction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines per-graph plugins. Useful for per-graph customization
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * A function to call when a data point is clicked. and the point that was clicked.
    */
  var pointClickCallback: js.UndefOr[js.Function2[/* e */ stdLib.MouseEvent, /* point */ Point, _]] = js.undefined
  /**
    * Height, in pixels, of the range selector widget. This option can only be specified at
    * Dygraph creation time.
    */
  var rangeSelectorHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The range selector mini plot fill color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
    */
  var rangeSelectorPlotFillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
    */
  var rangeSelectorPlotStrokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
    * highlight the right-most data point.
    */
  var rightGap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of days over which to average data. Discussed extensively above.
    */
  var rollPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines per-series options. Its keys match the y-axis label names, and the values are
    * dictionaries themselves that contain options specific to that series. When this option is
    * missing, it falls back on the old-style of per-series options comingled with global
    * options.
    */
  var series: js.UndefOr[org.scalablytyped.runtime.StringDictionary[PerSeriesOptions]] = js.undefined
  /**
    * Whether to show the legend upon mouseover.
    */
  var showLabelsOnHighlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show or hide the range selector widget.
    */
  var showRangeSelector: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the rolling average period text box should be shown.
    */
  var showRoller: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When errorBars is set, shade this many standard deviations above/below each point.
    */
  var sigma: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set, stack series on top of one another rather than drawing them independently. The
    * first series specified in the input data will wind up on top of the chart and the last
    * will be on bottom. NaN values are drawn as white areas without a line on top, see
    * stackedGraphNaNFill for details.
    */
  var stackedGraph: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls handling of NaN values inside a stacked graph. NaN values are
    * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
    * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
    * rightmost value as needed), "inside" (interpolate internally only, use zero outside
    * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
    */
  var stackedGraphNaNFill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to display above the chart. You can supply any HTML for this value, not just text. If
    * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height of the chart title, in pixels. This also controls the default font size of the
    * title. If you style the title on your own, this controls how much space is set aside above
    * the chart for the title's div.
    */
  var titleHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * When set, this callback gets called before the chart is drawn. It details on how to use
    * this.
    */
  var underlayCallback: js.UndefOr[
    js.Function3[
      /* context */ stdLib.CanvasRenderingContext2D, 
      /* area */ Area, 
      /* dygraph */ dygraphsLib.Dygraph, 
      _
    ]
  ] = js.undefined
  /**
    * When set, this callback gets called every time the user stops highlighting any point by
    * mousing out of the graph.
    */
  var unhighlightCallback: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, _]] = js.undefined
  /**
    * Which series should initially be visible? Once the Dygraph has been constructed, you can
    * access and modify the visibility of each series using the <code>visibility</code> and
    * <code>setVisibility</code> methods.
    */
  var visibility: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  /**
    * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
    * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
    * more reasonable behavior for ratios close to 0 or 1.
    */
  var wilsonInterval: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
    * axisLabelFontSize and axisTickSize.
    */
  var xAxisHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height of the x-axis label, in pixels. This also controls the default font size of the
    * x-axis label. If you style the label on your own, this controls how much space is set
    * aside below the chart for the x-axis label's div.
    */
  var xLabelHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Add the specified amount of extra space (in pixels) around the X-axis value range to
    * ensure points at the edges remain visible.
    */
  var xRangePad: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function which parses x-values (i.e. the dependent series). Must return a number, even
    * when the values are dates. In this case, millis since epoch are used. This is used
    * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
    * it will parse. See code for details.
    */
  var xValueParser: js.UndefOr[js.Function1[/* val */ java.lang.String, scala.Double]] = js.undefined
  /**
    * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
    * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
    * classes.
    */
  var xlabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to display to the right of the chart's secondary y-axis. This label is only displayed
    * if a secondary y-axis is present. See <a
    * href='http://dygraphs.com/tests/two-axes.html'>this test</a> for an example of how to do
    * this. The comments for the 'ylabel' option generally apply here as well. This label gets a
    * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
    */
  var y2label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
    * 90 degrees, this actually affects the height of its div.
    */
  var yLabelWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
    * to ensure points at the edges remain visible. If unset, use the traditional Y padding
    * algorithm.
    */
  var yRangePad: js.UndefOr[scala.Double] = js.undefined
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
  var ylabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function to call when the zoom window is changed (either by zooming in or out).
    */
  var zoomCallback: js.UndefOr[
    js.Function3[
      /* minDate */ scala.Double, 
      /* maxDate */ scala.Double, 
      /* yRanges */ js.Array[js.Tuple2[scala.Double, scala.Double]], 
      _
    ]
  ] = js.undefined
}

