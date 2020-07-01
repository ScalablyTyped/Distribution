package typings.dygraphs.dygraphs

import typings.dygraphs.Dygraph
import typings.dygraphs.anon.Label
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerAxisOptions extends js.Object {
  /**
    * Color for x- and y-axis labels. This is a CSS color string.
    */
  var axisLabelColor: js.UndefOr[String] = js.undefined
  /**
    * Size of the font (in pixels) to use in the axis labels, both x- and y-axis.
    */
  var axisLabelFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Function to call to format the tick values that appear along an axis. This is usually set
    * on a <a href='per-axis.html'>per-axis</a> basis.
    */
  var axisLabelFormatter: js.UndefOr[
    js.Function4[
      /* v */ Double | Date, 
      /* granularity */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* dygraph */ Dygraph, 
      _
    ]
  ] = js.undefined
  /**
    * Width (in pixels) of the containing divs for x- and y-axis labels. For the y-axis, this
    * also controls the width of the y-axis. Note that for the x-axis, this is independent from
    * pixelsPerLabel, which controls the spacing between labels.
    */
  var axisLabelWidth: js.UndefOr[Double] = js.undefined
  /**
    * Color of the x- and y-axis lines. Accepts any value which the HTML canvas strokeStyle
    * attribute understands, e.g. 'black' or 'rgb(0, 100, 255)'.
    */
  var axisLineColor: js.UndefOr[String] = js.undefined
  /**
    * Thickness (in pixels) of the x- and y-axis lines.
    */
  var axisLineWidth: js.UndefOr[Double] = js.undefined
  /**
    * The size of the line to display next to each tick mark on x- or y-axes.
    */
  var axisTickSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to draw the specified axis. This may be set on a per-axis basis to define the
    * visibility of each axis separately. Setting this to false also prevents axis ticks from
    * being drawn and reclaims the space for the chart grid/lines.
    */
  var drawAxis: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to display gridlines in the chart. This may be set on a per-axis basis to define
    * the visibility of each axis' grid separately.
    */
  var drawGrid: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the gridlines. This may be set on a per-axis basis to define each axis' grid
    * separately.
    */
  var gridLineColor: js.UndefOr[String] = js.undefined
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * gridlines.
    */
  var gridLinePattern: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Thickness (in pixels) of the gridlines drawn under the chart. The vertical/horizontal
    * gridlines can be turned off entirely by using the drawXGrid and drawYGrid options. This
    * may be set on a per-axis basis to define each axis' grid separately.
    */
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Only valid for y and y2, has no effect on x: This option defines whether the y axes should
    * align their ticks or if they should be independent. Possible combinations: 1.) y=true,
    * y2=false (default): y is the primary axis and the y2 ticks are aligned to the the ones of
    * y. (only 1 grid) 2.) y=false, y2=true: y2 is the primary axis and the y ticks are aligned
    * to the the ones of y2. (only 1 grid) 3.) y=true, y2=true: Both axis are independent and
    * have their own ticks. (2 grids) 4.) y=false, y2=false: Invalid configuration causes an
    * error.
    */
  var independentTicks: js.UndefOr[Boolean] = js.undefined
  /**
    * Show K/M/B for thousands/millions/billions on y-axis.
    */
  var labelsKMB: js.UndefOr[Boolean] = js.undefined
  /**
    * Show k/M/G for kilo/Mega/Giga on y-axis. This is different than <code>labelsKMB</code> in
    * that it uses base 2, not 10.
    */
  var labelsKMG2: js.UndefOr[Boolean] = js.undefined
  /**
    * When set for the y-axis or x-axis, the graph shows that axis in log scale. Any values less
    * than or equal to zero are not displayed. Showing log scale with ranges that go below zero
    * will result in an unviewable graph.
    *
    * Not compatible with showZero. connectSeparatedPoints is ignored. This is ignored for
    * date-based x-axes.
    */
  var logscale: js.UndefOr[Boolean] = js.undefined
  /**
    * When displaying numbers in normal (not scientific) mode, large numbers will be displayed
    * with many trailing zeros (e.g. 100000000 instead of 1e9). This can lead to unwieldy y-axis
    * labels. If there are more than <code>maxNumberWidth</code> digits to the left of the
    * decimal in a number, dygraphs will switch to scientific notation, even when not operating
    * in scientific mode. If you'd like to see all those digits, set this to something large,
    * like 20 or 30.
    */
  var maxNumberWidth: js.UndefOr[Double] = js.undefined
  /**
    * Number of pixels to require between each x- and y-label. Larger values will yield a
    * sparser axis with fewer ticks. This is set on a <a href='per-axis.html'>per-axis</a>
    * basis.
    */
  var pixelsPerLabel: js.UndefOr[Double] = js.undefined
  /**
    * By default, dygraphs displays numbers with a fixed number of digits after the decimal
    * point. If you'd prefer to have a fixed number of significant figures, set this option to
    * that number of sig figs. A value of 2, for instance, would cause 1 to be display as 1.0
    * and 1234 to be displayed as 1.23e+3.
    */
  var sigFigs: js.UndefOr[Double] = js.undefined
  /**
    * This lets you specify an arbitrary function to generate tick marks on an axis. The tick
    * marks are an array of (value, label) pairs. The built-in functions go to great lengths to
    * choose good tick marks so, if you set this option, you'll most likely want to call one of
    * them and modify the result. See dygraph-tickers.js for an extensive discussion. This is
    * set on a <a href='per-axis.html'>per-axis</a> basis.
    */
  var ticker: js.UndefOr[
    js.Function6[
      /* min */ Double, 
      /* max */ Double, 
      /* pixels */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* dygraph */ Dygraph, 
      /* vals */ js.Array[Double], 
      js.Array[Label]
    ]
  ] = js.undefined
  /**
    * Function to provide a custom display format for the values displayed on mouseover. This
    * does not affect the values that appear on tick marks next to the axes. To format those,
    * see axisLabelFormatter. This is usually set on a <a href='per-axis.html'>per-axis</a>
    * basis.
    */
  var valueFormatter: js.UndefOr[
    js.Function6[
      /* v */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* seriesName */ String, 
      /* dygraph */ Dygraph, 
      /* row */ Double, 
      /* col */ Double, 
      _
    ]
  ] = js.undefined
  /**
    * Explicitly set the vertical range of the graph to [low, high]. This may be set on a
    * per-axis basis to define each y-axis separately. If either limit is unspecified, it will
    * be calculated automatically (e.g. [null, 30] to automatically calculate just the lower
    * bound)
    */
  var valueRange: js.UndefOr[(js.Tuple2[Double | Null, Double | Null]) | Null] = js.undefined
}

