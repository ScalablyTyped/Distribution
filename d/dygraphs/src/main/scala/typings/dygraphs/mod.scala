package typings.dygraphs

import typings.dygraphs.anon.ErrorPlotter
import typings.dygraphs.anon.Idx
import typings.dygraphs.anon.Label
import typings.dygraphs.anon.PartialRecordAxisPerAxisO
import typings.dygraphs.anon.ReadonlyAnnotation
import typings.dygraphs.anon.ReadonlyArea
import typings.dygraphs.anon.ReadonlyDygraph
import typings.dygraphs.anon.ReadonlyDygraphAdjustRoll
import typings.dygraphs.anon.ReadonlyPoint
import typings.dygraphs.dygraphsBooleans.`false`
import typings.dygraphs.dygraphsStrings._empty
import typings.dygraphs.dygraphsStrings.all
import typings.dygraphs.dygraphsStrings.always
import typings.dygraphs.dygraphsStrings.follow
import typings.dygraphs.dygraphsStrings.inside
import typings.dygraphs.dygraphsStrings.never
import typings.dygraphs.dygraphsStrings.none
import typings.dygraphs.dygraphsStrings.onmouseover
import typings.dygraphs.dygraphsStrings.x
import typings.dygraphs.dygraphsStrings.y
import typings.dygraphs.dygraphsStrings.y1
import typings.dygraphs.dygraphsStrings.y2
import typings.dygraphs.mod.dygraphs.Annotation
import typings.dygraphs.mod.dygraphs.Area
import typings.dygraphs.mod.dygraphs.Data
import typings.dygraphs.mod.dygraphs.Options
import typings.dygraphs.mod.dygraphs.SeriesProperties
import typings.googleVisualization.google.visualization.DataTable
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dygraphs", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Dygraph {
    def this(container: String, data: js.Function0[Data]) = this()
    def this(container: String, data: Data) = this()
    def this(container: HTMLElement, data: js.Function0[Data]) = this()
    /**
      * Creates an interactive, zoomable chart.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#constructor}
      */
    def this(container: HTMLElement, data: Data) = this()
    def this(container: String, data: js.Function0[Data], options: Options) = this()
    def this(container: String, data: Data, options: Options) = this()
    def this(container: HTMLElement, data: js.Function0[Data], options: Options) = this()
    def this(container: HTMLElement, data: Data, options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("dygraphs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dygraphs", "default.ANNUAL")
    @js.native
    def ANNUAL: Double = js.native
    inline def ANNUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.BIANNUAL")
    @js.native
    def BIANNUAL: Double = js.native
    inline def BIANNUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIANNUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.CENTENNIAL")
    @js.native
    def CENTENNIAL: Double = js.native
    inline def CENTENNIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTENNIAL")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.DAILY")
    @js.native
    def DAILY: Double = js.native
    inline def DAILY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAILY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.DASHED_LINE")
    @js.native
    def DASHED_LINE: js.Array[Double] = js.native
    inline def DASHED_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DASHED_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.DECADAL")
    @js.native
    def DECADAL: Double = js.native
    inline def DECADAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECADAL")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.DOTTED_LINE")
    @js.native
    def DOTTED_LINE: js.Array[Double] = js.native
    inline def DOTTED_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOTTED_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.DOT_DASH_LINE")
    @js.native
    def DOT_DASH_LINE: js.Array[Double] = js.native
    inline def DOT_DASH_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOT_DASH_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.FIVE_MINUTELY")
    @js.native
    def FIVE_MINUTELY: Double = js.native
    inline def FIVE_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIVE_MINUTELY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.FIVE_SECONDLY")
    @js.native
    def FIVE_SECONDLY: Double = js.native
    inline def FIVE_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIVE_SECONDLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.HOURLY")
    @js.native
    def HOURLY: Double = js.native
    inline def HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOURLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.MINUTELY")
    @js.native
    def MINUTELY: Double = js.native
    inline def MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTELY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.MONTHLY")
    @js.native
    def MONTHLY: Double = js.native
    inline def MONTHLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTHLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.NUM_GRANULARITIES")
    @js.native
    def NUM_GRANULARITIES: Double = js.native
    inline def NUM_GRANULARITIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_GRANULARITIES")(x.asInstanceOf[js.Any])
    
    /**
      * Standard plotters.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#.Plotters}
      */
    @JSImport("dygraphs", "default.Plotters")
    @js.native
    def Plotters: ErrorPlotter = js.native
    inline def Plotters_=(x: ErrorPlotter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Plotters")(x.asInstanceOf[js.Any])
    
    /**
      * Point structure.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#.PointType}
      */
    @JSImport("dygraphs", "default.PointType")
    @js.native
    def PointType: Idx = js.native
    inline def PointType_=(x: Idx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointType")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.QUARTERLY")
    @js.native
    def QUARTERLY: Double = js.native
    inline def QUARTERLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUARTERLY")(x.asInstanceOf[js.Any])
    
    // Tick granularities (passed to ticker).
    @JSImport("dygraphs", "default.SECONDLY")
    @js.native
    def SECONDLY: Double = js.native
    inline def SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.SIX_HOURLY")
    @js.native
    def SIX_HOURLY: Double = js.native
    inline def SIX_HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIX_HOURLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TEN_MINUTELY")
    @js.native
    def TEN_MINUTELY: Double = js.native
    inline def TEN_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEN_MINUTELY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TEN_SECONDLY")
    @js.native
    def TEN_SECONDLY: Double = js.native
    inline def TEN_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEN_SECONDLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.THIRTY_MINUTELY")
    @js.native
    def THIRTY_MINUTELY: Double = js.native
    inline def THIRTY_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THIRTY_MINUTELY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.THIRTY_SECONDLY")
    @js.native
    def THIRTY_SECONDLY: Double = js.native
    inline def THIRTY_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THIRTY_SECONDLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TWO_DAILY")
    @js.native
    def TWO_DAILY: Double = js.native
    inline def TWO_DAILY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_DAILY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TWO_HOURLY")
    @js.native
    def TWO_HOURLY: Double = js.native
    inline def TWO_HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_HOURLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TWO_MINUTELY")
    @js.native
    def TWO_MINUTELY: Double = js.native
    inline def TWO_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_MINUTELY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.TWO_SECONDLY")
    @js.native
    def TWO_SECONDLY: Double = js.native
    inline def TWO_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_SECONDLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.WEEKLY")
    @js.native
    def WEEKLY: Double = js.native
    inline def WEEKLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEKLY")(x.asInstanceOf[js.Any])
    
    @JSImport("dygraphs", "default.defaultInteractionModel")
    @js.native
    def defaultInteractionModel: Any = js.native
    inline def defaultInteractionModel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInteractionModel")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Dygraph extends StObject {
    
    /**
      * Adjusts the number of points in the rolling average. Updates the graph to
      * reflect the new averaging period.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#adjustRoll}
      *
      * @param length Number of points over which to average the data.
      */
    def adjustRoll(length: Double): Unit = js.native
    
    /**
      * Return the list of annotations.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#annotations}
      */
    def annotations(): js.Array[Annotation] = js.native
    
    /**
      * Clears the current selection (i.e. points that were highlighted by moving
      * the mouse over the chart).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#clearSelection}
      */
    def clearSelection(): Unit = js.native
    
    /**
      * Detach DOM elements in the dygraph and null out all data references.
      * Calling this when you're done with a dygraph can dramatically reduce memory
      * usage. See, e.g., the tests/perf.html example.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#destroy}
      */
    def destroy(): Unit = js.native
    
    /**
      * Convert a mouse event to DOM coordinates relative to the graph origin.
      *
      * Returns a two-element array: [X, Y].
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#eventToDomCoords}
      */
    def eventToDomCoords(event: MouseEvent): js.Tuple2[Double, Double] = js.native
    
    /**
      * Get the current graph's area object.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getArea}
      */
    def getArea(): Area = js.native
    
    /**
      * Return the list of colors. This is either the list of colors passed in the
      * attributes or the autogenerated list of rgb(r,g,b) strings.
      * This does not return colors for invisible series.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getColors}
      */
    def getColors(): js.Array[String] = js.native
    
    /**
      * Returns the name of the currently-highlighted series.
      * Only available when the highlightSeriesOpts option is in use.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getHighlightSeries}
      */
    def getHighlightSeries(): String = js.native
    
    /**
      * Get the list of label names for this graph. The first column is the
      * x-axis, so the data series names start at index 1.
      *
      * Returns null when labels have not yet been defined.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getLabels}
      */
    def getLabels(): js.Array[String] | Null = js.native
    
    /**
      * Returns the current value for an option, as set in the constructor or via
      * updateOptions. You may pass in an (optional) series name to get per-series
      * values for the option.
      *
      * All values returned by this method should be considered immutable. If you
      * modify them, there is no guarantee that the changes will be honored or that
      * dygraphs will remain in a consistent state. If you want to modify an option,
      * use updateOptions() instead.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getOption}
      *
      * @param name The name of the option (e.g. 'strokeWidth')
      * @param opt_seriesName Series name to get per-series values.
      * @return The value of the option.
      */
    def getOption(name: String): Any = js.native
    def getOption(name: String, seriesName: String): Any = js.native
    
    /**
      * Returns a few attributes of a series, i.e. its color, its visibility, which
      * axis it's assigned to, and its column in the original data.
      * Returns null if the series does not exist.
      * Otherwise, returns an object with column, visibility, color and axis properties.
      * The "axis" property will be set to 1 for y1 and 2 for y2.
      * The "column" property can be fed back into getValue(row, column) to get
      * values for this series.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getPropertiesForSeries}
      */
    def getPropertiesForSeries(seriesName: String): SeriesProperties | Null = js.native
    
    /**
      * Find the row number corresponding to the given x-value.
      * Returns null if there is no such x-value in the data.
      * If there are multiple rows with the same x-value, this will return the
      * first one.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getRowForX}
      *
      * @param xVal The x-value to look for (e.g. millis since epoch).
      * @return The row number, which you can pass to getValue(), or null.
      */
    def getRowForX(xVal: Double): Double | Null = js.native
    
    /**
      * Returns the number of the currently selected row. To get data for this row,
      * you can use the getValue method.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getSelection}
      *
      * @return row number, or -1 if nothing is selected
      */
    def getSelection(): Double = js.native
    
    /**
      * Returns the value in the given row and column. If the row and column exceed
      * the bounds on the data, returns null. Also returns null if the value is missing.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#getValue}
      *
      * @param row The row number of the data (0-based). Row 0 is the first row of data,
      * not a header row.
      * @param col The column number of the data (0-based)
      * @return The value in the specified cell or null if the row/col were out of range.
      */
    def getValue(row: Double, col: Double): Double | Null = js.native
    
    /**
      * Get the index of a series (column) given its name. The first column is the
      * x-axis, so the data series start with index 1.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#indexFromSetName}
      */
    def indexFromSetName(name: String): Double = js.native
    
    /**
      * Returns true if the currently-highlighted series was locked
      * via setSelection(..., seriesName, true).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#isSeriesLocked}
      */
    def isSeriesLocked(): Boolean = js.native
    
    /**
      * Returns the zoomed status of the chart for one or both axes.
      *
      * Axis is an optional parameter. Can be set to 'x' or 'y'.
      * The zoomed status for an axis is set whenever a user zooms using the mouse
      * or when the dateWindow or valueRange are updated. Double-clicking or calling resetZoom()
      * resets the zoom status for the chart.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#isZoomed}
      */
    def isZoomed(): Boolean = js.native
    def isZoomed(axis: x | y): Boolean = js.native
    
    /**
      * Returns the number of y-axes on the chart.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#numAxes}
      */
    def numAxes(): Double = js.native
    
    /**
      * Returns the number of columns (including the independent variable).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#numColumns}
      */
    def numColumns(): Double = js.native
    
    /**
      * Returns the number of rows (excluding any header/label row).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#numRows}
      */
    def numRows(): Double = js.native
    
    /**
      * Trigger a callback when the dygraph has drawn itself and is ready to be
      * manipulated. This is primarily useful when dygraphs has to do an XHR for the
      * data (i.e. a URL is passed as the data source) and the chart is drawn
      * asynchronously. If the chart has already drawn, the callback will fire
      * immediately.
      *
      * This is a good place to call setAnnotation().
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#ready}
      */
    def ready(callback: js.Function1[/* g */ this.type, Any]): Unit = js.native
    
    /**
      * Reset the zoom to the original view coordinates. This is the same as
      * double-clicking on the graph.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#resetZoom}
      */
    def resetZoom(): Unit = js.native
    
    def resize(): Unit = js.native
    /**
      * Resizes the dygraph. If no parameters are specified, resizes to fill the
      * containing div (which has presumably changed size since the dygraph was
      * instantiated. If the width/height are specified, the div will be resized.
      *
      * This is far more efficient than destroying and re-instantiating a
      * Dygraph, since it doesn't have to reparse the underlying data.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#resize}
      *
      * @param width Width (in pixels)
      * @param height Height (in pixels)
      */
    def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Returns the current rolling period, as set by the user or an option.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#rollPeriod}
      */
    def rollPeriod(): Double = js.native
    
    /**
      * Update the list of annotations and redraw the chart.
      * See dygraphs.com/annotations.html for more info on how to use annotations.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#setAnnotations}
      *
      * @param ann An array of annotation objects.
      * @param suppressDraw Set to "true" to block chart redraw (optional).
      */
    def setAnnotations(ann: js.Array[Annotation]): Unit = js.native
    def setAnnotations(ann: js.Array[Annotation], suppressDraw: Boolean): Unit = js.native
    
    /**
      * Manually set the selected points and display information about them in the
      * legend. The selection can be cleared using clearSelection() and queried
      * using getSelection(). To set a selected series but not a selected point,
      * call setSelection with row=false and the selected series name.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#setSelection}
      *
      * @param row Row number that should be highlighted (i.e. appear with
      * hover dots on the chart).
      * @param optional series name to highlight that series with the
      * the highlightSeriesOpts setting.
      * @param optional If true, keep seriesName selected when mousing
      * over the graph, disabling closest-series highlighting. Call clearSelection()
      * to unlock it.
      */
    def setSelection(row: Double): Unit = js.native
    def setSelection(row: Double, seriesName: String): Unit = js.native
    def setSelection(row: Double, seriesName: String, locked: Boolean): Unit = js.native
    def setSelection(row: Double, seriesName: Unit, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: String, locked: Boolean): Unit = js.native
    @JSName("setSelection")
    def setSelection_false(row: `false`, seriesName: Unit, locked: Boolean): Unit = js.native
    
    def setVisibility(num: js.Array[Double], value: Boolean): Unit = js.native
    def setVisibility(num: js.Object, value: Boolean): Unit = js.native
    /**
      * Changes the visibility of one or more series.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#setVisibility}
      *
      * @param num the series index or an array of series indices or a boolean array of visibility
      * states by index or an object mapping series numbers, as keys, to visibility state (boolean
      * values)
      * @param value the visibility state expressed as a boolean
      */
    def setVisibility(num: Double, value: Boolean): Unit = js.native
    
    /**
      * Convert from canvas/div coords to data coordinates.
      * If specified, do this conversion for the coordinate system of a particular
      * axis. Uses the first axis by default.
      * Returns a two-element array: [X, Y].
      *
      * Note: use toDataXCoord instead of toDataCoords(x, null) and use toDataYCoord
      * instead of toDataCoords(null, y, axis).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDataCoords}
      */
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDataCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    /**
      * Convert from canvas/div x coordinate to data coordinate.
      *
      * If x is null, this returns null.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDataXCoord}
      */
    def toDataXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    /**
      * Convert from canvas/div y coord to value.
      *
      * If y is null, this returns null.
      * if axis is null, this uses the first axis.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDataYCoord}
      */
    def toDataYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDataYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    /**
      * Convert from data coordinates to canvas/div X/Y coordinates.
      * If specified, do this conversion for the coordinate system of a particular
      * axis. Uses the first axis by default.
      * Returns a two-element array: [X, Y]
      *
      * Note: use toDomXCoord instead of toDomCoords(x, null) and use toDomYCoord
      * instead of toDomCoords(null, y, axis).
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDomCoords}
      */
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    def toDomCoords[X /* <: Double | Null */, Y /* <: Double | Null */](x: X, y: Y, axis: Double): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: X extends number ? number : null */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: Y extends number ? number : null */ js.Any
      ] = js.native
    
    /**
      * Convert from data x coordinates to canvas/div X coordinate.
      * If specified, do this conversion for the coordinate system of a particular
      * axis.
      * Returns a single value or null if x is null.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDomXCoord}
      */
    def toDomXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    /**
      * Convert from data x coordinates to canvas/div Y coordinate and optional
      * axis. Uses the first axis by default.
      *
      * Returns a single value or null if y is null.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toDomYCoord}
      */
    def toDomYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    def toDomYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? number : null */ js.Any = js.native
    
    /**
      * Converts an x value to a percentage from the left to the right of
      * the drawing area.
      *
      * If the coordinate represents a value visible on the canvas, then
      * the value will be between 0 and 1, where 0 is the left of the canvas.
      * However, this method will return values outside the range, as
      * values can fall outside the canvas.
      *
      * If x is null, this returns null.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toPercentXCoord}
      *
      * @param x The data x-coordinate.
      * @return A fraction in [0, 1] where 0 = the left edge.
      */
    def toPercentXCoord[T /* <: Double | Null */](x: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    /**
      * Converts a y for an axis to a percentage from the top to the
      * bottom of the drawing area.
      *
      * If the coordinate represents a value visible on the canvas, then
      * the value will be between 0 and 1, where 0 is the top of the canvas.
      * However, this method will return values outside the range, as
      * values can fall outside the canvas.
      *
      * If y is null, this returns null.
      * If axis is null, this uses the first axis.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#toPercentYCoord}
      *
      * @param y The data y-coordinate.
      * @param [axis] The axis number on which the data coordinate lives.
      * @return A fraction in [0, 1] where 0 = the top edge.
      */
    def toPercentYCoord[T /* <: Double | Null */](y: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    def toPercentYCoord[T /* <: Double | Null */](y: T, axis: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends null ? null : number */ js.Any = js.native
    
    /**
      * Changes various properties of the graph. These can include:
      *   - file: changes the source data for the graph
      *   - errorBars: changes whether the data contains stddev
      *
      * There's a huge variety of options that can be passed to this method. For a
      * full list, see http://dygraphs.com/options.html.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#updateOptions}
      *
      *
      * @param input_attrs The new properties and values
      * @param block_redraw Usually the chart is redrawn after every
      *         call to updateOptions(). If you know better, you can pass true to
      *         explicitly block the redraw. This can be useful for chaining
      *         updateOptions() calls, avoiding the occasional infinite loop and
      *         preventing redraws when it's not necessary (e.g. when updating a
      *         callback).
      */
    def updateOptions(inputAttrs: Options): Unit = js.native
    def updateOptions(inputAttrs: Options, blockRedraw: Boolean): Unit = js.native
    
    /**
      * Returns a boolean array of visibility statuses.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#visibility}
      */
    def visibility(): js.Array[Boolean] = js.native
    
    /**
      * Returns the lower- and upper-bound x-axis values of the data set.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#xAxisExtremes}
      */
    def xAxisExtremes(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns the currently-visible x-range. This can be affected by zooming,
      * panning or a call to updateOptions.
      * Returns a two-element array: [left, right].
      * If the Dygraph has dates on the x-axis, these will be millis since epoch.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#xAxisRange}
      */
    def xAxisRange(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns the lower- and upper-bound y-axis values for each axis. These are the ranges you'll get
      * if you double-click to zoom out or call resetZoom(). The return value is an array of [low,
      * high] tuples, one for each y-axis.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#yAxisExtremes}
      */
    def yAxisExtremes(): js.Array[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Returns the currently-visible y-range for an axis. This can be affected by
      * zooming, panning or a call to updateOptions. Axis indices are zero-based. If
      * called with no arguments, returns the range of the first axis.
      * Returns a two-element array: [bottom, top].
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#yAxisRange}
      */
    def yAxisRange(): js.Tuple2[Double, Double] = js.native
    def yAxisRange(idx: Double): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns the currently-visible y-ranges for each axis. This can be affected by
      * zooming, panning, calls to updateOptions, etc.
      * Returns an array of [bottom, top] pairs, one for each y-axis.
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#yAxisRanges}
      */
    def yAxisRanges(): js.Array[js.Tuple2[Double, Double]] = js.native
  }
  
  object dygraphs {
    
    trait Annotation extends StObject {
      
      /** If true, attach annotations to the x-axis, rather than to actual points. */
      var attachAtBottom: js.UndefOr[Boolean] = js.undefined
      
      /** This function is called whenever the user clicks on this annotation. */
      var clickHandler: js.UndefOr[AnnotationClickHandler] = js.undefined
      
      /** CSS class to use for styling the annotation. */
      var cssClass: js.UndefOr[String] = js.undefined
      
      /** this function is called whenever the user double-clicks on this annotation. */
      var dblClickHandler: js.UndefOr[AnnotationDblClickHandler] = js.undefined
      
      var div: js.UndefOr[HTMLDivElement] = js.undefined
      
      /** Height (in pixels) of the annotation flag or icon. */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify in place of shortText to mark the annotation with an image rather than text.
        * If you specify this, you must specify width and height.
        */
      var icon: js.UndefOr[String] = js.undefined
      
      /** This function is called whenever the user mouses out of this annotation. */
      var mouseOutHandler: js.UndefOr[AnnotationMouseOutHandler] = js.undefined
      
      /** This function is called whenever the user mouses over this annotation. */
      var mouseOverHandler: js.UndefOr[AnnotationMouseOverHandler] = js.undefined
      
      /** The name of the series to which the annotated point belongs. */
      var series: String
      
      /** Text that will appear on the annotation's flag. */
      var shortText: js.UndefOr[String] = js.undefined
      
      /** A longer description of the annotation which will appear when the user hovers over it. */
      var text: js.UndefOr[String] = js.undefined
      
      /** Color of the tick mark connecting the point to its flag or icon. */
      var tickColor: js.UndefOr[String] = js.undefined
      
      /** Height of the tick mark (in pixels) connecting the point to its flag or icon. */
      var tickHeight: js.UndefOr[Double] = js.undefined
      
      /** Width of the tick mark connecting the point to its flag or icon. */
      var tickWidth: js.UndefOr[Double] = js.undefined
      
      /** Width (in pixels) of the annotation flag or icon. */
      var width: js.UndefOr[Double] = js.undefined
      
      /**
        * The x value of the point. This should be the same as the value
        * you specified in your CSV file, e.g. "2010-09-13".
        * You must set either x or xval.
        */
      var x: js.UndefOr[Double | String] = js.undefined
    }
    object Annotation {
      
      inline def apply(series: String): Annotation = {
        val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
        __obj.asInstanceOf[Annotation]
      }
      
      extension [Self <: Annotation](x: Self) {
        
        inline def setAttachAtBottom(value: Boolean): Self = StObject.set(x, "attachAtBottom", value.asInstanceOf[js.Any])
        
        inline def setAttachAtBottomUndefined: Self = StObject.set(x, "attachAtBottom", js.undefined)
        
        inline def setClickHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "clickHandler", js.Any.fromFunction4(value))
        
        inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
        
        inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
        
        inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
        
        inline def setDblClickHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "dblClickHandler", js.Any.fromFunction4(value))
        
        inline def setDblClickHandlerUndefined: Self = StObject.set(x, "dblClickHandler", js.undefined)
        
        inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setMouseOutHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction4(value))
        
        inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
        
        inline def setMouseOverHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction4(value))
        
        inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
        
        inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
        
        inline def setShortTextUndefined: Self = StObject.set(x, "shortText", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTickColor(value: String): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
        
        inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
        
        inline def setTickHeight(value: Double): Self = StObject.set(x, "tickHeight", value.asInstanceOf[js.Any])
        
        inline def setTickHeightUndefined: Self = StObject.set(x, "tickHeight", js.undefined)
        
        inline def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
        
        inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      }
    }
    
    type AnnotationClickHandler = js.Function4[
        /* annotation */ ReadonlyAnnotation, 
        /* point */ ReadonlyPoint, 
        /* dygraph */ ReadonlyDygraph, 
        /* event */ MouseEvent, 
        Any
      ]
    
    type AnnotationDblClickHandler = AnnotationClickHandler
    
    type AnnotationMouseOutHandler = AnnotationClickHandler
    
    type AnnotationMouseOverHandler = AnnotationClickHandler
    
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
    
    type DataArray = js.Array[js.Array[Double | js.Array[Double] | js.Date | Null]]
    
    trait DataHandler extends StObject {
      
      /**
        * The extract series method is responsible for extracting a single series data from the
        * general data array. It must return the series in the unified data format. It may or may not
        * add extras for later usage.
        */
      def extractSeries(dygraph: ReadonlyDygraph, rawData: Any, seriesIndex: Any): Any
      
      /**
        * This method computes the extremes of the supplied rolledData. It may be pruned compared to
        * the data returned by the DataHandler.rollingAverage method, but generally contains the data
        * returned from it. The given dateWindow must be considered for the computation of the
        * extreme values. Extras may be used if needed.
        */
      def getExtremeYValues(dygraph: ReadonlyDygraph, unifiedData: Any, dateWindow: Any): Any
      
      /**
        * Because of performance reasons, the onPointCreated callback was replaced by this method.
        * The only difference is that this method is only called once per series, and not for every
        * point of the series. This saves us several method calls as well as several option reads
        * that are done in the onPointCreated.
        */
      def onLineEvaluated(dygraph: ReadonlyDygraph, seriesPoints: Any, dataset: Any, setName: Any): Any
      
      /**
        * Based on the provided x and y values, seriesPoints for each sample of a series are created.
        * This additional callback is called for every seriesPoint created. The original
        * unifiedDataSample is also given so that additional extras may be extracted and added to the
        * seriesPoint. (e.g. the DataHandlers for bars add y_top and y_bottom here which is needed to
        * draw the error bars.)
        */
      def onPointCreated(dygraph: ReadonlyDygraph, seriesPoint: Any, unifiedDataSample: Any): Any
      
      /**
        * The rolling average method is called if the rollPeriod is larger than
        * 1. It is supplied with the series data generated by extractSeries and the rollPeriod. It
        *    must return an array that is again compliant with the unified data format. Extras may be
        *    used if needed.
        */
      def rollingAverage(dygraph: ReadonlyDygraph, unifiedData: Any, rollPeriod: Any): Any
    }
    object DataHandler {
      
      inline def apply(
        extractSeries: (ReadonlyDygraph, Any, Any) => Any,
        getExtremeYValues: (ReadonlyDygraph, Any, Any) => Any,
        onLineEvaluated: (ReadonlyDygraph, Any, Any, Any) => Any,
        onPointCreated: (ReadonlyDygraph, Any, Any) => Any,
        rollingAverage: (ReadonlyDygraph, Any, Any) => Any
      ): DataHandler = {
        val __obj = js.Dynamic.literal(extractSeries = js.Any.fromFunction3(extractSeries), getExtremeYValues = js.Any.fromFunction3(getExtremeYValues), onLineEvaluated = js.Any.fromFunction4(onLineEvaluated), onPointCreated = js.Any.fromFunction3(onPointCreated), rollingAverage = js.Any.fromFunction3(rollingAverage))
        __obj.asInstanceOf[DataHandler]
      }
      
      extension [Self <: DataHandler](x: Self) {
        
        inline def setExtractSeries(value: (ReadonlyDygraph, Any, Any) => Any): Self = StObject.set(x, "extractSeries", js.Any.fromFunction3(value))
        
        inline def setGetExtremeYValues(value: (ReadonlyDygraph, Any, Any) => Any): Self = StObject.set(x, "getExtremeYValues", js.Any.fromFunction3(value))
        
        inline def setOnLineEvaluated(value: (ReadonlyDygraph, Any, Any, Any) => Any): Self = StObject.set(x, "onLineEvaluated", js.Any.fromFunction4(value))
        
        inline def setOnPointCreated(value: (ReadonlyDygraph, Any, Any) => Any): Self = StObject.set(x, "onPointCreated", js.Any.fromFunction3(value))
        
        inline def setRollingAverage(value: (ReadonlyDygraph, Any, Any) => Any): Self = StObject.set(x, "rollingAverage", js.Any.fromFunction3(value))
      }
    }
    
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
        
        inline def setSeriesVarargs(value: SeriesLegendData*): Self = StObject.set(x, "series", js.Array(value*))
        
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
        * @default false
        */
      var animatedZooms: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * If provided, this function is called whenever the user clicks on an annotation.
        * @default null
        */
      var annotationClickHandler: js.UndefOr[AnnotationClickHandler | Null] = js.undefined
      
      /**
        * If provided, this function is called whenever the user double-clicks on an annotation.
        * @default null
        */
      var annotationDblClickHandler: js.UndefOr[AnnotationDblClickHandler | Null] = js.undefined
      
      /**
        * If provided, this function is called whenever the user mouses out of an annotation.
        * @default null
        */
      var annotationMouseOutHandler: js.UndefOr[AnnotationMouseOutHandler | Null] = js.undefined
      
      /**
        * If provided, this function is called whenever the user mouses over an annotation.
        * @default null
        */
      var annotationMouseOverHandler: js.UndefOr[AnnotationMouseOverHandler | Null] = js.undefined
      
      /**
        * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
        * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
        * See also documentation on per-series and per-axis options.
        * @default null
        */
      var axes: js.UndefOr[PartialRecordAxisPerAxisO | Null] = js.undefined
      
      /**
        * A function to call when the canvas is clicked.
        * @default null
        */
      var clickCallback: js.UndefOr[
            (js.Function3[/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], Unit]) | Null
          ] = js.undefined
      
      /**
        * If colors is not specified, saturation of the automatically-generated
        * data series colors. (0.0-1.0)
        * @default 1.0
        */
      var colorSaturation: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * If colors is not specified, value of the data series colors, as in hue/saturation/value.
        * (0.0-1.0, default 0.5)
        * @default 1.0
        */
      var colorValue: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * List of colors for the data series. These can be of the form "#AABBCC" or
        * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
        * color wheel are used. Overridden by the 'color' option.
        * @default (see description)
        */
      var colors: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
        * a gap and draws it as such. If, instead, the missing values represents an x-value for
        * which only a different series has data, then you'll want to connect the dots by setting
        * this to true. To explicitly include a gap with this option set, use a value of NaN.
        * @default false
        */
      var connectSeparatedPoints: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
        * point between low and high, with the series itself going through middle.
        * @default false
        */
      var customBars: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Custom DataHandler. This is an advanced customization.
        * @see http://bit.ly/151E7Aq.
        * @default (depends on data)
        */
      var dataHandler: js.UndefOr[DataHandler | Null] = js.undefined
      
      /**
        * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
        * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
        * values in dateWindow must also be numbers.
        * @default Full range of the input is shown
        */
      var dateWindow: js.UndefOr[(js.Tuple2[Double, Double]) | Null] = js.undefined
      
      /**
        * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
        * not usually necessary, since tab-delimited data is auto-detected.
        * @default ,
        */
      var delimiter: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Unless it's run in scientific mode (see the sigFigs option), dygraphs
        * displays numbers with digitsAfterDecimal digits after the decimal point.
        * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
        * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
        * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
        * displayed in scientific notation.
        * @default 2
        */
      var digitsAfterDecimal: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
        * series to be interpreted as annotations on points in that series. This is the same format
        * used by Google's AnnotatedTimeLine chart.
        * @default false
        */
      var displayAnnotations: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
        * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
        * left graph edge as usual.
        * @default false
        */
      var drawAxesAtZero: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set, this callback gets called every time the dygraph is drawn. This includes the
        * initial draw, after zooming and repeatedly while panning.
        * @default null
        */
      var drawCallback: js.UndefOr[
            (js.Function2[/* dygraph */ ReadonlyDygraphAdjustRoll, /* is_initial */ Boolean, Unit]) | Null
          ] = js.undefined
      
      /**
        * Draw points at the edges of gaps in the data. This improves visibility of small data
        * segments or other data irregularities.
        * @default false
        */
      var drawGapEdgePoints: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Draw a custom item when a point is highlighted. Default is a small dot matching the
        * series color. This method should constrain drawing to within pointSize pixels from (cx,
        * cy) Also see drawPointCallback
        * @default null
        */
      var drawHighlightPointCallback: js.UndefOr[
            (js.ThisFunction7[
              /* this */ ReadonlyDygraphAdjustRoll, 
              /* dygraph */ ReadonlyDygraphAdjustRoll, 
              /* seriesName */ String, 
              /* canvasContext */ CanvasRenderingContext2D, 
              /* cx */ Double, 
              /* cy */ Double, 
              /* color */ String, 
              /* pointSize */ Double, 
              Unit
            ]) | Null
          ] = js.undefined
      
      /**
        * Draw a custom item when drawPoints is enabled. Default is a small dot matching the series
        * color. This method should constrain drawing to within pointSize pixels from (cx, cy).
        * Also see drawHighlightPointCallback
        * @default null
        */
      var drawPointCallback: js.UndefOr[
            (js.ThisFunction7[
              /* this */ ReadonlyDygraphAdjustRoll, 
              /* dygraph */ ReadonlyDygraphAdjustRoll, 
              /* seriesName */ String, 
              /* canvasContext */ CanvasRenderingContext2D, 
              /* cx */ Double, 
              /* cy */ Double, 
              /* color */ String, 
              /* pointSize */ Double, 
              Unit
            ]) | Null
          ] = js.undefined
      
      /**
        * Does the data contain standard deviations? Setting this to true alters the input format.
        * @default false
        */
      var errorBars: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Sets the data being displayed in the chart. This can only be set when calling
        * updateOptions; it cannot be set from the constructor. For a full description of valid data
        * formats, see the Data Formats page.
        * @default (set when constructed)
        */
      var file: js.UndefOr[Data | Null] = js.undefined
      
      /**
        * When set, attempt to parse each cell in the CSV file as "a/b", where a and b are integers.
        * The ratio will be plotted. This allows computation of Wilson confidence intervals (see
        * below).
        * @default false
        */
      var fractions: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
        * be ignored.
        * @default 320
        */
      var height: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Whether to hide the legend when the mouse leaves the chart area.
        * @default true
        */
      var hideOverlayOnMouseOut: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set, this callback gets called every time a new point is highlighted.
        * @default null
        */
      var highlightCallback: js.UndefOr[
            (js.Function5[
              /* event */ MouseEvent, 
              /* xval */ Double, 
              /* points */ js.Array[Point], 
              /* row */ Double, 
              /* seriesName */ String, 
              Unit
            ]) | Null
          ] = js.undefined
      
      /**
        * Fade the background while highlighting series. 1=fully visible background (disable
        * fading), 0=hiddden background (show highlighted series only).
        * @default 0.5
        */
      var highlightSeriesBackgroundAlpha: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
        * @default rgb(255, 255, 255)
        */
      var highlightSeriesBackgroundColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * When set, the options from this object are applied to the timeseries closest to the mouse
        * pointer for interactive highlighting. See also 'highlightCallback'. Example:
        * highlightSeriesOpts: { strokeWidth: 3 }.
        * @default null
        */
      var highlightSeriesOpts: js.UndefOr[PerSeriesOptions | Null] = js.undefined
      
      /**
        * Usually, dygraphs will use the range of the data plus some padding to set the range of the
        * y-axis. If this option is set, the y-axis will always include zero, typically as the
        * lowest value. This can be used to avoid exaggerating the variance in the data
        * @default false
        */
      var includeZero: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * TODO(@konigsberg): document this
        * @default ...
        */
      var interactionModel: js.UndefOr[js.Object | Null] = js.undefined
      
      /**
        * A name for each data series, including the independent (X) series. For CSV files and
        * DataTable objections, this is determined by context. For raw data, this must be specified.
        * If it is not, default values are supplied and a warning is logged.
        * @default ["X", "Y1", "Y2", ...]*
        */
      var labels: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Show data labels in an external div, rather than on the graph. This value can either be a
        * div element or a div id.
        * @default null
        */
      var labelsDiv: js.UndefOr[HTMLElement | String | Null] = js.undefined
      
      /**
        * Put <br/> between lines in the label string. Often used in conjunction
        * with labelsDiv.
        * @default false
        */
      var labelsSeparateLines: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Show zero value labels in the labelsDiv.
        * @default true
        */
      var labelsShowZeroValues: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Show date/time labels according to UTC (instead of local time).
        * @default false
        */
      var labelsUTC: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When to display the legend. By default, it only appears when a user mouses over the chart.
        * Set it to "always" to always display a legend of some sort. When set to "follow", legend
        * follows highlighted points. If set to 'never' then it will not appear at all.
        * @default onmouseover
        */
      var legend: js.UndefOr[always | follow | onmouseover | never | Null] = js.undefined
      
      /**
        * Set this to supply a custom formatter for the legend. See this comment and the
        * legendFormatter demo for usage.
        * @default null
        */
      var legendFormatter: js.UndefOr[(js.Function1[/* data */ LegendData, String]) | Null] = js.undefined
      
      /**
        * A value representing the farthest a graph may be panned, in percent of the display. For
        * example, a value of 0.1 means that the graph can only be panned 10% passed the edges of the
        * displayed values. null means no bounds.
        * @default null
        */
      var panEdgeFraction: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Overrides the pixel ratio scaling factor for the canvas's 2d context. Ordinarily, this is
        * set to the devicePixelRatio / (context.backingStoreRatio || 1), so on mobile devices, where
        * the devicePixelRatio can be somewhere around 3, performance can be improved by overriding
        * this value to something less precise, like 1, at the expense of resolution.
        * @default (devicePixelRatio / context.backingStoreRatio)
        */
      var pixelRatio: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Defines per-graph plugins. Useful for per-graph customization
        * @default []
        */
      var plugins: js.UndefOr[js.Array[Any] | Null] = js.undefined
      
      /**
        * A function to call when a data point is clicked. and the point that was clicked.
        * @default null
        */
      var pointClickCallback: js.UndefOr[(js.Function2[/* event */ MouseEvent, /* point */ ReadonlyPoint, Unit]) | Null] = js.undefined
      
      /**
        * The transparency of the veil that is drawn over the unselected portions of the range
        * selector mini plot. A value of 0 represents full transparency and the unselected portions
        * of the mini plot will appear as normal. A value of 1 represents full opacity and the
        * unselected portions of the mini plot will be hidden.
        * @default 0.6
        */
      var rangeSelectorAlpha: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The width of the lines below and on both sides of the range selector mini plot.
        * @default 1
        */
      var rangeSelectorBackgroundLineWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The color of the lines below and on both sides of the range selector mini plot. This can be
        * of the form "#AABBCC" or "rgb(255,100,200)" or "yellow".
        * @default gray
        */
      var rangeSelectorBackgroundStrokeColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The width the lines in the interactive layer of the range selector.
        * @default 1
        */
      var rangeSelectorForegroundLineWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The color of the lines in the interactive layer of the range selector. This can be of the
        * form "#AABBCC" or "rgb(255,100,200)" or "yellow".
        * @default black
        */
      var rangeSelectorForegroundStrokeColor: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Height, in pixels, of the range selector widget. This option can only be specified at
        * Dygraph creation time.
        * @default 40
        */
      var rangeSelectorHeight: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The range selector mini plot fill color. This can be of the form "#AABBCC" or
        * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
        * @default #A7B1C4
        */
      var rangeSelectorPlotFillColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The top color for the range selector mini plot fill color gradient. This can be of the form
        * "#AABBCC" or "rgb(255,100,200)" or "rgba(255,100,200,42)" or "yellow". You can also specify
        * null or "" to disable the gradient and fill with one single color.
        * @default white
        */
      var rangeSelectorPlotFillGradientColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The width of the range selector mini plot line.
        * @default 1.5
        */
      var rangeSelectorPlotLineWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
        * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
        * @default #808FAB
        */
      var rangeSelectorPlotStrokeColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
        * highlight the right-most data point.
        * @default 5
        */
      var rightGap: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Number of days over which to average data. Discussed extensively above.
        * @default 1
        */
      var rollPeriod: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Defines per-series options. Its keys match the y-axis label names, and the values are
        * dictionaries themselves that contain options specific to that series.
        * @default null
        */
      var series: js.UndefOr[(Record[String, PerSeriesOptions]) | Null] = js.undefined
      
      /**
        * Whether to show the legend upon mouseover.
        * @default true
        */
      var showLabelsOnHighlight: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Show or hide the range selector widget.
        * @default false
        */
      var showRangeSelector: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * If the rolling average period text box should be shown.
        * @default false
        */
      var showRoller: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When errorBars is set, shade this many standard deviations above/below each point.
        * @default 2.0
        */
      var sigma: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * If set, stack series on top of one another rather than drawing them independently. The
        * first series specified in the input data will wind up on top of the chart and the last
        * will be on bottom. NaN values are drawn as white areas without a line on top, see
        * stackedGraphNaNFill for details.
        * @default false
        */
      var stackedGraph: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Controls handling of NaN values inside a stacked graph. NaN values are
        * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
        * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
        * rightmost value as needed), "inside" (interpolate internally only, use zero outside
        * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
        * @default all
        */
      var stackedGraphNaNFill: js.UndefOr[all | inside | none | Null] = js.undefined
      
      /**
        * Set this option to log timing information. The value of the option will be logged along
        * with the timimg, so that you can distinguish multiple dygraphs on the same page.
        * @deprecated
        * @default null
        */
      var timingName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Text to display above the chart. You can supply any HTML for this value, not just text. If
        * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
        * @default null
        */
      var title: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Height of the chart title, in pixels. This also controls the default font size of the
        * title. If you style the title on your own, this controls how much space is set aside above
        * the chart for the title's div.
        * @default 18
        */
      var titleHeight: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * When set, this callback gets called before the chart is drawn. It details on how to use
        * this.
        * @default null
        */
      var underlayCallback: js.UndefOr[
            (js.Function3[
              /* context */ CanvasRenderingContext2D, 
              /* area */ ReadonlyArea, 
              /* dygraph */ ReadonlyDygraphAdjustRoll, 
              Unit
            ]) | Null
          ] = js.undefined
      
      /**
        * When set, this callback gets called every time the user stops highlighting any point by
        * mousing out of the graph.
        * @default null
        */
      var unhighlightCallback: js.UndefOr[(js.Function1[/* event */ MouseEvent, Unit]) | Null] = js.undefined
      
      /**
        * Which series should initially be visible? Once the Dygraph has been constructed, you can
        * access and modify the visibility of each series using the visibility and setVisibility
        * methods.
        * @default [true, true, ...]
        */
      var visibility: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
      
      /**
        * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
        * be ignored.
        * @default 480
        */
      var width: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
        * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
        * more reasonable behavior for ratios close to 0 or 1.
        * @default true
        */
      var wilsonInterval: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
        * axisLabelFontSize and axisTickSize.
        * @default null
        */
      var xAxisHeight: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Height of the x-axis label, in pixels. This also controls the default font size of the
        * x-axis label. If you style the label on your own, this controls how much space is set
        * aside below the chart for the x-axis label's div.
        * @default 18
        */
      var xLabelHeight: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Add the specified amount of extra space (in pixels) around the X-axis value range to
        * ensure points at the edges remain visible.
        * @default 0
        */
      var xRangePad: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * A function which parses x-values (i.e. the dependent series). Must return a number, even
        * when the values are dates. In this case, millis since epoch are used. This is used
        * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
        * it will parse. See code for details.
        * @default parseFloat() or Date.parse()*
        */
      var xValueParser: js.UndefOr[(js.Function1[/* str */ String, Double]) | Null] = js.undefined
      
      /**
        * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
        * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
        * classes.
        * @default null
        */
      var xlabel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Text to display to the right of the chart's secondary y-axis. This label is only displayed
        * if a secondary y-axis is present. See this test for an example of how to do this. The
        * comments for the 'ylabel' option generally apply here as well. This label gets a
        * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
        * @default null
        */
      var y2label: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
        * 90 degrees, this actually affects the height of its div.
        * @default 18
        */
      var yLabelWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
        * to ensure points at the edges remain visible. If unset, use the traditional Y padding
        * algorithm.
        * @default null
        */
      var yRangePad: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Text to display to the left of the chart's y-axis. You can supply any HTML for this value,
        * not just text. If you wish to style it using CSS, use the 'dygraph-label' or
        * 'dygraph-ylabel' classes. The text will be rotated 90 degrees by default, so CSS rules may
        * behave in unintuitive ways. No additional space is set aside for a y-axis label. If you
        * need more space, increase the width of the y-axis tick labels using the yAxisLabelWidth
        * option. If you need a wider div for the y-axis label, either style it that way with CSS
        * (but remember that it's rotated, so width is controlled by the 'height' property) or set
        * the yLabelWidth option.
        * @default null
        */
      var ylabel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * A function to call when the zoom window is changed (either by zooming in or out). When
        * animatedZooms is set, zoomCallback is called once at the end of the transition (it will not
        * be called for intermediate frames).
        * @default null
        */
      var zoomCallback: js.UndefOr[
            (js.Function3[
              /* minDate */ Double, 
              /* maxDate */ Double, 
              /* yRanges */ js.Array[js.Tuple2[Double, Double]], 
              Unit
            ]) | Null
          ] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAnimatedZooms(value: Boolean): Self = StObject.set(x, "animatedZooms", value.asInstanceOf[js.Any])
        
        inline def setAnimatedZoomsNull: Self = StObject.set(x, "animatedZooms", null)
        
        inline def setAnimatedZoomsUndefined: Self = StObject.set(x, "animatedZooms", js.undefined)
        
        inline def setAnnotationClickHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "annotationClickHandler", js.Any.fromFunction4(value))
        
        inline def setAnnotationClickHandlerNull: Self = StObject.set(x, "annotationClickHandler", null)
        
        inline def setAnnotationClickHandlerUndefined: Self = StObject.set(x, "annotationClickHandler", js.undefined)
        
        inline def setAnnotationDblClickHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "annotationDblClickHandler", js.Any.fromFunction4(value))
        
        inline def setAnnotationDblClickHandlerNull: Self = StObject.set(x, "annotationDblClickHandler", null)
        
        inline def setAnnotationDblClickHandlerUndefined: Self = StObject.set(x, "annotationDblClickHandler", js.undefined)
        
        inline def setAnnotationMouseOutHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "annotationMouseOutHandler", js.Any.fromFunction4(value))
        
        inline def setAnnotationMouseOutHandlerNull: Self = StObject.set(x, "annotationMouseOutHandler", null)
        
        inline def setAnnotationMouseOutHandlerUndefined: Self = StObject.set(x, "annotationMouseOutHandler", js.undefined)
        
        inline def setAnnotationMouseOverHandler(
          value: (/* annotation */ ReadonlyAnnotation, /* point */ ReadonlyPoint, /* dygraph */ ReadonlyDygraph, /* event */ MouseEvent) => Any
        ): Self = StObject.set(x, "annotationMouseOverHandler", js.Any.fromFunction4(value))
        
        inline def setAnnotationMouseOverHandlerNull: Self = StObject.set(x, "annotationMouseOverHandler", null)
        
        inline def setAnnotationMouseOverHandlerUndefined: Self = StObject.set(x, "annotationMouseOverHandler", js.undefined)
        
        inline def setAxes(value: PartialRecordAxisPerAxisO): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
        
        inline def setAxesNull: Self = StObject.set(x, "axes", null)
        
        inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
        
        inline def setClickCallback(value: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point]) => Unit): Self = StObject.set(x, "clickCallback", js.Any.fromFunction3(value))
        
        inline def setClickCallbackNull: Self = StObject.set(x, "clickCallback", null)
        
        inline def setClickCallbackUndefined: Self = StObject.set(x, "clickCallback", js.undefined)
        
        inline def setColorSaturation(value: Double): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
        
        inline def setColorSaturationNull: Self = StObject.set(x, "colorSaturation", null)
        
        inline def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
        
        inline def setColorValue(value: Double): Self = StObject.set(x, "colorValue", value.asInstanceOf[js.Any])
        
        inline def setColorValueNull: Self = StObject.set(x, "colorValue", null)
        
        inline def setColorValueUndefined: Self = StObject.set(x, "colorValue", js.undefined)
        
        inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsNull: Self = StObject.set(x, "colors", null)
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
        
        inline def setConnectSeparatedPoints(value: Boolean): Self = StObject.set(x, "connectSeparatedPoints", value.asInstanceOf[js.Any])
        
        inline def setConnectSeparatedPointsNull: Self = StObject.set(x, "connectSeparatedPoints", null)
        
        inline def setConnectSeparatedPointsUndefined: Self = StObject.set(x, "connectSeparatedPoints", js.undefined)
        
        inline def setCustomBars(value: Boolean): Self = StObject.set(x, "customBars", value.asInstanceOf[js.Any])
        
        inline def setCustomBarsNull: Self = StObject.set(x, "customBars", null)
        
        inline def setCustomBarsUndefined: Self = StObject.set(x, "customBars", js.undefined)
        
        inline def setDataHandler(value: DataHandler): Self = StObject.set(x, "dataHandler", value.asInstanceOf[js.Any])
        
        inline def setDataHandlerNull: Self = StObject.set(x, "dataHandler", null)
        
        inline def setDataHandlerUndefined: Self = StObject.set(x, "dataHandler", js.undefined)
        
        inline def setDateWindow(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "dateWindow", value.asInstanceOf[js.Any])
        
        inline def setDateWindowNull: Self = StObject.set(x, "dateWindow", null)
        
        inline def setDateWindowUndefined: Self = StObject.set(x, "dateWindow", js.undefined)
        
        inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
        
        inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        inline def setDigitsAfterDecimal(value: Double): Self = StObject.set(x, "digitsAfterDecimal", value.asInstanceOf[js.Any])
        
        inline def setDigitsAfterDecimalNull: Self = StObject.set(x, "digitsAfterDecimal", null)
        
        inline def setDigitsAfterDecimalUndefined: Self = StObject.set(x, "digitsAfterDecimal", js.undefined)
        
        inline def setDisplayAnnotations(value: Boolean): Self = StObject.set(x, "displayAnnotations", value.asInstanceOf[js.Any])
        
        inline def setDisplayAnnotationsNull: Self = StObject.set(x, "displayAnnotations", null)
        
        inline def setDisplayAnnotationsUndefined: Self = StObject.set(x, "displayAnnotations", js.undefined)
        
        inline def setDrawAxesAtZero(value: Boolean): Self = StObject.set(x, "drawAxesAtZero", value.asInstanceOf[js.Any])
        
        inline def setDrawAxesAtZeroNull: Self = StObject.set(x, "drawAxesAtZero", null)
        
        inline def setDrawAxesAtZeroUndefined: Self = StObject.set(x, "drawAxesAtZero", js.undefined)
        
        inline def setDrawCallback(value: (/* dygraph */ ReadonlyDygraphAdjustRoll, /* is_initial */ Boolean) => Unit): Self = StObject.set(x, "drawCallback", js.Any.fromFunction2(value))
        
        inline def setDrawCallbackNull: Self = StObject.set(x, "drawCallback", null)
        
        inline def setDrawCallbackUndefined: Self = StObject.set(x, "drawCallback", js.undefined)
        
        inline def setDrawGapEdgePoints(value: Boolean): Self = StObject.set(x, "drawGapEdgePoints", value.asInstanceOf[js.Any])
        
        inline def setDrawGapEdgePointsNull: Self = StObject.set(x, "drawGapEdgePoints", null)
        
        inline def setDrawGapEdgePointsUndefined: Self = StObject.set(x, "drawGapEdgePoints", js.undefined)
        
        inline def setDrawHighlightPointCallback(
          value: js.ThisFunction7[
                  /* this */ ReadonlyDygraphAdjustRoll, 
                  /* dygraph */ ReadonlyDygraphAdjustRoll, 
                  /* seriesName */ String, 
                  /* canvasContext */ CanvasRenderingContext2D, 
                  /* cx */ Double, 
                  /* cy */ Double, 
                  /* color */ String, 
                  /* pointSize */ Double, 
                  Unit
                ]
        ): Self = StObject.set(x, "drawHighlightPointCallback", value.asInstanceOf[js.Any])
        
        inline def setDrawHighlightPointCallbackNull: Self = StObject.set(x, "drawHighlightPointCallback", null)
        
        inline def setDrawHighlightPointCallbackUndefined: Self = StObject.set(x, "drawHighlightPointCallback", js.undefined)
        
        inline def setDrawPointCallback(
          value: js.ThisFunction7[
                  /* this */ ReadonlyDygraphAdjustRoll, 
                  /* dygraph */ ReadonlyDygraphAdjustRoll, 
                  /* seriesName */ String, 
                  /* canvasContext */ CanvasRenderingContext2D, 
                  /* cx */ Double, 
                  /* cy */ Double, 
                  /* color */ String, 
                  /* pointSize */ Double, 
                  Unit
                ]
        ): Self = StObject.set(x, "drawPointCallback", value.asInstanceOf[js.Any])
        
        inline def setDrawPointCallbackNull: Self = StObject.set(x, "drawPointCallback", null)
        
        inline def setDrawPointCallbackUndefined: Self = StObject.set(x, "drawPointCallback", js.undefined)
        
        inline def setErrorBars(value: Boolean): Self = StObject.set(x, "errorBars", value.asInstanceOf[js.Any])
        
        inline def setErrorBarsNull: Self = StObject.set(x, "errorBars", null)
        
        inline def setErrorBarsUndefined: Self = StObject.set(x, "errorBars", js.undefined)
        
        inline def setFile(value: Data): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileNull: Self = StObject.set(x, "file", null)
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setFileVarargs(value: (js.Array[Double | js.Array[Double] | js.Date | Null])*): Self = StObject.set(x, "file", js.Array(value*))
        
        inline def setFractions(value: Boolean): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
        
        inline def setFractionsNull: Self = StObject.set(x, "fractions", null)
        
        inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightNull: Self = StObject.set(x, "height", null)
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHideOverlayOnMouseOut(value: Boolean): Self = StObject.set(x, "hideOverlayOnMouseOut", value.asInstanceOf[js.Any])
        
        inline def setHideOverlayOnMouseOutNull: Self = StObject.set(x, "hideOverlayOnMouseOut", null)
        
        inline def setHideOverlayOnMouseOutUndefined: Self = StObject.set(x, "hideOverlayOnMouseOut", js.undefined)
        
        inline def setHighlightCallback(
          value: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], /* row */ Double, /* seriesName */ String) => Unit
        ): Self = StObject.set(x, "highlightCallback", js.Any.fromFunction5(value))
        
        inline def setHighlightCallbackNull: Self = StObject.set(x, "highlightCallback", null)
        
        inline def setHighlightCallbackUndefined: Self = StObject.set(x, "highlightCallback", js.undefined)
        
        inline def setHighlightSeriesBackgroundAlpha(value: Double): Self = StObject.set(x, "highlightSeriesBackgroundAlpha", value.asInstanceOf[js.Any])
        
        inline def setHighlightSeriesBackgroundAlphaNull: Self = StObject.set(x, "highlightSeriesBackgroundAlpha", null)
        
        inline def setHighlightSeriesBackgroundAlphaUndefined: Self = StObject.set(x, "highlightSeriesBackgroundAlpha", js.undefined)
        
        inline def setHighlightSeriesBackgroundColor(value: String): Self = StObject.set(x, "highlightSeriesBackgroundColor", value.asInstanceOf[js.Any])
        
        inline def setHighlightSeriesBackgroundColorNull: Self = StObject.set(x, "highlightSeriesBackgroundColor", null)
        
        inline def setHighlightSeriesBackgroundColorUndefined: Self = StObject.set(x, "highlightSeriesBackgroundColor", js.undefined)
        
        inline def setHighlightSeriesOpts(value: PerSeriesOptions): Self = StObject.set(x, "highlightSeriesOpts", value.asInstanceOf[js.Any])
        
        inline def setHighlightSeriesOptsNull: Self = StObject.set(x, "highlightSeriesOpts", null)
        
        inline def setHighlightSeriesOptsUndefined: Self = StObject.set(x, "highlightSeriesOpts", js.undefined)
        
        inline def setIncludeZero(value: Boolean): Self = StObject.set(x, "includeZero", value.asInstanceOf[js.Any])
        
        inline def setIncludeZeroNull: Self = StObject.set(x, "includeZero", null)
        
        inline def setIncludeZeroUndefined: Self = StObject.set(x, "includeZero", js.undefined)
        
        inline def setInteractionModel(value: js.Object): Self = StObject.set(x, "interactionModel", value.asInstanceOf[js.Any])
        
        inline def setInteractionModelNull: Self = StObject.set(x, "interactionModel", null)
        
        inline def setInteractionModelUndefined: Self = StObject.set(x, "interactionModel", js.undefined)
        
        inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsDiv(value: HTMLElement | String): Self = StObject.set(x, "labelsDiv", value.asInstanceOf[js.Any])
        
        inline def setLabelsDivNull: Self = StObject.set(x, "labelsDiv", null)
        
        inline def setLabelsDivUndefined: Self = StObject.set(x, "labelsDiv", js.undefined)
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsSeparateLines(value: Boolean): Self = StObject.set(x, "labelsSeparateLines", value.asInstanceOf[js.Any])
        
        inline def setLabelsSeparateLinesNull: Self = StObject.set(x, "labelsSeparateLines", null)
        
        inline def setLabelsSeparateLinesUndefined: Self = StObject.set(x, "labelsSeparateLines", js.undefined)
        
        inline def setLabelsShowZeroValues(value: Boolean): Self = StObject.set(x, "labelsShowZeroValues", value.asInstanceOf[js.Any])
        
        inline def setLabelsShowZeroValuesNull: Self = StObject.set(x, "labelsShowZeroValues", null)
        
        inline def setLabelsShowZeroValuesUndefined: Self = StObject.set(x, "labelsShowZeroValues", js.undefined)
        
        inline def setLabelsUTC(value: Boolean): Self = StObject.set(x, "labelsUTC", value.asInstanceOf[js.Any])
        
        inline def setLabelsUTCNull: Self = StObject.set(x, "labelsUTC", null)
        
        inline def setLabelsUTCUndefined: Self = StObject.set(x, "labelsUTC", js.undefined)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
        
        inline def setLegend(value: always | follow | onmouseover | never): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        inline def setLegendFormatter(value: /* data */ LegendData => String): Self = StObject.set(x, "legendFormatter", js.Any.fromFunction1(value))
        
        inline def setLegendFormatterNull: Self = StObject.set(x, "legendFormatter", null)
        
        inline def setLegendFormatterUndefined: Self = StObject.set(x, "legendFormatter", js.undefined)
        
        inline def setLegendNull: Self = StObject.set(x, "legend", null)
        
        inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
        
        inline def setPanEdgeFraction(value: Double): Self = StObject.set(x, "panEdgeFraction", value.asInstanceOf[js.Any])
        
        inline def setPanEdgeFractionNull: Self = StObject.set(x, "panEdgeFraction", null)
        
        inline def setPanEdgeFractionUndefined: Self = StObject.set(x, "panEdgeFraction", js.undefined)
        
        inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
        
        inline def setPixelRatioNull: Self = StObject.set(x, "pixelRatio", null)
        
        inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
        
        inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
        
        inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
        
        inline def setPointClickCallback(value: (/* event */ MouseEvent, /* point */ ReadonlyPoint) => Unit): Self = StObject.set(x, "pointClickCallback", js.Any.fromFunction2(value))
        
        inline def setPointClickCallbackNull: Self = StObject.set(x, "pointClickCallback", null)
        
        inline def setPointClickCallbackUndefined: Self = StObject.set(x, "pointClickCallback", js.undefined)
        
        inline def setRangeSelectorAlpha(value: Double): Self = StObject.set(x, "rangeSelectorAlpha", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorAlphaNull: Self = StObject.set(x, "rangeSelectorAlpha", null)
        
        inline def setRangeSelectorAlphaUndefined: Self = StObject.set(x, "rangeSelectorAlpha", js.undefined)
        
        inline def setRangeSelectorBackgroundLineWidth(value: Double): Self = StObject.set(x, "rangeSelectorBackgroundLineWidth", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorBackgroundLineWidthNull: Self = StObject.set(x, "rangeSelectorBackgroundLineWidth", null)
        
        inline def setRangeSelectorBackgroundLineWidthUndefined: Self = StObject.set(x, "rangeSelectorBackgroundLineWidth", js.undefined)
        
        inline def setRangeSelectorBackgroundStrokeColor(value: String): Self = StObject.set(x, "rangeSelectorBackgroundStrokeColor", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorBackgroundStrokeColorNull: Self = StObject.set(x, "rangeSelectorBackgroundStrokeColor", null)
        
        inline def setRangeSelectorBackgroundStrokeColorUndefined: Self = StObject.set(x, "rangeSelectorBackgroundStrokeColor", js.undefined)
        
        inline def setRangeSelectorForegroundLineWidth(value: Double): Self = StObject.set(x, "rangeSelectorForegroundLineWidth", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorForegroundLineWidthNull: Self = StObject.set(x, "rangeSelectorForegroundLineWidth", null)
        
        inline def setRangeSelectorForegroundLineWidthUndefined: Self = StObject.set(x, "rangeSelectorForegroundLineWidth", js.undefined)
        
        inline def setRangeSelectorForegroundStrokeColor(value: Double): Self = StObject.set(x, "rangeSelectorForegroundStrokeColor", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorForegroundStrokeColorNull: Self = StObject.set(x, "rangeSelectorForegroundStrokeColor", null)
        
        inline def setRangeSelectorForegroundStrokeColorUndefined: Self = StObject.set(x, "rangeSelectorForegroundStrokeColor", js.undefined)
        
        inline def setRangeSelectorHeight(value: Double): Self = StObject.set(x, "rangeSelectorHeight", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorHeightNull: Self = StObject.set(x, "rangeSelectorHeight", null)
        
        inline def setRangeSelectorHeightUndefined: Self = StObject.set(x, "rangeSelectorHeight", js.undefined)
        
        inline def setRangeSelectorPlotFillColor(value: String): Self = StObject.set(x, "rangeSelectorPlotFillColor", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorPlotFillColorNull: Self = StObject.set(x, "rangeSelectorPlotFillColor", null)
        
        inline def setRangeSelectorPlotFillColorUndefined: Self = StObject.set(x, "rangeSelectorPlotFillColor", js.undefined)
        
        inline def setRangeSelectorPlotFillGradientColor(value: String): Self = StObject.set(x, "rangeSelectorPlotFillGradientColor", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorPlotFillGradientColorNull: Self = StObject.set(x, "rangeSelectorPlotFillGradientColor", null)
        
        inline def setRangeSelectorPlotFillGradientColorUndefined: Self = StObject.set(x, "rangeSelectorPlotFillGradientColor", js.undefined)
        
        inline def setRangeSelectorPlotLineWidth(value: Double): Self = StObject.set(x, "rangeSelectorPlotLineWidth", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorPlotLineWidthNull: Self = StObject.set(x, "rangeSelectorPlotLineWidth", null)
        
        inline def setRangeSelectorPlotLineWidthUndefined: Self = StObject.set(x, "rangeSelectorPlotLineWidth", js.undefined)
        
        inline def setRangeSelectorPlotStrokeColor(value: String): Self = StObject.set(x, "rangeSelectorPlotStrokeColor", value.asInstanceOf[js.Any])
        
        inline def setRangeSelectorPlotStrokeColorNull: Self = StObject.set(x, "rangeSelectorPlotStrokeColor", null)
        
        inline def setRangeSelectorPlotStrokeColorUndefined: Self = StObject.set(x, "rangeSelectorPlotStrokeColor", js.undefined)
        
        inline def setRightGap(value: Double): Self = StObject.set(x, "rightGap", value.asInstanceOf[js.Any])
        
        inline def setRightGapNull: Self = StObject.set(x, "rightGap", null)
        
        inline def setRightGapUndefined: Self = StObject.set(x, "rightGap", js.undefined)
        
        inline def setRollPeriod(value: Double): Self = StObject.set(x, "rollPeriod", value.asInstanceOf[js.Any])
        
        inline def setRollPeriodNull: Self = StObject.set(x, "rollPeriod", null)
        
        inline def setRollPeriodUndefined: Self = StObject.set(x, "rollPeriod", js.undefined)
        
        inline def setSeries(value: Record[String, PerSeriesOptions]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        inline def setSeriesNull: Self = StObject.set(x, "series", null)
        
        inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        inline def setShowLabelsOnHighlight(value: Boolean): Self = StObject.set(x, "showLabelsOnHighlight", value.asInstanceOf[js.Any])
        
        inline def setShowLabelsOnHighlightNull: Self = StObject.set(x, "showLabelsOnHighlight", null)
        
        inline def setShowLabelsOnHighlightUndefined: Self = StObject.set(x, "showLabelsOnHighlight", js.undefined)
        
        inline def setShowRangeSelector(value: Boolean): Self = StObject.set(x, "showRangeSelector", value.asInstanceOf[js.Any])
        
        inline def setShowRangeSelectorNull: Self = StObject.set(x, "showRangeSelector", null)
        
        inline def setShowRangeSelectorUndefined: Self = StObject.set(x, "showRangeSelector", js.undefined)
        
        inline def setShowRoller(value: Boolean): Self = StObject.set(x, "showRoller", value.asInstanceOf[js.Any])
        
        inline def setShowRollerNull: Self = StObject.set(x, "showRoller", null)
        
        inline def setShowRollerUndefined: Self = StObject.set(x, "showRoller", js.undefined)
        
        inline def setSigma(value: Double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
        
        inline def setSigmaNull: Self = StObject.set(x, "sigma", null)
        
        inline def setSigmaUndefined: Self = StObject.set(x, "sigma", js.undefined)
        
        inline def setStackedGraph(value: Boolean): Self = StObject.set(x, "stackedGraph", value.asInstanceOf[js.Any])
        
        inline def setStackedGraphNaNFill(value: all | inside | none): Self = StObject.set(x, "stackedGraphNaNFill", value.asInstanceOf[js.Any])
        
        inline def setStackedGraphNaNFillNull: Self = StObject.set(x, "stackedGraphNaNFill", null)
        
        inline def setStackedGraphNaNFillUndefined: Self = StObject.set(x, "stackedGraphNaNFill", js.undefined)
        
        inline def setStackedGraphNull: Self = StObject.set(x, "stackedGraph", null)
        
        inline def setStackedGraphUndefined: Self = StObject.set(x, "stackedGraph", js.undefined)
        
        inline def setTimingName(value: String): Self = StObject.set(x, "timingName", value.asInstanceOf[js.Any])
        
        inline def setTimingNameNull: Self = StObject.set(x, "timingName", null)
        
        inline def setTimingNameUndefined: Self = StObject.set(x, "timingName", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleHeight(value: Double): Self = StObject.set(x, "titleHeight", value.asInstanceOf[js.Any])
        
        inline def setTitleHeightNull: Self = StObject.set(x, "titleHeight", null)
        
        inline def setTitleHeightUndefined: Self = StObject.set(x, "titleHeight", js.undefined)
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUnderlayCallback(
          value: (/* context */ CanvasRenderingContext2D, /* area */ ReadonlyArea, /* dygraph */ ReadonlyDygraphAdjustRoll) => Unit
        ): Self = StObject.set(x, "underlayCallback", js.Any.fromFunction3(value))
        
        inline def setUnderlayCallbackNull: Self = StObject.set(x, "underlayCallback", null)
        
        inline def setUnderlayCallbackUndefined: Self = StObject.set(x, "underlayCallback", js.undefined)
        
        inline def setUnhighlightCallback(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "unhighlightCallback", js.Any.fromFunction1(value))
        
        inline def setUnhighlightCallbackNull: Self = StObject.set(x, "unhighlightCallback", null)
        
        inline def setUnhighlightCallbackUndefined: Self = StObject.set(x, "unhighlightCallback", js.undefined)
        
        inline def setVisibility(value: js.Array[Boolean]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
        
        inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
        
        inline def setVisibilityVarargs(value: Boolean*): Self = StObject.set(x, "visibility", js.Array(value*))
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthNull: Self = StObject.set(x, "width", null)
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWilsonInterval(value: Boolean): Self = StObject.set(x, "wilsonInterval", value.asInstanceOf[js.Any])
        
        inline def setWilsonIntervalNull: Self = StObject.set(x, "wilsonInterval", null)
        
        inline def setWilsonIntervalUndefined: Self = StObject.set(x, "wilsonInterval", js.undefined)
        
        inline def setXAxisHeight(value: Double): Self = StObject.set(x, "xAxisHeight", value.asInstanceOf[js.Any])
        
        inline def setXAxisHeightNull: Self = StObject.set(x, "xAxisHeight", null)
        
        inline def setXAxisHeightUndefined: Self = StObject.set(x, "xAxisHeight", js.undefined)
        
        inline def setXLabelHeight(value: Double): Self = StObject.set(x, "xLabelHeight", value.asInstanceOf[js.Any])
        
        inline def setXLabelHeightNull: Self = StObject.set(x, "xLabelHeight", null)
        
        inline def setXLabelHeightUndefined: Self = StObject.set(x, "xLabelHeight", js.undefined)
        
        inline def setXRangePad(value: Double): Self = StObject.set(x, "xRangePad", value.asInstanceOf[js.Any])
        
        inline def setXRangePadNull: Self = StObject.set(x, "xRangePad", null)
        
        inline def setXRangePadUndefined: Self = StObject.set(x, "xRangePad", js.undefined)
        
        inline def setXValueParser(value: /* str */ String => Double): Self = StObject.set(x, "xValueParser", js.Any.fromFunction1(value))
        
        inline def setXValueParserNull: Self = StObject.set(x, "xValueParser", null)
        
        inline def setXValueParserUndefined: Self = StObject.set(x, "xValueParser", js.undefined)
        
        inline def setXlabel(value: String): Self = StObject.set(x, "xlabel", value.asInstanceOf[js.Any])
        
        inline def setXlabelNull: Self = StObject.set(x, "xlabel", null)
        
        inline def setXlabelUndefined: Self = StObject.set(x, "xlabel", js.undefined)
        
        inline def setY2label(value: String): Self = StObject.set(x, "y2label", value.asInstanceOf[js.Any])
        
        inline def setY2labelNull: Self = StObject.set(x, "y2label", null)
        
        inline def setY2labelUndefined: Self = StObject.set(x, "y2label", js.undefined)
        
        inline def setYLabelWidth(value: Double): Self = StObject.set(x, "yLabelWidth", value.asInstanceOf[js.Any])
        
        inline def setYLabelWidthNull: Self = StObject.set(x, "yLabelWidth", null)
        
        inline def setYLabelWidthUndefined: Self = StObject.set(x, "yLabelWidth", js.undefined)
        
        inline def setYRangePad(value: Double): Self = StObject.set(x, "yRangePad", value.asInstanceOf[js.Any])
        
        inline def setYRangePadNull: Self = StObject.set(x, "yRangePad", null)
        
        inline def setYRangePadUndefined: Self = StObject.set(x, "yRangePad", js.undefined)
        
        inline def setYlabel(value: String): Self = StObject.set(x, "ylabel", value.asInstanceOf[js.Any])
        
        inline def setYlabelNull: Self = StObject.set(x, "ylabel", null)
        
        inline def setYlabelUndefined: Self = StObject.set(x, "ylabel", js.undefined)
        
        inline def setZoomCallback(
          value: (/* minDate */ Double, /* maxDate */ Double, /* yRanges */ js.Array[js.Tuple2[Double, Double]]) => Unit
        ): Self = StObject.set(x, "zoomCallback", js.Any.fromFunction3(value))
        
        inline def setZoomCallbackNull: Self = StObject.set(x, "zoomCallback", null)
        
        inline def setZoomCallbackUndefined: Self = StObject.set(x, "zoomCallback", js.undefined)
      }
    }
    
    trait PerAxisOptions extends StObject {
      
      /**
        * Size of the font (in pixels) to use in the axis labels, both x- and y-axis.
        * @default 14
        */
      var axisLabelFontSize: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Function to call to format the tick values that appear along an axis. This is usually set
        * on a per-axis basis.
        * @default Depends on the data type
        */
      var axisLabelFormatter: js.UndefOr[
            (js.Function4[
              /* v */ Double | js.Date, 
              /* granularity */ Double, 
              /* opts */ js.Function1[/* name */ String, Any], 
              /* dygraph */ ReadonlyDygraph, 
              String
            ]) | Null
          ] = js.undefined
      
      /**
        * Width (in pixels) of the containing divs for x- and y-axis labels. For the y-axis, this
        * also controls the width of the y-axis. Note that for the x-axis, this is independent from
        * pixelsPerLabel, which controls the spacing between labels.
        * @default 50 (y-axis), 60 (x-axis)
        */
      var axisLabelWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Color of the x- and y-axis lines. Accepts any value which the HTML canvas strokeStyle
        * attribute understands, e.g. 'black' or 'rgb(0, 100, 255)'.
        * @default black
        */
      var axisLineColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Thickness (in pixels) of the x- and y-axis lines.
        * @default 0.3
        */
      var axisLineWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The size of the line to display next to each tick mark on x- or y-axes.
        * @default 3.0
        */
      var axisTickSize: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Whether to draw the specified axis. This may be set on a per-axis basis to define the
        * visibility of each axis separately. Setting this to false also prevents axis ticks from
        * being drawn and reclaims the space for the chart grid/lines.
        * @default true for x and y, false for y2
        */
      var drawAxis: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Whether to display gridlines in the chart. This may be set on a per-axis basis to define
        * the visibility of each axis' grid separately.
        * @default true for x and y, false for y2
        */
      var drawGrid: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * The color of the gridlines. This may be set on a per-axis basis to define each axis' grid
        * separately.
        * @default rgb(128,128,128)
        */
      var gridLineColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * A custom pattern array where the even index is a draw and odd is a space in pixels. If
        * null then it draws a solid line. The array should have a even length as any odd lengthed
        * array could be expressed as a smaller even length array. This is used to create dashed
        * gridlines.
        * @default null
        */
      var gridLinePattern: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * Thickness (in pixels) of the gridlines drawn under the chart. The vertical/horizontal
        * gridlines can be turned off entirely by using the drawGrid option. This
        * may be set on a per-axis basis to define each axis' grid separately.
        * @default 0.3
        */
      var gridLineWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Only valid for y and y2, has no effect on x: This option defines whether the y axes should
        * align their ticks or if they should be independent. Possible combinations: 1.) y=true,
        * y2=false (default): y is the primary axis and the y2 ticks are aligned to the the ones of
        * y. (only 1 grid) 2.) y=false, y2=true: y2 is the primary axis and the y ticks are aligned
        * to the the ones of y2. (only 1 grid) 3.) y=true, y2=true: Both axis are independent and
        * have their own ticks. (2 grids) 4.) y=false, y2=false: Invalid configuration causes an
        * error.
        * @default true for y, false for y2
        */
      var independentTicks: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Show K/M/B for thousands/millions/billions on y-axis.
        * @default false
        */
      var labelsKMB: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Show k/M/G for kilo/Mega/Giga on y-axis. This is different than labelsKMB in
        * that it uses base 2, not 10.
        * @default false
        */
      var labelsKMG2: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set for the y-axis or x-axis, the graph shows that axis in log scale. Any values less
        * than or equal to zero are not displayed. Showing log scale with ranges that go below zero
        * will result in an unviewable graph.
        *
        * Not compatible with showZero. connectSeparatedPoints is ignored. This is ignored for
        * date-based x-axes.
        * @default false
        */
      var logscale: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When displaying numbers in normal (not scientific) mode, large numbers will be displayed
        * with many trailing zeros (e.g. 100000000 instead of 1e9). This can lead to unwieldy y-axis
        * labels. If there are more than maxNumberWidth digits to the left of the
        * decimal in a number, dygraphs will switch to scientific notation, even when not operating
        * in scientific mode. If you'd like to see all those digits, set this to something large,
        * like 20 or 30.
        * @default 6
        */
      var maxNumberWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Number of pixels to require between each x- and y-label. Larger values will yield a
        * sparser axis with fewer ticks. This is set on a per-axis basis.
        * @default 70 (x-axis) or 30 (y-axes)
        */
      var pixelsPerLabel: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * By default, dygraphs displays numbers with a fixed number of digits after the decimal
        * point. If you'd prefer to have a fixed number of significant figures, set this option to
        * that number of sig figs. A value of 2, for instance, would cause 1 to be display as 1.0
        * and 1234 to be displayed as 1.23e+3.
        * @default null
        */
      var sigFigs: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * This lets you specify an arbitrary function to generate tick marks on an axis. The tick
        * marks are an array of (value, label) pairs. The built-in functions go to great lengths to
        * choose good tick marks so, if you set this option, you'll most likely want to call one of
        * them and modify the result. See dygraph-tickers.js for an extensive discussion. This is
        * set on a per-axis basis.
        * @default dygraphs.dateTicker or dygraphs.numericTicks
        */
      var ticker: js.UndefOr[Ticker | Null] = js.undefined
      
      /**
        * Function to provide a custom display format for the values displayed on mouseover. This
        * does not affect the values that appear on tick marks next to the axes. To format those,
        * see axisLabelFormatter. This is usually set on a per-axis basis.
        * @default Depends on the type of your data.
        */
      var valueFormatter: js.UndefOr[
            (js.Function6[
              /* v */ Double, 
              /* opts */ js.Function1[/* name */ String, Any], 
              /* seriesName */ String, 
              /* dygraph */ ReadonlyDygraph, 
              /* row */ Double, 
              /* col */ Double, 
              String
            ]) | Null
          ] = js.undefined
      
      /**
        * Explicitly set the vertical range of the graph to [low, high]. This may be set on a
        * per-axis basis to define each y-axis separately. If either limit is unspecified, it will
        * be calculated automatically (e.g. [null, 30] to automatically calculate just the lower
        * bound)
        * @default Full range of the input is shown
        */
      var valueRange: js.UndefOr[(js.Tuple2[Double | Null, Double | Null]) | Null] = js.undefined
    }
    object PerAxisOptions {
      
      inline def apply(): PerAxisOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerAxisOptions]
      }
      
      extension [Self <: PerAxisOptions](x: Self) {
        
        inline def setAxisLabelFontSize(value: Double): Self = StObject.set(x, "axisLabelFontSize", value.asInstanceOf[js.Any])
        
        inline def setAxisLabelFontSizeNull: Self = StObject.set(x, "axisLabelFontSize", null)
        
        inline def setAxisLabelFontSizeUndefined: Self = StObject.set(x, "axisLabelFontSize", js.undefined)
        
        inline def setAxisLabelFormatter(
          value: (/* v */ Double | js.Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, Any], /* dygraph */ ReadonlyDygraph) => String
        ): Self = StObject.set(x, "axisLabelFormatter", js.Any.fromFunction4(value))
        
        inline def setAxisLabelFormatterNull: Self = StObject.set(x, "axisLabelFormatter", null)
        
        inline def setAxisLabelFormatterUndefined: Self = StObject.set(x, "axisLabelFormatter", js.undefined)
        
        inline def setAxisLabelWidth(value: Double): Self = StObject.set(x, "axisLabelWidth", value.asInstanceOf[js.Any])
        
        inline def setAxisLabelWidthNull: Self = StObject.set(x, "axisLabelWidth", null)
        
        inline def setAxisLabelWidthUndefined: Self = StObject.set(x, "axisLabelWidth", js.undefined)
        
        inline def setAxisLineColor(value: String): Self = StObject.set(x, "axisLineColor", value.asInstanceOf[js.Any])
        
        inline def setAxisLineColorNull: Self = StObject.set(x, "axisLineColor", null)
        
        inline def setAxisLineColorUndefined: Self = StObject.set(x, "axisLineColor", js.undefined)
        
        inline def setAxisLineWidth(value: Double): Self = StObject.set(x, "axisLineWidth", value.asInstanceOf[js.Any])
        
        inline def setAxisLineWidthNull: Self = StObject.set(x, "axisLineWidth", null)
        
        inline def setAxisLineWidthUndefined: Self = StObject.set(x, "axisLineWidth", js.undefined)
        
        inline def setAxisTickSize(value: Double): Self = StObject.set(x, "axisTickSize", value.asInstanceOf[js.Any])
        
        inline def setAxisTickSizeNull: Self = StObject.set(x, "axisTickSize", null)
        
        inline def setAxisTickSizeUndefined: Self = StObject.set(x, "axisTickSize", js.undefined)
        
        inline def setDrawAxis(value: Boolean): Self = StObject.set(x, "drawAxis", value.asInstanceOf[js.Any])
        
        inline def setDrawAxisNull: Self = StObject.set(x, "drawAxis", null)
        
        inline def setDrawAxisUndefined: Self = StObject.set(x, "drawAxis", js.undefined)
        
        inline def setDrawGrid(value: Boolean): Self = StObject.set(x, "drawGrid", value.asInstanceOf[js.Any])
        
        inline def setDrawGridNull: Self = StObject.set(x, "drawGrid", null)
        
        inline def setDrawGridUndefined: Self = StObject.set(x, "drawGrid", js.undefined)
        
        inline def setGridLineColor(value: String): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
        
        inline def setGridLineColorNull: Self = StObject.set(x, "gridLineColor", null)
        
        inline def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
        
        inline def setGridLinePattern(value: js.Array[Double]): Self = StObject.set(x, "gridLinePattern", value.asInstanceOf[js.Any])
        
        inline def setGridLinePatternNull: Self = StObject.set(x, "gridLinePattern", null)
        
        inline def setGridLinePatternUndefined: Self = StObject.set(x, "gridLinePattern", js.undefined)
        
        inline def setGridLinePatternVarargs(value: Double*): Self = StObject.set(x, "gridLinePattern", js.Array(value*))
        
        inline def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
        
        inline def setGridLineWidthNull: Self = StObject.set(x, "gridLineWidth", null)
        
        inline def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
        
        inline def setIndependentTicks(value: Boolean): Self = StObject.set(x, "independentTicks", value.asInstanceOf[js.Any])
        
        inline def setIndependentTicksNull: Self = StObject.set(x, "independentTicks", null)
        
        inline def setIndependentTicksUndefined: Self = StObject.set(x, "independentTicks", js.undefined)
        
        inline def setLabelsKMB(value: Boolean): Self = StObject.set(x, "labelsKMB", value.asInstanceOf[js.Any])
        
        inline def setLabelsKMBNull: Self = StObject.set(x, "labelsKMB", null)
        
        inline def setLabelsKMBUndefined: Self = StObject.set(x, "labelsKMB", js.undefined)
        
        inline def setLabelsKMG2(value: Boolean): Self = StObject.set(x, "labelsKMG2", value.asInstanceOf[js.Any])
        
        inline def setLabelsKMG2Null: Self = StObject.set(x, "labelsKMG2", null)
        
        inline def setLabelsKMG2Undefined: Self = StObject.set(x, "labelsKMG2", js.undefined)
        
        inline def setLogscale(value: Boolean): Self = StObject.set(x, "logscale", value.asInstanceOf[js.Any])
        
        inline def setLogscaleNull: Self = StObject.set(x, "logscale", null)
        
        inline def setLogscaleUndefined: Self = StObject.set(x, "logscale", js.undefined)
        
        inline def setMaxNumberWidth(value: Double): Self = StObject.set(x, "maxNumberWidth", value.asInstanceOf[js.Any])
        
        inline def setMaxNumberWidthNull: Self = StObject.set(x, "maxNumberWidth", null)
        
        inline def setMaxNumberWidthUndefined: Self = StObject.set(x, "maxNumberWidth", js.undefined)
        
        inline def setPixelsPerLabel(value: Double): Self = StObject.set(x, "pixelsPerLabel", value.asInstanceOf[js.Any])
        
        inline def setPixelsPerLabelNull: Self = StObject.set(x, "pixelsPerLabel", null)
        
        inline def setPixelsPerLabelUndefined: Self = StObject.set(x, "pixelsPerLabel", js.undefined)
        
        inline def setSigFigs(value: Double): Self = StObject.set(x, "sigFigs", value.asInstanceOf[js.Any])
        
        inline def setSigFigsNull: Self = StObject.set(x, "sigFigs", null)
        
        inline def setSigFigsUndefined: Self = StObject.set(x, "sigFigs", js.undefined)
        
        inline def setTicker(
          value: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, Any], /* dygraph */ ReadonlyDygraph, /* vals */ js.Array[Double]) => js.Array[Label]
        ): Self = StObject.set(x, "ticker", js.Any.fromFunction6(value))
        
        inline def setTickerNull: Self = StObject.set(x, "ticker", null)
        
        inline def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
        
        inline def setValueFormatter(
          value: (/* v */ Double, /* opts */ js.Function1[/* name */ String, Any], /* seriesName */ String, /* dygraph */ ReadonlyDygraph, /* row */ Double, /* col */ Double) => String
        ): Self = StObject.set(x, "valueFormatter", js.Any.fromFunction6(value))
        
        inline def setValueFormatterNull: Self = StObject.set(x, "valueFormatter", null)
        
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
        * @default none
        */
      var axis: js.UndefOr[y1 | y2 | _empty] = js.undefined
      
      /**
        * A per-series color definition. Used in conjunction with, and overrides, the colors option.
        * @default (see description)
        */
      var color: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Draw a small dot at each point, in addition to a line going through the point. This makes
        * the individual data points easier to see, but can increase visual clutter in the chart.
        * The small dot can be replaced with a custom rendering by supplying a drawPointCallback.
        * @default false
        */
      var drawPoints: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Error bars (or custom bars) for each series are drawn in the same color as the series, but
        * with partial transparency. This sets the transparency. A value of 0.0 means that the error
        * bars will not be drawn, whereas a value of 1.0 means that the error bars will be as dark
        * as the line for the series itself. This can be used to produce chart lines whose thickness
        * varies at each point.
        * @default 0.15
        */
      var fillAlpha: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Should the area underneath the graph be filled? This option is not compatible with error
        * bars. This may be set on a per-series basis.
        * @default false
        */
      var fillGraph: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * The size in pixels of the dot drawn over highlighted points.
        * @default 3
        */
      var highlightCircleSize: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * A function (or array of functions) which plot each data series on the chart.
        * TODO(danvk): more details! May be set per-series.
        * @default [Dygraph.Plotters.fillPlotter, Dygraph.Plotters.errorPlotter, Dygraph.Plotters.linePlotter]
        */
      var plotter: js.UndefOr[Any] = js.undefined
      
      /**
        * The size of the dot to draw on each point in pixels (see drawPoints). A dot is always
        * drawn when a point is "isolated", i.e. there is a missing point on either side of it. This
        * also controls the size of those dots.
        * @default 1
        */
      var pointSize: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Mark this series for inclusion in the range selector. The mini plot curve will be an
        * average of all such series. If this is not specified for any series, the default behavior
        * is to average all the visible series. Setting it for one series will result in that series being
        * charted alone in the range selector. Once it's set for a single series, it needs to
        * be set for all series which should be included (regardless of visibility).
        * @default null
        */
      var showInRangeSelector: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * When set, display the graph as a step plot instead of a line plot. This option may either
        * be set for the whole graph or for single series.
        * @default false
        */
      var stepPlot: js.UndefOr[Boolean | Null] = js.undefined
      
      /**
        * Color for the line border used if strokeBorderWidth is set.
        * @default white
        */
      var strokeBorderColor: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Draw a border around graph lines to make crossing lines more easily distinguishable.
        * Useful for graphs with many lines.
        * @default null
        */
      var strokeBorderWidth: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * A custom pattern array where the even index is a draw and odd is a space in pixels. If
        * null then it draws a solid line. The array should have a even length as any odd lengthed
        * array could be expressed as a smaller even length array. This is used to create dashed
        * lines.
        * @default null
        */
      var strokePattern: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * The width of the lines connecting data points. This can be used to increase the contrast
        * or some graphs.
        * @default 1.0
        */
      var strokeWidth: js.UndefOr[Double | Null] = js.undefined
    }
    object PerSeriesOptions {
      
      inline def apply(): PerSeriesOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerSeriesOptions]
      }
      
      extension [Self <: PerSeriesOptions](x: Self) {
        
        inline def setAxis(value: y1 | y2 | _empty): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorNull: Self = StObject.set(x, "color", null)
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setDrawPoints(value: Boolean): Self = StObject.set(x, "drawPoints", value.asInstanceOf[js.Any])
        
        inline def setDrawPointsNull: Self = StObject.set(x, "drawPoints", null)
        
        inline def setDrawPointsUndefined: Self = StObject.set(x, "drawPoints", js.undefined)
        
        inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
        
        inline def setFillAlphaNull: Self = StObject.set(x, "fillAlpha", null)
        
        inline def setFillAlphaUndefined: Self = StObject.set(x, "fillAlpha", js.undefined)
        
        inline def setFillGraph(value: Boolean): Self = StObject.set(x, "fillGraph", value.asInstanceOf[js.Any])
        
        inline def setFillGraphNull: Self = StObject.set(x, "fillGraph", null)
        
        inline def setFillGraphUndefined: Self = StObject.set(x, "fillGraph", js.undefined)
        
        inline def setHighlightCircleSize(value: Double): Self = StObject.set(x, "highlightCircleSize", value.asInstanceOf[js.Any])
        
        inline def setHighlightCircleSizeNull: Self = StObject.set(x, "highlightCircleSize", null)
        
        inline def setHighlightCircleSizeUndefined: Self = StObject.set(x, "highlightCircleSize", js.undefined)
        
        inline def setPlotter(value: Any): Self = StObject.set(x, "plotter", value.asInstanceOf[js.Any])
        
        inline def setPlotterUndefined: Self = StObject.set(x, "plotter", js.undefined)
        
        inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
        
        inline def setPointSizeNull: Self = StObject.set(x, "pointSize", null)
        
        inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
        
        inline def setShowInRangeSelector(value: Boolean): Self = StObject.set(x, "showInRangeSelector", value.asInstanceOf[js.Any])
        
        inline def setShowInRangeSelectorNull: Self = StObject.set(x, "showInRangeSelector", null)
        
        inline def setShowInRangeSelectorUndefined: Self = StObject.set(x, "showInRangeSelector", js.undefined)
        
        inline def setStepPlot(value: Boolean): Self = StObject.set(x, "stepPlot", value.asInstanceOf[js.Any])
        
        inline def setStepPlotNull: Self = StObject.set(x, "stepPlot", null)
        
        inline def setStepPlotUndefined: Self = StObject.set(x, "stepPlot", js.undefined)
        
        inline def setStrokeBorderColor(value: String): Self = StObject.set(x, "strokeBorderColor", value.asInstanceOf[js.Any])
        
        inline def setStrokeBorderColorNull: Self = StObject.set(x, "strokeBorderColor", null)
        
        inline def setStrokeBorderColorUndefined: Self = StObject.set(x, "strokeBorderColor", js.undefined)
        
        inline def setStrokeBorderWidth(value: Double): Self = StObject.set(x, "strokeBorderWidth", value.asInstanceOf[js.Any])
        
        inline def setStrokeBorderWidthNull: Self = StObject.set(x, "strokeBorderWidth", null)
        
        inline def setStrokeBorderWidthUndefined: Self = StObject.set(x, "strokeBorderWidth", js.undefined)
        
        inline def setStrokePattern(value: js.Array[Double]): Self = StObject.set(x, "strokePattern", value.asInstanceOf[js.Any])
        
        inline def setStrokePatternNull: Self = StObject.set(x, "strokePattern", null)
        
        inline def setStrokePatternUndefined: Self = StObject.set(x, "strokePattern", js.undefined)
        
        inline def setStrokePatternVarargs(value: Double*): Self = StObject.set(x, "strokePattern", js.Array(value*))
        
        inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
        
        inline def setStrokeWidthNull: Self = StObject.set(x, "strokeWidth", null)
        
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
      * {@link https://dygraphs.com/jsdoc/symbols/Dygraph.html#.PointType}
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
    
    type Ticker = js.Function6[
        /* min */ Double, 
        /* max */ Double, 
        /* pixels */ Double, 
        /* opts */ js.Function1[/* name */ String, Any], 
        /* dygraph */ ReadonlyDygraph, 
        /* vals */ js.Array[Double], 
        js.Array[Label]
      ]
  }
}
