package typings.dygraphs.dygraphs

import typings.dygraphs.Dygraph
import typings.dygraphs.anon.Label
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerAxisOptions extends js.Object {
  
  /**
    * Color for x- and y-axis labels. This is a CSS color string.
    */
  var axisLabelColor: js.UndefOr[String] = js.native
  
  /**
    * Size of the font (in pixels) to use in the axis labels, both x- and y-axis.
    */
  var axisLabelFontSize: js.UndefOr[Double] = js.native
  
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
  ] = js.native
  
  /**
    * Width (in pixels) of the containing divs for x- and y-axis labels. For the y-axis, this
    * also controls the width of the y-axis. Note that for the x-axis, this is independent from
    * pixelsPerLabel, which controls the spacing between labels.
    */
  var axisLabelWidth: js.UndefOr[Double] = js.native
  
  /**
    * Color of the x- and y-axis lines. Accepts any value which the HTML canvas strokeStyle
    * attribute understands, e.g. 'black' or 'rgb(0, 100, 255)'.
    */
  var axisLineColor: js.UndefOr[String] = js.native
  
  /**
    * Thickness (in pixels) of the x- and y-axis lines.
    */
  var axisLineWidth: js.UndefOr[Double] = js.native
  
  /**
    * The size of the line to display next to each tick mark on x- or y-axes.
    */
  var axisTickSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether to draw the specified axis. This may be set on a per-axis basis to define the
    * visibility of each axis separately. Setting this to false also prevents axis ticks from
    * being drawn and reclaims the space for the chart grid/lines.
    */
  var drawAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display gridlines in the chart. This may be set on a per-axis basis to define
    * the visibility of each axis' grid separately.
    */
  var drawGrid: js.UndefOr[Boolean] = js.native
  
  /**
    * The color of the gridlines. This may be set on a per-axis basis to define each axis' grid
    * separately.
    */
  var gridLineColor: js.UndefOr[String] = js.native
  
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * gridlines.
    */
  var gridLinePattern: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Thickness (in pixels) of the gridlines drawn under the chart. The vertical/horizontal
    * gridlines can be turned off entirely by using the drawXGrid and drawYGrid options. This
    * may be set on a per-axis basis to define each axis' grid separately.
    */
  var gridLineWidth: js.UndefOr[Double] = js.native
  
  /**
    * Only valid for y and y2, has no effect on x: This option defines whether the y axes should
    * align their ticks or if they should be independent. Possible combinations: 1.) y=true,
    * y2=false (default): y is the primary axis and the y2 ticks are aligned to the the ones of
    * y. (only 1 grid) 2.) y=false, y2=true: y2 is the primary axis and the y ticks are aligned
    * to the the ones of y2. (only 1 grid) 3.) y=true, y2=true: Both axis are independent and
    * have their own ticks. (2 grids) 4.) y=false, y2=false: Invalid configuration causes an
    * error.
    */
  var independentTicks: js.UndefOr[Boolean] = js.native
  
  /**
    * Show K/M/B for thousands/millions/billions on y-axis.
    */
  var labelsKMB: js.UndefOr[Boolean] = js.native
  
  /**
    * Show k/M/G for kilo/Mega/Giga on y-axis. This is different than <code>labelsKMB</code> in
    * that it uses base 2, not 10.
    */
  var labelsKMG2: js.UndefOr[Boolean] = js.native
  
  /**
    * When set for the y-axis or x-axis, the graph shows that axis in log scale. Any values less
    * than or equal to zero are not displayed. Showing log scale with ranges that go below zero
    * will result in an unviewable graph.
    *
    * Not compatible with showZero. connectSeparatedPoints is ignored. This is ignored for
    * date-based x-axes.
    */
  var logscale: js.UndefOr[Boolean] = js.native
  
  /**
    * When displaying numbers in normal (not scientific) mode, large numbers will be displayed
    * with many trailing zeros (e.g. 100000000 instead of 1e9). This can lead to unwieldy y-axis
    * labels. If there are more than <code>maxNumberWidth</code> digits to the left of the
    * decimal in a number, dygraphs will switch to scientific notation, even when not operating
    * in scientific mode. If you'd like to see all those digits, set this to something large,
    * like 20 or 30.
    */
  var maxNumberWidth: js.UndefOr[Double] = js.native
  
  /**
    * Number of pixels to require between each x- and y-label. Larger values will yield a
    * sparser axis with fewer ticks. This is set on a <a href='per-axis.html'>per-axis</a>
    * basis.
    */
  var pixelsPerLabel: js.UndefOr[Double] = js.native
  
  /**
    * By default, dygraphs displays numbers with a fixed number of digits after the decimal
    * point. If you'd prefer to have a fixed number of significant figures, set this option to
    * that number of sig figs. A value of 2, for instance, would cause 1 to be display as 1.0
    * and 1234 to be displayed as 1.23e+3.
    */
  var sigFigs: js.UndefOr[Double] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Explicitly set the vertical range of the graph to [low, high]. This may be set on a
    * per-axis basis to define each y-axis separately. If either limit is unspecified, it will
    * be calculated automatically (e.g. [null, 30] to automatically calculate just the lower
    * bound)
    */
  var valueRange: js.UndefOr[(js.Tuple2[Double | Null, Double | Null]) | Null] = js.native
}
object PerAxisOptions {
  
