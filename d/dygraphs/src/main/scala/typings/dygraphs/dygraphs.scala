package typings.dygraphs

import org.scalablytyped.runtime.StringDictionary
import typings.dygraphs.anon.Label
import typings.dygraphs.anon.X
import typings.dygraphs.dygraphsStrings.always
import typings.dygraphs.dygraphsStrings.follow
import typings.dygraphs.dygraphsStrings.never
import typings.dygraphs.dygraphsStrings.onmouseover
import typings.dygraphs.dygraphsStrings.y1
import typings.dygraphs.dygraphsStrings.y2
import typings.googleVisualization.google.visualization.DataTable
import typings.std.CanvasRenderingContext2D
import typings.std.Date
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dygraphs {
  
  trait Annotation extends StObject {
    
    /**    If true, attach annotations to the x-axis, rather than to actual points. */
    var attachAtBottom: js.UndefOr[Boolean] = js.undefined
    
    /** This function is called whenever the user clicks on this annotation. */
    var clickHandler: js.UndefOr[
        js.Function4[
          /* annotation */ this.type, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /**    CSS class to use for styling the annotation. */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** this function is called whenever the user double-clicks on this annotation. */
    var dblClickHandler: js.UndefOr[
        js.Function4[
          /* annotation */ this.type, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    var div: js.UndefOr[HTMLDivElement] = js.undefined
    
    /** Height (in pixels) of the annotation flag or icon. */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify in place of shortText to mark the annotation with an image rather than text.
      * If you specify this, you must specify width and height.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /** This function is called whenever the user mouses out of this annotation. */
    var mouseOutHandler: js.UndefOr[
        js.Function4[
          /* annotation */ this.type, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /** This function is called whenever the user mouses over this annotation. */
    var mouseOverHandler: js.UndefOr[
        js.Function4[
          /* annotation */ this.type, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /** The name of the series to which the annotated point belongs. */
    var series: String
    
    /**    Text that will appear on the annotation's flag. */
    var shortText: js.UndefOr[String] = js.undefined
    
    /** A longer description of the annotation which will appear when the user hovers over it. */
    var text: js.UndefOr[String] = js.undefined
    
    /**    Height of the tick mark (in pixels) connecting the point to its flag or icon. */
    var tickHeight: js.UndefOr[Double] = js.undefined
    
    /**    Width (in pixels) of the annotation flag or icon. */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The x value of the point. This should be the same as the value
      * you specified in your CSV file, e.g. "2010-09-13".
      * You must set either x or xval.
      */
    var x: js.UndefOr[Double | String] = js.undefined
    
    /**
      * numeric value of the point, or millis since epoch.
      */
    var xval: js.UndefOr[Double] = js.undefined
  }
  object Annotation {
    
    inline def apply(series: String): Annotation = {
      val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annotation]
    }
    
    extension [Self <: Annotation](x: Self) {
      
      inline def setAttachAtBottom(value: Boolean): Self = StObject.set(x, "attachAtBottom", value.asInstanceOf[js.Any])
      
      inline def setAttachAtBottomUndefined: Self = StObject.set(x, "attachAtBottom", js.undefined)
      
      inline def setClickHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction4(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDblClickHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any): Self = StObject.set(x, "dblClickHandler", js.Any.fromFunction4(value))
      
      inline def setDblClickHandlerUndefined: Self = StObject.set(x, "dblClickHandler", js.undefined)
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMouseOutHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction4(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction4(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
      
      inline def setShortTextUndefined: Self = StObject.set(x, "shortText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTickHeight(value: Double): Self = StObject.set(x, "tickHeight", value.asInstanceOf[js.Any])
      
      inline def setTickHeightUndefined: Self = StObject.set(x, "tickHeight", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXval(value: Double): Self = StObject.set(x, "xval", value.asInstanceOf[js.Any])
      
      inline def setXvalUndefined: Self = StObject.set(x, "xval", js.undefined)
    }
  }
  
  trait Area extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object Area {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): Area = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area]
    }
    
    extension [Self <: Area](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dygraphs.dygraphsStrings.x
    - typings.dygraphs.dygraphsStrings.y
    - typings.dygraphs.dygraphsStrings.y2
  */
  trait Axis extends StObject
  object Axis {
    
    inline def x: typings.dygraphs.dygraphsStrings.x = "x".asInstanceOf[typings.dygraphs.dygraphsStrings.x]
    
    inline def y: typings.dygraphs.dygraphsStrings.y = "y".asInstanceOf[typings.dygraphs.dygraphsStrings.y]
    
    inline def y2: typings.dygraphs.dygraphsStrings.y2 = "y2".asInstanceOf[typings.dygraphs.dygraphsStrings.y2]
  }
  
  type Data = String | DataArray | DataTable
  
  type DataArray = js.Array[js.Array[Double | Date | Null]]
  
  trait LegendData extends StObject {
    
    /**
      * Dygraph object for this graph
      */
    var dygraph: Dygraph
    
    /**
      * Series data for the highlighted points
      */
    var series: js.Array[SeriesLegendData]
    
    /**
      * x value of highlighted points
      */
    var x: Double
    
    /**
      * Generated HTML for x value
      */
    var xHTML: String
  }
  object LegendData {
    
    inline def apply(dygraph: Dygraph, series: js.Array[SeriesLegendData], x: Double, xHTML: String): LegendData = {
      val __obj = js.Dynamic.literal(dygraph = dygraph.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHTML = xHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendData]
    }
    
    extension [Self <: LegendData](x: Self) {
      
      inline def setDygraph(value: Dygraph): Self = StObject.set(x, "dygraph", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: js.Array[SeriesLegendData]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesVarargs(value: SeriesLegendData*): Self = StObject.set(x, "series", js.Array(value :_*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXHTML(value: String): Self = StObject.set(x, "xHTML", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with PerSeriesOptions
       with PerAxisOptions {
    
    /**
      * Set this option to animate the transition between zoom windows. Applies to programmatic
      * and interactive zooms. Note that if you also set a drawCallback, it will be called several
      * times on each zoom. If you set a zoomCallback, it will only be called after the animation
      * is complete.
      */
    var animatedZooms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, this function is called whenever the user clicks on an annotation.
      */
    var annotationClickHandler: js.UndefOr[
        js.Function4[
          /* annotation */ Annotation, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * If provided, this function is called whenever the user double-clicks on an annotation.
      */
    var annotationDblClickHandler: js.UndefOr[
        js.Function4[
          /* annotation */ Annotation, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * If provided, this function is called whenever the user mouses out of an annotation.
      */
    var annotationMouseOutHandler: js.UndefOr[
        js.Function4[
          /* annotation */ Annotation, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * If provided, this function is called whenever the user mouses over an annotation.
      */
    var annotationMouseOverHandler: js.UndefOr[
        js.Function4[
          /* annotation */ Annotation, 
          /* point */ Point, 
          /* dygraph */ Dygraph, 
          /* event */ MouseEvent, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
      * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
      * See also documentation on <a href='http://dygraphs.com/per-axis.html'>per-series and
      * per-axis options</a>.
      */
    var axes: js.UndefOr[X] = js.undefined
    
    /**
      * A function to call when the canvas is clicked.
      */
    var clickCallback: js.UndefOr[
        js.Function3[/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], js.Any]
      ] = js.undefined
    
    /**
      * If <strong>colors</strong> is not specified, saturation of the automatically-generated
      * data series colors. (0.0-1.0).
      */
    var colorSaturation: js.UndefOr[Double] = js.undefined
    
    /**
      * If colors is not specified, value of the data series colors, as in hue/saturation/value.
      * (0.0-1.0, default 0.5)
      */
    var colorValue: js.UndefOr[Double] = js.undefined
    
    /**
      * List of colors for the data series. These can be of the form "#AABBCC" or
      * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
      * color wheel are used. Overridden by the 'color' option.
      */
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
      * a gap and draws it as such. If, instead, the missing values represents an x-value for
      * which only a different series has data, then you'll want to connect the dots by setting
      * this to true. To explicitly include a gap with this option set, use a value of NaN.
      */
    var connectSeparatedPoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
      * point between low and high, with the series itself going through middle.
      */
    var customBars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom DataHandler. This is an advanced customization. See http://bit.ly/151E7Aq.
      */
    var dataHandler: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
      * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
      * values in dateWindow must also be numbers.
      */
    var dateWindow: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
      * not usually necessary, since tab-delimited data is auto-detected.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Unless it's run in scientific mode (see the <code>sigFigs</code> option), dygraphs
      * displays numbers with <code>digitsAfterDecimal</code> digits after the decimal point.
      * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
      * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
      * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
      * displayed in scientific notation.
      */
    var digitsAfterDecimal: js.UndefOr[Double] = js.undefined
    
    /**
      * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
      * series to be interpreted as annotations on points in that series. This is the same format
      * used by Google's AnnotatedTimeLine chart.
      */
    var displayAnnotations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
      * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
      * left graph edge as usual.
      */
    var drawAxesAtZero: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, this callback gets called every time the dygraph is drawn. This includes the
      * initial draw, after zooming and repeatedly while panning.
      */
    var drawCallback: js.UndefOr[js.Function2[/* dygraph */ Dygraph, /* is_initial */ Boolean, js.Any]] = js.undefined
    
    /**
      * Draw points at the edges of gaps in the data. This improves visibility of small data
      * segments or other data irregularities.
      */
    var drawGapEdgePoints: js.UndefOr[Boolean] = js.undefined
    
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
          js.Any
        ]
      ] = js.undefined
    
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
          js.Any
        ]
      ] = js.undefined
    
    /**
      * Does the data contain standard deviations? Setting this to true alters the input format.
      */
    var errorBars: js.UndefOr[Boolean] = js.undefined
    
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
    var fractions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
      * be ignored.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to hide the legend when the mouse leaves the chart area.
      */
    var hideOverlayOnMouseOut: js.UndefOr[Boolean] = js.undefined
    
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
          js.Any
        ]
      ] = js.undefined
    
    /**
      * Fade the background while highlighting series. 1=fully visible background (disable
      * fading), 0=hiddden background (show highlighted series only).
      */
    var highlightSeriesBackgroundAlpha: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
      * Default: rgb(255, 255, 255)
      */
    var highlightSeriesBackgroundColor: js.UndefOr[String] = js.undefined
    
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
    var includeZero: js.UndefOr[Boolean] = js.undefined
    
    var interactionModel: js.UndefOr[js.Any] = js.undefined
    
    /**
      * When this option is passed to updateOptions() along with either the
      * <code>dateWindow</code> or <code>valueRange</code> options, the zoom flags are not changed
      * to reflect a zoomed state. This is primarily useful for when the display area of a chart
      * is changed programmatically and also where manual zooming is allowed and use is made of
      * the <code>isZoomed</code> method to determine this.
      */
    var isZoomedIgnoreProgrammaticZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A name for each data series, including the independent (X) series. For CSV files and
      * DataTable objections, this is determined by context. For raw data, this must be specified.
      * If it is not, default values are supplied and a warning is logged.
      */
    var labels: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Show data labels in an external div, rather than on the graph.    This value can either be a
      * div element or a div id.
      */
    var labelsDiv: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Additional styles to apply to the currently-highlighted points div. For example, {
      * 'fontWeight': 'bold' } will make the labels bold. In general, it is better to use CSS to
      * style the .dygraph-legend class than to use this property.
      */
    var labelsDivStyles: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Width (in pixels) of the div which shows information on the currently-highlighted points.
      */
    var labelsDivWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Put <code>&lt;br/&gt;</code> between lines in the label string. Often used in conjunction
      * with <strong>labelsDiv</strong>.
      */
    var labelsSeparateLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show zero value labels in the labelsDiv.
      */
    var labelsShowZeroValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show date/time labels according to UTC (instead of local time).
      */
    var labelsUTC: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When to display the legend. By default, it only appears when a user mouses over the chart.
      * Set it to "always" to always display a legend of some sort. When set to "follow", legend
      * follows highlighted points. If set to 'never' then it will not appear at all.
      */
    var legend: js.UndefOr[always | follow | onmouseover | never] = js.undefined
    
    /**
      * for details see https://github.com/danvk/dygraphs/pull/683
      */
    var legendFormatter: js.UndefOr[js.Function1[/* legendData */ LegendData, String]] = js.undefined
    
    /**
      * A value representing the farthest a graph may be panned, in percent of the display. For
      * example, a value of 0.1 means that the graph can only be panned 10% pased the edges of the
      * displayed values. null means no bounds.
      */
    var panEdgeFraction: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines per-graph plugins. Useful for per-graph customization
      */
    var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * A function to call when a data point is clicked. and the point that was clicked.
      */
    var pointClickCallback: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ Point, js.Any]] = js.undefined
    
    /**
      * Height, in pixels, of the range selector widget. This option can only be specified at
      * Dygraph creation time.
      */
    var rangeSelectorHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The range selector mini plot fill color. This can be of the form "#AABBCC" or
      * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
      */
    var rangeSelectorPlotFillColor: js.UndefOr[String] = js.undefined
    
    /**
      * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
      * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
      */
    var rangeSelectorPlotStrokeColor: js.UndefOr[String] = js.undefined
    
    /**
      * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
      * highlight the right-most data point.
      */
    var rightGap: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of days over which to average data. Discussed extensively above.
      */
    var rollPeriod: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines per-series options. Its keys match the y-axis label names, and the values are
      * dictionaries themselves that contain options specific to that series. When this option is
      * missing, it falls back on the old-style of per-series options comingled with global
      * options.
      */
    var series: js.UndefOr[StringDictionary[PerSeriesOptions]] = js.undefined
    
    /**
      * Whether to show the legend upon mouseover.
      */
    var showLabelsOnHighlight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show or hide the range selector widget.
      */
    var showRangeSelector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the rolling average period text box should be shown.
      */
    var showRoller: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When errorBars is set, shade this many standard deviations above/below each point.
      */
    var sigma: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, stack series on top of one another rather than drawing them independently. The
      * first series specified in the input data will wind up on top of the chart and the last
      * will be on bottom. NaN values are drawn as white areas without a line on top, see
      * stackedGraphNaNFill for details.
      */
    var stackedGraph: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls handling of NaN values inside a stacked graph. NaN values are
      * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
      * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
      * rightmost value as needed), "inside" (interpolate internally only, use zero outside
      * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
      */
    var stackedGraphNaNFill: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display above the chart. You can supply any HTML for this value, not just text. If
      * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Height of the chart title, in pixels. This also controls the default font size of the
      * title. If you style the title on your own, this controls how much space is set aside above
      * the chart for the title's div.
      */
    var titleHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * When set, this callback gets called before the chart is drawn. It details on how to use
      * this.
      */
    var underlayCallback: js.UndefOr[
        js.Function3[/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph, js.Any]
      ] = js.undefined
    
    /**
      * When set, this callback gets called every time the user stops highlighting any point by
      * mousing out of the graph.
      */
    var unhighlightCallback: js.UndefOr[js.Function1[/* event */ MouseEvent, js.Any]] = js.undefined
    
    /**
      * Which series should initially be visible? Once the Dygraph has been constructed, you can
      * access and modify the visibility of each series using the <code>visibility</code> and
      * <code>setVisibility</code> methods.
      */
    var visibility: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    /**
      * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
      * be ignored.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
      * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
      * more reasonable behavior for ratios close to 0 or 1.
      */
    var wilsonInterval: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
      * axisLabelFontSize and axisTickSize.
      */
    var xAxisHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of the x-axis label, in pixels. This also controls the default font size of the
      * x-axis label. If you style the label on your own, this controls how much space is set
      * aside below the chart for the x-axis label's div.
      */
    var xLabelHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Add the specified amount of extra space (in pixels) around the X-axis value range to
      * ensure points at the edges remain visible.
      */
    var xRangePad: js.UndefOr[Double] = js.undefined
    
    /**
      * A function which parses x-values (i.e. the dependent series). Must return a number, even
      * when the values are dates. In this case, millis since epoch are used. This is used
      * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
      * it will parse. See code for details.
      */
    var xValueParser: js.UndefOr[js.Function1[/* val */ String, Double]] = js.undefined
    
    /**
      * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
      * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
      * classes.
      */
    var xlabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display to the right of the chart's secondary y-axis. This label is only displayed
      * if a secondary y-axis is present. See <a
      * href='http://dygraphs.com/tests/two-axes.html'>this test</a> for an example of how to do
      * this. The comments for the 'ylabel' option generally apply here as well. This label gets a
      * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
      */
    var y2label: js.UndefOr[String] = js.undefined
    
    /**
      * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
      * 90 degrees, this actually affects the height of its div.
      */
    var yLabelWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
      * to ensure points at the edges remain visible. If unset, use the traditional Y padding
      * algorithm.
      */
    var yRangePad: js.UndefOr[Double] = js.undefined
    
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
    var ylabel: js.UndefOr[String] = js.undefined
    
    /**
      * A function to call when the zoom window is changed (either by zooming in or out).
      */
    var zoomCallback: js.UndefOr[
        js.Function3[
          /* minDate */ Double, 
          /* maxDate */ Double, 
          /* yRanges */ js.Array[js.Tuple2[Double, Double]], 
          js.Any
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimatedZooms(value: Boolean): Self = StObject.set(x, "animatedZooms", value.asInstanceOf[js.Any])
      
      inline def setAnimatedZoomsUndefined: Self = StObject.set(x, "animatedZooms", js.undefined)
      
      inline def setAnnotationClickHandler(
        value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any
      ): Self = StObject.set(x, "annotationClickHandler", js.Any.fromFunction4(value))
      
      inline def setAnnotationClickHandlerUndefined: Self = StObject.set(x, "annotationClickHandler", js.undefined)
      
      inline def setAnnotationDblClickHandler(
        value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any
      ): Self = StObject.set(x, "annotationDblClickHandler", js.Any.fromFunction4(value))
      
      inline def setAnnotationDblClickHandlerUndefined: Self = StObject.set(x, "annotationDblClickHandler", js.undefined)
      
      inline def setAnnotationMouseOutHandler(
        value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any
      ): Self = StObject.set(x, "annotationMouseOutHandler", js.Any.fromFunction4(value))
      
      inline def setAnnotationMouseOutHandlerUndefined: Self = StObject.set(x, "annotationMouseOutHandler", js.undefined)
      
      inline def setAnnotationMouseOverHandler(
        value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => js.Any
      ): Self = StObject.set(x, "annotationMouseOverHandler", js.Any.fromFunction4(value))
      
      inline def setAnnotationMouseOverHandlerUndefined: Self = StObject.set(x, "annotationMouseOverHandler", js.undefined)
      
      inline def setAxes(value: X): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setClickCallback(value: (/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point]) => js.Any): Self = StObject.set(x, "clickCallback", js.Any.fromFunction3(value))
      
      inline def setClickCallbackUndefined: Self = StObject.set(x, "clickCallback", js.undefined)
      
      inline def setColorSaturation(value: Double): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
      
      inline def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
      
      inline def setColorValue(value: Double): Self = StObject.set(x, "colorValue", value.asInstanceOf[js.Any])
      
      inline def setColorValueUndefined: Self = StObject.set(x, "colorValue", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setConnectSeparatedPoints(value: Boolean): Self = StObject.set(x, "connectSeparatedPoints", value.asInstanceOf[js.Any])
      
      inline def setConnectSeparatedPointsUndefined: Self = StObject.set(x, "connectSeparatedPoints", js.undefined)
      
      inline def setCustomBars(value: Boolean): Self = StObject.set(x, "customBars", value.asInstanceOf[js.Any])
      
      inline def setCustomBarsUndefined: Self = StObject.set(x, "customBars", js.undefined)
      
      inline def setDataHandler(value: js.Any): Self = StObject.set(x, "dataHandler", value.asInstanceOf[js.Any])
      
      inline def setDataHandlerUndefined: Self = StObject.set(x, "dataHandler", js.undefined)
      
      inline def setDateWindow(value: js.Array[Double]): Self = StObject.set(x, "dateWindow", value.asInstanceOf[js.Any])
      
      inline def setDateWindowUndefined: Self = StObject.set(x, "dateWindow", js.undefined)
      
      inline def setDateWindowVarargs(value: Double*): Self = StObject.set(x, "dateWindow", js.Array(value :_*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDigitsAfterDecimal(value: Double): Self = StObject.set(x, "digitsAfterDecimal", value.asInstanceOf[js.Any])
      
      inline def setDigitsAfterDecimalUndefined: Self = StObject.set(x, "digitsAfterDecimal", js.undefined)
      
      inline def setDisplayAnnotations(value: Boolean): Self = StObject.set(x, "displayAnnotations", value.asInstanceOf[js.Any])
      
      inline def setDisplayAnnotationsUndefined: Self = StObject.set(x, "displayAnnotations", js.undefined)
      
      inline def setDrawAxesAtZero(value: Boolean): Self = StObject.set(x, "drawAxesAtZero", value.asInstanceOf[js.Any])
      
      inline def setDrawAxesAtZeroUndefined: Self = StObject.set(x, "drawAxesAtZero", js.undefined)
      
      inline def setDrawCallback(value: (/* dygraph */ Dygraph, /* is_initial */ Boolean) => js.Any): Self = StObject.set(x, "drawCallback", js.Any.fromFunction2(value))
      
      inline def setDrawCallbackUndefined: Self = StObject.set(x, "drawCallback", js.undefined)
      
      inline def setDrawGapEdgePoints(value: Boolean): Self = StObject.set(x, "drawGapEdgePoints", value.asInstanceOf[js.Any])
      
      inline def setDrawGapEdgePointsUndefined: Self = StObject.set(x, "drawGapEdgePoints", js.undefined)
      
      inline def setDrawHighlightPointCallback(
        value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => js.Any
      ): Self = StObject.set(x, "drawHighlightPointCallback", js.Any.fromFunction7(value))
      
      inline def setDrawHighlightPointCallbackUndefined: Self = StObject.set(x, "drawHighlightPointCallback", js.undefined)
      
      inline def setDrawPointCallback(
        value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => js.Any
      ): Self = StObject.set(x, "drawPointCallback", js.Any.fromFunction7(value))
      
      inline def setDrawPointCallbackUndefined: Self = StObject.set(x, "drawPointCallback", js.undefined)
      
      inline def setErrorBars(value: Boolean): Self = StObject.set(x, "errorBars", value.asInstanceOf[js.Any])
      
      inline def setErrorBarsUndefined: Self = StObject.set(x, "errorBars", js.undefined)
      
      inline def setFile(value: Data): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFileVarargs(value: (js.Array[Double | Date | Null])*): Self = StObject.set(x, "file", js.Array(value :_*))
      
      inline def setFractions(value: Boolean): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
      
      inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideOverlayOnMouseOut(value: Boolean): Self = StObject.set(x, "hideOverlayOnMouseOut", value.asInstanceOf[js.Any])
      
      inline def setHideOverlayOnMouseOutUndefined: Self = StObject.set(x, "hideOverlayOnMouseOut", js.undefined)
      
      inline def setHighlightCallback(
        value: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], /* row */ Double, /* seriesName */ String) => js.Any
      ): Self = StObject.set(x, "highlightCallback", js.Any.fromFunction5(value))
      
      inline def setHighlightCallbackUndefined: Self = StObject.set(x, "highlightCallback", js.undefined)
      
      inline def setHighlightSeriesBackgroundAlpha(value: Double): Self = StObject.set(x, "highlightSeriesBackgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setHighlightSeriesBackgroundAlphaUndefined: Self = StObject.set(x, "highlightSeriesBackgroundAlpha", js.undefined)
      
      inline def setHighlightSeriesBackgroundColor(value: String): Self = StObject.set(x, "highlightSeriesBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightSeriesBackgroundColorUndefined: Self = StObject.set(x, "highlightSeriesBackgroundColor", js.undefined)
      
      inline def setHighlightSeriesOpts(value: PerSeriesOptions): Self = StObject.set(x, "highlightSeriesOpts", value.asInstanceOf[js.Any])
      
      inline def setHighlightSeriesOptsUndefined: Self = StObject.set(x, "highlightSeriesOpts", js.undefined)
      
      inline def setIncludeZero(value: Boolean): Self = StObject.set(x, "includeZero", value.asInstanceOf[js.Any])
      
      inline def setIncludeZeroUndefined: Self = StObject.set(x, "includeZero", js.undefined)
      
      inline def setInteractionModel(value: js.Any): Self = StObject.set(x, "interactionModel", value.asInstanceOf[js.Any])
      
      inline def setInteractionModelUndefined: Self = StObject.set(x, "interactionModel", js.undefined)
      
      inline def setIsZoomedIgnoreProgrammaticZoom(value: Boolean): Self = StObject.set(x, "isZoomedIgnoreProgrammaticZoom", value.asInstanceOf[js.Any])
      
      inline def setIsZoomedIgnoreProgrammaticZoomUndefined: Self = StObject.set(x, "isZoomedIgnoreProgrammaticZoom", js.undefined)
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsDiv(value: String | HTMLElement): Self = StObject.set(x, "labelsDiv", value.asInstanceOf[js.Any])
      
      inline def setLabelsDivStyles(value: StringDictionary[String]): Self = StObject.set(x, "labelsDivStyles", value.asInstanceOf[js.Any])
      
      inline def setLabelsDivStylesUndefined: Self = StObject.set(x, "labelsDivStyles", js.undefined)
      
      inline def setLabelsDivUndefined: Self = StObject.set(x, "labelsDiv", js.undefined)
      
      inline def setLabelsDivWidth(value: Double): Self = StObject.set(x, "labelsDivWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelsDivWidthUndefined: Self = StObject.set(x, "labelsDivWidth", js.undefined)
      
      inline def setLabelsSeparateLines(value: Boolean): Self = StObject.set(x, "labelsSeparateLines", value.asInstanceOf[js.Any])
      
      inline def setLabelsSeparateLinesUndefined: Self = StObject.set(x, "labelsSeparateLines", js.undefined)
      
      inline def setLabelsShowZeroValues(value: Boolean): Self = StObject.set(x, "labelsShowZeroValues", value.asInstanceOf[js.Any])
      
      inline def setLabelsShowZeroValuesUndefined: Self = StObject.set(x, "labelsShowZeroValues", js.undefined)
      
      inline def setLabelsUTC(value: Boolean): Self = StObject.set(x, "labelsUTC", value.asInstanceOf[js.Any])
      
      inline def setLabelsUTCUndefined: Self = StObject.set(x, "labelsUTC", js.undefined)
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      inline def setLegend(value: always | follow | onmouseover | never): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendFormatter(value: /* legendData */ LegendData => String): Self = StObject.set(x, "legendFormatter", js.Any.fromFunction1(value))
      
      inline def setLegendFormatterUndefined: Self = StObject.set(x, "legendFormatter", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setPanEdgeFraction(value: Double): Self = StObject.set(x, "panEdgeFraction", value.asInstanceOf[js.Any])
      
      inline def setPanEdgeFractionUndefined: Self = StObject.set(x, "panEdgeFraction", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setPointClickCallback(value: (/* e */ MouseEvent, /* point */ Point) => js.Any): Self = StObject.set(x, "pointClickCallback", js.Any.fromFunction2(value))
      
      inline def setPointClickCallbackUndefined: Self = StObject.set(x, "pointClickCallback", js.undefined)
      
      inline def setRangeSelectorHeight(value: Double): Self = StObject.set(x, "rangeSelectorHeight", value.asInstanceOf[js.Any])
      
      inline def setRangeSelectorHeightUndefined: Self = StObject.set(x, "rangeSelectorHeight", js.undefined)
      
      inline def setRangeSelectorPlotFillColor(value: String): Self = StObject.set(x, "rangeSelectorPlotFillColor", value.asInstanceOf[js.Any])
      
      inline def setRangeSelectorPlotFillColorUndefined: Self = StObject.set(x, "rangeSelectorPlotFillColor", js.undefined)
      
      inline def setRangeSelectorPlotStrokeColor(value: String): Self = StObject.set(x, "rangeSelectorPlotStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setRangeSelectorPlotStrokeColorUndefined: Self = StObject.set(x, "rangeSelectorPlotStrokeColor", js.undefined)
      
      inline def setRightGap(value: Double): Self = StObject.set(x, "rightGap", value.asInstanceOf[js.Any])
      
      inline def setRightGapUndefined: Self = StObject.set(x, "rightGap", js.undefined)
      
      inline def setRollPeriod(value: Double): Self = StObject.set(x, "rollPeriod", value.asInstanceOf[js.Any])
      
      inline def setRollPeriodUndefined: Self = StObject.set(x, "rollPeriod", js.undefined)
      
      inline def setSeries(value: StringDictionary[PerSeriesOptions]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowLabelsOnHighlight(value: Boolean): Self = StObject.set(x, "showLabelsOnHighlight", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsOnHighlightUndefined: Self = StObject.set(x, "showLabelsOnHighlight", js.undefined)
      
      inline def setShowRangeSelector(value: Boolean): Self = StObject.set(x, "showRangeSelector", value.asInstanceOf[js.Any])
      
      inline def setShowRangeSelectorUndefined: Self = StObject.set(x, "showRangeSelector", js.undefined)
      
      inline def setShowRoller(value: Boolean): Self = StObject.set(x, "showRoller", value.asInstanceOf[js.Any])
      
      inline def setShowRollerUndefined: Self = StObject.set(x, "showRoller", js.undefined)
      
      inline def setSigma(value: Double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
      
      inline def setSigmaUndefined: Self = StObject.set(x, "sigma", js.undefined)
      
      inline def setStackedGraph(value: Boolean): Self = StObject.set(x, "stackedGraph", value.asInstanceOf[js.Any])
      
      inline def setStackedGraphNaNFill(value: String): Self = StObject.set(x, "stackedGraphNaNFill", value.asInstanceOf[js.Any])
      
      inline def setStackedGraphNaNFillUndefined: Self = StObject.set(x, "stackedGraphNaNFill", js.undefined)
      
      inline def setStackedGraphUndefined: Self = StObject.set(x, "stackedGraph", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleHeight(value: Double): Self = StObject.set(x, "titleHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleHeightUndefined: Self = StObject.set(x, "titleHeight", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnderlayCallback(value: (/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph) => js.Any): Self = StObject.set(x, "underlayCallback", js.Any.fromFunction3(value))
      
      inline def setUnderlayCallbackUndefined: Self = StObject.set(x, "underlayCallback", js.undefined)
      
      inline def setUnhighlightCallback(value: /* event */ MouseEvent => js.Any): Self = StObject.set(x, "unhighlightCallback", js.Any.fromFunction1(value))
      
      inline def setUnhighlightCallbackUndefined: Self = StObject.set(x, "unhighlightCallback", js.undefined)
      
      inline def setVisibility(value: js.Array[Boolean]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibilityVarargs(value: Boolean*): Self = StObject.set(x, "visibility", js.Array(value :_*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWilsonInterval(value: Boolean): Self = StObject.set(x, "wilsonInterval", value.asInstanceOf[js.Any])
      
      inline def setWilsonIntervalUndefined: Self = StObject.set(x, "wilsonInterval", js.undefined)
      
      inline def setXAxisHeight(value: Double): Self = StObject.set(x, "xAxisHeight", value.asInstanceOf[js.Any])
      
      inline def setXAxisHeightUndefined: Self = StObject.set(x, "xAxisHeight", js.undefined)
      
      inline def setXLabelHeight(value: Double): Self = StObject.set(x, "xLabelHeight", value.asInstanceOf[js.Any])
      
      inline def setXLabelHeightUndefined: Self = StObject.set(x, "xLabelHeight", js.undefined)
      
      inline def setXRangePad(value: Double): Self = StObject.set(x, "xRangePad", value.asInstanceOf[js.Any])
      
      inline def setXRangePadUndefined: Self = StObject.set(x, "xRangePad", js.undefined)
      
      inline def setXValueParser(value: /* val */ String => Double): Self = StObject.set(x, "xValueParser", js.Any.fromFunction1(value))
      
      inline def setXValueParserUndefined: Self = StObject.set(x, "xValueParser", js.undefined)
      
      inline def setXlabel(value: String): Self = StObject.set(x, "xlabel", value.asInstanceOf[js.Any])
      
      inline def setXlabelUndefined: Self = StObject.set(x, "xlabel", js.undefined)
      
      inline def setY2label(value: String): Self = StObject.set(x, "y2label", value.asInstanceOf[js.Any])
      
      inline def setY2labelUndefined: Self = StObject.set(x, "y2label", js.undefined)
      
      inline def setYLabelWidth(value: Double): Self = StObject.set(x, "yLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setYLabelWidthUndefined: Self = StObject.set(x, "yLabelWidth", js.undefined)
      
      inline def setYRangePad(value: Double): Self = StObject.set(x, "yRangePad", value.asInstanceOf[js.Any])
      
      inline def setYRangePadUndefined: Self = StObject.set(x, "yRangePad", js.undefined)
      
      inline def setYlabel(value: String): Self = StObject.set(x, "ylabel", value.asInstanceOf[js.Any])
      
      inline def setYlabelUndefined: Self = StObject.set(x, "ylabel", js.undefined)
      
      inline def setZoomCallback(
        value: (/* minDate */ Double, /* maxDate */ Double, /* yRanges */ js.Array[js.Tuple2[Double, Double]]) => js.Any
      ): Self = StObject.set(x, "zoomCallback", js.Any.fromFunction3(value))
      
      inline def setZoomCallbackUndefined: Self = StObject.set(x, "zoomCallback", js.undefined)
    }
  }
  
  trait PerAxisOptions extends StObject {
    
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
          /* opts */ js.Function1[/* name */ String, js.Any], 
          /* dygraph */ Dygraph, 
          js.Any
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
          /* opts */ js.Function1[/* name */ String, js.Any], 
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
          /* opts */ js.Function1[/* name */ String, js.Any], 
          /* seriesName */ String, 
          /* dygraph */ Dygraph, 
          /* row */ Double, 
          /* col */ Double, 
          js.Any
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
    
    inline def apply(): PerAxisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerAxisOptions]
    }
    
    extension [Self <: PerAxisOptions](x: Self) {
      
      inline def setAxisLabelColor(value: String): Self = StObject.set(x, "axisLabelColor", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelColorUndefined: Self = StObject.set(x, "axisLabelColor", js.undefined)
      
      inline def setAxisLabelFontSize(value: Double): Self = StObject.set(x, "axisLabelFontSize", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelFontSizeUndefined: Self = StObject.set(x, "axisLabelFontSize", js.undefined)
      
      inline def setAxisLabelFormatter(
        value: (/* v */ Double | Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* dygraph */ Dygraph) => js.Any
      ): Self = StObject.set(x, "axisLabelFormatter", js.Any.fromFunction4(value))
      
      inline def setAxisLabelFormatterUndefined: Self = StObject.set(x, "axisLabelFormatter", js.undefined)
      
      inline def setAxisLabelWidth(value: Double): Self = StObject.set(x, "axisLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelWidthUndefined: Self = StObject.set(x, "axisLabelWidth", js.undefined)
      
      inline def setAxisLineColor(value: String): Self = StObject.set(x, "axisLineColor", value.asInstanceOf[js.Any])
      
      inline def setAxisLineColorUndefined: Self = StObject.set(x, "axisLineColor", js.undefined)
      
      inline def setAxisLineWidth(value: Double): Self = StObject.set(x, "axisLineWidth", value.asInstanceOf[js.Any])
      
      inline def setAxisLineWidthUndefined: Self = StObject.set(x, "axisLineWidth", js.undefined)
      
      inline def setAxisTickSize(value: Double): Self = StObject.set(x, "axisTickSize", value.asInstanceOf[js.Any])
      
      inline def setAxisTickSizeUndefined: Self = StObject.set(x, "axisTickSize", js.undefined)
      
      inline def setDrawAxis(value: Boolean): Self = StObject.set(x, "drawAxis", value.asInstanceOf[js.Any])
      
      inline def setDrawAxisUndefined: Self = StObject.set(x, "drawAxis", js.undefined)
      
      inline def setDrawGrid(value: Boolean): Self = StObject.set(x, "drawGrid", value.asInstanceOf[js.Any])
      
      inline def setDrawGridUndefined: Self = StObject.set(x, "drawGrid", js.undefined)
      
      inline def setGridLineColor(value: String): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
      
      inline def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
      
      inline def setGridLinePattern(value: js.Array[Double]): Self = StObject.set(x, "gridLinePattern", value.asInstanceOf[js.Any])
      
      inline def setGridLinePatternUndefined: Self = StObject.set(x, "gridLinePattern", js.undefined)
      
      inline def setGridLinePatternVarargs(value: Double*): Self = StObject.set(x, "gridLinePattern", js.Array(value :_*))
      
      inline def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
      
      inline def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
      
      inline def setIndependentTicks(value: Boolean): Self = StObject.set(x, "independentTicks", value.asInstanceOf[js.Any])
      
      inline def setIndependentTicksUndefined: Self = StObject.set(x, "independentTicks", js.undefined)
      
      inline def setLabelsKMB(value: Boolean): Self = StObject.set(x, "labelsKMB", value.asInstanceOf[js.Any])
      
      inline def setLabelsKMBUndefined: Self = StObject.set(x, "labelsKMB", js.undefined)
      
      inline def setLabelsKMG2(value: Boolean): Self = StObject.set(x, "labelsKMG2", value.asInstanceOf[js.Any])
      
      inline def setLabelsKMG2Undefined: Self = StObject.set(x, "labelsKMG2", js.undefined)
      
      inline def setLogscale(value: Boolean): Self = StObject.set(x, "logscale", value.asInstanceOf[js.Any])
      
      inline def setLogscaleUndefined: Self = StObject.set(x, "logscale", js.undefined)
      
      inline def setMaxNumberWidth(value: Double): Self = StObject.set(x, "maxNumberWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxNumberWidthUndefined: Self = StObject.set(x, "maxNumberWidth", js.undefined)
      
      inline def setPixelsPerLabel(value: Double): Self = StObject.set(x, "pixelsPerLabel", value.asInstanceOf[js.Any])
      
      inline def setPixelsPerLabelUndefined: Self = StObject.set(x, "pixelsPerLabel", js.undefined)
      
      inline def setSigFigs(value: Double): Self = StObject.set(x, "sigFigs", value.asInstanceOf[js.Any])
      
      inline def setSigFigsUndefined: Self = StObject.set(x, "sigFigs", js.undefined)
      
      inline def setTicker(
        value: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* dygraph */ Dygraph, /* vals */ js.Array[Double]) => js.Array[Label]
      ): Self = StObject.set(x, "ticker", js.Any.fromFunction6(value))
      
      inline def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
      
      inline def setValueFormatter(
        value: (/* v */ Double, /* opts */ js.Function1[/* name */ String, js.Any], /* seriesName */ String, /* dygraph */ Dygraph, /* row */ Double, /* col */ Double) => js.Any
      ): Self = StObject.set(x, "valueFormatter", js.Any.fromFunction6(value))
      
      inline def setValueFormatterUndefined: Self = StObject.set(x, "valueFormatter", js.undefined)
      
      inline def setValueRange(value: js.Tuple2[Double | Null, Double | Null]): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
      
      inline def setValueRangeNull: Self = StObject.set(x, "valueRange", null)
      
      inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    }
  }
  
  trait PerSeriesOptions extends StObject {
    
    /**
      * Set to either 'y1' or 'y2' to assign a series to a y-axis (primary or secondary). Must be
      * set per-series.
      */
    var axis: js.UndefOr[y1 | y2] = js.undefined
    
    /**
      * A per-series color definition. Used in conjunction with, and overrides, the colors option.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Draw a small dot at each point, in addition to a line going through the point. This makes
      * the individual data points easier to see, but can increase visual clutter in the chart.
      * The small dot can be replaced with a custom rendering by supplying a <a
      * href='#drawPointCallback'>drawPointCallback</a>.
      */
    var drawPoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Error bars (or custom bars) for each series are drawn in the same color as the series, but
      * with partial transparency. This sets the transparency. A value of 0.0 means that the error
      * bars will not be drawn, whereas a value of 1.0 means that the error bars will be as dark
      * as the line for the series itself. This can be used to produce chart lines whose thickness
      * varies at each point.
      */
    var fillAlpha: js.UndefOr[Double] = js.undefined
    
    /**
      * Should the area underneath the graph be filled? This option is not compatible with error
      * bars. This may be set on a <a href='per-axis.html'>per-series</a> basis.
      */
    var fillGraph: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size in pixels of the dot drawn over highlighted points.
      */
    var highlightCircleSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A function which plot data for this series on the chart.         
      */
    var plotter: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The size of the dot to draw on each point in pixels (see drawPoints). A dot is always
      * drawn when a point is "isolated", i.e. there is a missing point on either side of it. This
      * also controls the size of those dots.
      */
    var pointSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Mark this series for inclusion in the range selector. The mini plot curve will be an
      * average of all such series. If this is not specified for any series, the default behavior
      * is to average all the series. Setting it for one series will result in that series being
      * charted alone in the range selector.
      */
    var showInRangeSelector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, display the graph as a step plot instead of a line plot. This option may either
      * be set for the whole graph or for single series.
      */
    var stepPlot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color for the line border used if strokeBorderWidth is set.
      */
    var strokeBorderColor: js.UndefOr[String] = js.undefined
    
    /**
      * Draw a border around graph lines to make crossing lines more easily distinguishable.
      * Useful for graphs with many lines.
      */
    var strokeBorderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * A custom pattern array where the even index is a draw and odd is a space in pixels. If
      * null then it draws a solid line. The array should have a even length as any odd lengthed
      * array could be expressed as a smaller even length array. This is used to create dashed
      * lines.
      */
    var strokePattern: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The width of the lines connecting data points. This can be used to increase the contrast
      * or some graphs.
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object PerSeriesOptions {
    
    inline def apply(): PerSeriesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerSeriesOptions]
    }
    
    extension [Self <: PerSeriesOptions](x: Self) {
      
      inline def setAxis(value: y1 | y2): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDrawPoints(value: Boolean): Self = StObject.set(x, "drawPoints", value.asInstanceOf[js.Any])
      
      inline def setDrawPointsUndefined: Self = StObject.set(x, "drawPoints", js.undefined)
      
      inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      inline def setFillAlphaUndefined: Self = StObject.set(x, "fillAlpha", js.undefined)
      
      inline def setFillGraph(value: Boolean): Self = StObject.set(x, "fillGraph", value.asInstanceOf[js.Any])
      
      inline def setFillGraphUndefined: Self = StObject.set(x, "fillGraph", js.undefined)
      
      inline def setHighlightCircleSize(value: Double): Self = StObject.set(x, "highlightCircleSize", value.asInstanceOf[js.Any])
      
      inline def setHighlightCircleSizeUndefined: Self = StObject.set(x, "highlightCircleSize", js.undefined)
      
      inline def setPlotter(value: js.Any): Self = StObject.set(x, "plotter", value.asInstanceOf[js.Any])
      
      inline def setPlotterUndefined: Self = StObject.set(x, "plotter", js.undefined)
      
      inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setShowInRangeSelector(value: Boolean): Self = StObject.set(x, "showInRangeSelector", value.asInstanceOf[js.Any])
      
      inline def setShowInRangeSelectorUndefined: Self = StObject.set(x, "showInRangeSelector", js.undefined)
      
      inline def setStepPlot(value: Boolean): Self = StObject.set(x, "stepPlot", value.asInstanceOf[js.Any])
      
      inline def setStepPlotUndefined: Self = StObject.set(x, "stepPlot", js.undefined)
      
      inline def setStrokeBorderColor(value: String): Self = StObject.set(x, "strokeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeBorderColorUndefined: Self = StObject.set(x, "strokeBorderColor", js.undefined)
      
      inline def setStrokeBorderWidth(value: Double): Self = StObject.set(x, "strokeBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeBorderWidthUndefined: Self = StObject.set(x, "strokeBorderWidth", js.undefined)
      
      inline def setStrokePattern(value: js.Array[Double]): Self = StObject.set(x, "strokePattern", value.asInstanceOf[js.Any])
      
      inline def setStrokePatternUndefined: Self = StObject.set(x, "strokePattern", js.undefined)
      
      inline def setStrokePatternVarargs(value: Double*): Self = StObject.set(x, "strokePattern", js.Array(value :_*))
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  /**
    * Point structure.
    *
    * xval_* and yval_* are the original unscaled data values,
    * while x_* and y_* are scaled to the range (0.0-1.0) for plotting.
    * yval_stacked is the cumulative Y value used for stacking graphs,
    * and bottom/top/minus/plus are used for error bar graphs.
    */
  trait Point extends StObject {
    
    var annotation: js.UndefOr[Annotation] = js.undefined
    
    var idx: Double
    
    var name: String
    
    var x: js.UndefOr[Double] = js.undefined
    
    var xval: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var y_bottom: js.UndefOr[Double] = js.undefined
    
    var y_stacked: js.UndefOr[Double] = js.undefined
    
    var y_top: js.UndefOr[Double] = js.undefined
    
    var yval: js.UndefOr[Double] = js.undefined
    
    var yval_minus: js.UndefOr[Double] = js.undefined
    
    var yval_plus: js.UndefOr[Double] = js.undefined
    
    var yval_stacked: js.UndefOr[Double] = js.undefined
  }
  object Point {
    
    inline def apply(idx: Double, name: String): Point = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setAnnotation(value: Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXval(value: Double): Self = StObject.set(x, "xval", value.asInstanceOf[js.Any])
      
      inline def setXvalUndefined: Self = StObject.set(x, "xval", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setY_bottom(value: Double): Self = StObject.set(x, "y_bottom", value.asInstanceOf[js.Any])
      
      inline def setY_bottomUndefined: Self = StObject.set(x, "y_bottom", js.undefined)
      
      inline def setY_stacked(value: Double): Self = StObject.set(x, "y_stacked", value.asInstanceOf[js.Any])
      
      inline def setY_stackedUndefined: Self = StObject.set(x, "y_stacked", js.undefined)
      
      inline def setY_top(value: Double): Self = StObject.set(x, "y_top", value.asInstanceOf[js.Any])
      
      inline def setY_topUndefined: Self = StObject.set(x, "y_top", js.undefined)
      
      inline def setYval(value: Double): Self = StObject.set(x, "yval", value.asInstanceOf[js.Any])
      
      inline def setYvalUndefined: Self = StObject.set(x, "yval", js.undefined)
      
      inline def setYval_minus(value: Double): Self = StObject.set(x, "yval_minus", value.asInstanceOf[js.Any])
      
      inline def setYval_minusUndefined: Self = StObject.set(x, "yval_minus", js.undefined)
      
      inline def setYval_plus(value: Double): Self = StObject.set(x, "yval_plus", value.asInstanceOf[js.Any])
      
      inline def setYval_plusUndefined: Self = StObject.set(x, "yval_plus", js.undefined)
      
      inline def setYval_stacked(value: Double): Self = StObject.set(x, "yval_stacked", value.asInstanceOf[js.Any])
      
      inline def setYval_stackedUndefined: Self = StObject.set(x, "yval_stacked", js.undefined)
    }
  }
  
  trait SeriesLegendData extends StObject {
    
    /**
      * Assigned or generated series color
      */
    var color: String
    
    /**
      * Series line dash
      */
    var dashHTML: String
    
    /**
      * Whether currently focused or not
      */
    var isHighlighted: Boolean
    
    /**
      * Whether the series line is inside the selected/zoomed region
      */
    var isVisible: Boolean
    
    /**
      * Assigned label to this series
      */
    var label: String
    
    /**
      * Generated label html for this series
      */
    var labelHTML: String
    
    /**
      * y value of this series
      */
    var y: Double
    
    /**
      * Generated html for y value
      */
    var yHTML: String
  }
  object SeriesLegendData {
    
    inline def apply(
      color: String,
      dashHTML: String,
      isHighlighted: Boolean,
      isVisible: Boolean,
      label: String,
      labelHTML: String,
      y: Double,
      yHTML: String
    ): SeriesLegendData = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dashHTML = dashHTML.asInstanceOf[js.Any], isHighlighted = isHighlighted.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelHTML = labelHTML.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yHTML = yHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesLegendData]
    }
    
    extension [Self <: SeriesLegendData](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDashHTML(value: String): Self = StObject.set(x, "dashHTML", value.asInstanceOf[js.Any])
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelHTML(value: String): Self = StObject.set(x, "labelHTML", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYHTML(value: String): Self = StObject.set(x, "yHTML", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesProperties extends StObject {
    
    var axis: Double
    
    var color: String
    
    var column: Double
    
    var name: String
    
    var visible: Boolean
  }
  object SeriesProperties {
    
    inline def apply(axis: Double, color: String, column: Double, name: String, visible: Boolean): SeriesProperties = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesProperties]
    }
    
    extension [Self <: SeriesProperties](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