object PerAxisOptions {
  @scala.inline
  def apply(
    axisLabelColor: String = null,
    axisLabelFontSize: js.UndefOr[Double] = js.undefined,
    axisLabelFormatter: (/* v */ Double | Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph) => _ = null,
    axisLabelWidth: js.UndefOr[Double] = js.undefined,
    axisLineColor: String = null,
    axisLineWidth: js.UndefOr[Double] = js.undefined,
    axisTickSize: js.UndefOr[Double] = js.undefined,
    drawAxis: js.UndefOr[Boolean] = js.undefined,
    drawGrid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridLinePattern: js.Array[Double] = null,
    gridLineWidth: js.UndefOr[Double] = js.undefined,
    independentTicks: js.UndefOr[Boolean] = js.undefined,
    labelsKMB: js.UndefOr[Boolean] = js.undefined,
    labelsKMG2: js.UndefOr[Boolean] = js.undefined,
    logscale: js.UndefOr[Boolean] = js.undefined,
    maxNumberWidth: js.UndefOr[Double] = js.undefined,
    pixelsPerLabel: js.UndefOr[Double] = js.undefined,
    sigFigs: js.UndefOr[Double] = js.undefined,
    ticker: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph, /* vals */ js.Array[Double]) => js.Array[Label] = null,
    valueFormatter: (/* v */ Double, /* opts */ js.Function1[/* name */ String, _], /* seriesName */ String, /* dygraph */ Dygraph, /* row */ Double, /* col */ Double) => _ = null,
    valueRange: js.UndefOr[Null | (js.Tuple2[Double | Null, Double | Null])] = js.undefined
  ): PerAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (axisLabelColor != null) __obj.updateDynamic("axisLabelColor")(axisLabelColor.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLabelFontSize)) __obj.updateDynamic("axisLabelFontSize")(axisLabelFontSize.get.asInstanceOf[js.Any])
    if (axisLabelFormatter != null) __obj.updateDynamic("axisLabelFormatter")(js.Any.fromFunction4(axisLabelFormatter))
    if (!js.isUndefined(axisLabelWidth)) __obj.updateDynamic("axisLabelWidth")(axisLabelWidth.get.asInstanceOf[js.Any])
    if (axisLineColor != null) __obj.updateDynamic("axisLineColor")(axisLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLineWidth)) __obj.updateDynamic("axisLineWidth")(axisLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisTickSize)) __obj.updateDynamic("axisTickSize")(axisTickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawAxis)) __obj.updateDynamic("drawAxis")(drawAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawGrid)) __obj.updateDynamic("drawGrid")(drawGrid.get.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLinePattern != null) __obj.updateDynamic("gridLinePattern")(gridLinePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineWidth)) __obj.updateDynamic("gridLineWidth")(gridLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(independentTicks)) __obj.updateDynamic("independentTicks")(independentTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsKMB)) __obj.updateDynamic("labelsKMB")(labelsKMB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsKMG2)) __obj.updateDynamic("labelsKMG2")(labelsKMG2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logscale)) __obj.updateDynamic("logscale")(logscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumberWidth)) __obj.updateDynamic("maxNumberWidth")(maxNumberWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelsPerLabel)) __obj.updateDynamic("pixelsPerLabel")(pixelsPerLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sigFigs)) __obj.updateDynamic("sigFigs")(sigFigs.get.asInstanceOf[js.Any])
    if (ticker != null) __obj.updateDynamic("ticker")(js.Any.fromFunction6(ticker))
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(js.Any.fromFunction6(valueFormatter))
    if (!js.isUndefined(valueRange)) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerAxisOptions]
  }
}