  @scala.inline
  def apply(): PerAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerAxisOptions]
  }
  
  @scala.inline
  implicit class PerAxisOptionsOps[Self <: PerAxisOptions] (val x: Self) extends AnyVal {
    
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
    def setAxisLabelColor(value: String): Self = this.set("axisLabelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLabelColor: Self = this.set("axisLabelColor", js.undefined)
    
    @scala.inline
    def setAxisLabelFontSize(value: Double): Self = this.set("axisLabelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLabelFontSize: Self = this.set("axisLabelFontSize", js.undefined)
    
    @scala.inline
    def setAxisLabelFormatter(
      value: (/* v */ Double | Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph) => _
    ): Self = this.set("axisLabelFormatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAxisLabelFormatter: Self = this.set("axisLabelFormatter", js.undefined)
    
    @scala.inline
    def setAxisLabelWidth(value: Double): Self = this.set("axisLabelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLabelWidth: Self = this.set("axisLabelWidth", js.undefined)
    
    @scala.inline
    def setAxisLineColor(value: String): Self = this.set("axisLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLineColor: Self = this.set("axisLineColor", js.undefined)
    
    @scala.inline
    def setAxisLineWidth(value: Double): Self = this.set("axisLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLineWidth: Self = this.set("axisLineWidth", js.undefined)
    
    @scala.inline
    def setAxisTickSize(value: Double): Self = this.set("axisTickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTickSize: Self = this.set("axisTickSize", js.undefined)
    
    @scala.inline
    def setDrawAxis(value: Boolean): Self = this.set("drawAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawAxis: Self = this.set("drawAxis", js.undefined)
    
    @scala.inline
    def setDrawGrid(value: Boolean): Self = this.set("drawGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawGrid: Self = this.set("drawGrid", js.undefined)
    
    @scala.inline
    def setGridLineColor(value: String): Self = this.set("gridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineColor: Self = this.set("gridLineColor", js.undefined)
    
    @scala.inline
    def setGridLinePatternVarargs(value: Double*): Self = this.set("gridLinePattern", js.Array(value :_*))
    
    @scala.inline
    def setGridLinePattern(value: js.Array[Double]): Self = this.set("gridLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLinePattern: Self = this.set("gridLinePattern", js.undefined)
    
    @scala.inline
    def setGridLineWidth(value: Double): Self = this.set("gridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineWidth: Self = this.set("gridLineWidth", js.undefined)
    
    @scala.inline
    def setIndependentTicks(value: Boolean): Self = this.set("independentTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependentTicks: Self = this.set("independentTicks", js.undefined)
    
    @scala.inline
    def setLabelsKMB(value: Boolean): Self = this.set("labelsKMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelsKMB: Self = this.set("labelsKMB", js.undefined)
    
    @scala.inline
    def setLabelsKMG2(value: Boolean): Self = this.set("labelsKMG2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelsKMG2: Self = this.set("labelsKMG2", js.undefined)
    
    @scala.inline
    def setLogscale(value: Boolean): Self = this.set("logscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogscale: Self = this.set("logscale", js.undefined)
    
    @scala.inline
    def setMaxNumberWidth(value: Double): Self = this.set("maxNumberWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumberWidth: Self = this.set("maxNumberWidth", js.undefined)
    
    @scala.inline
    def setPixelsPerLabel(value: Double): Self = this.set("pixelsPerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelsPerLabel: Self = this.set("pixelsPerLabel", js.undefined)
    
    @scala.inline
    def setSigFigs(value: Double): Self = this.set("sigFigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigFigs: Self = this.set("sigFigs", js.undefined)
    
    @scala.inline
    def setTicker(
      value: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph, /* vals */ js.Array[Double]) => js.Array[Label]
    ): Self = this.set("ticker", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteTicker: Self = this.set("ticker", js.undefined)
    
    @scala.inline
    def setValueFormatter(
      value: (/* v */ Double, /* opts */ js.Function1[/* name */ String, _], /* seriesName */ String, /* dygraph */ Dygraph, /* row */ Double, /* col */ Double) => _
    ): Self = this.set("valueFormatter", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteValueFormatter: Self = this.set("valueFormatter", js.undefined)
    
    @scala.inline
    def setValueRange(value: js.Tuple2[Double | Null, Double | Null]): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
    
    @scala.inline
    def setValueRangeNull: Self = this.set("valueRange", null)
  }
}
