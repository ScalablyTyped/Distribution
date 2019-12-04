package typings.dojo.dojox.charting

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Chart.html
  *
  * The main chart object in dojox.charting.  This will create a two dimensional
  * chart based on dojox.gfx.
  * dojox.charting.Chart is the primary object used for any kind of charts.  It
  * is simple to create--just pass it a node reference, which is used as the
  * container for the chart--and a set of optional keyword arguments and go.
  *
  * Note that like most of dojox.gfx, most of dojox.charting.Chart's methods are
  * designed to return a reference to the chart itself, to allow for functional
  * chaining.  This makes defining everything on a Chart very easy to do.
  *
  * @param node
  * @param kwArgs       Optional
  */
@JSGlobal("dojox.charting.Chart")
@js.native
class Chart protected () extends js.Object {
  def this(node: HTMLElement) = this()
  def this(node: HTMLElement, kwArgs: js.Object) = this()
  /**
    * Add an axis to the chart, for rendering.
    *
    * @param name The name of the axis.
    * @param kwArgs               OptionalAn optional keyword arguments object for use in defining details of an axis.
    */
  def addAxis(name: String, kwArgs: js.Object): js.Any = js.native
  /**
    * Add a new plot to the chart, defined by name and using the optional keyword arguments object.
    * Note that dojox.charting assumes the main plot to be called "default"; if you do not have
    * a plot called "default" and attempt to add data series to the chart without specifying the
    * plot to be rendered on, you WILL get errors.
    *
    * @param name The name of the plot to be added to the chart.  If you only plan on using one plot, call it "default".
    * @param kwArgs An object with optional parameters for the plot in question.
    */
  def addPlot(name: String, kwArgs: js.Object): js.Any = js.native
  /**
    * Add a data series to the chart for rendering.
    *
    * @param name The name of the data series to be plotted.
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    * @param kwArgs               OptionalAn optional keyword arguments object that will be mixed intothe resultant series object.
    */
  def addSeries(name: String, data: js.Array[_], kwArgs: js.Object): js.Any = js.native
  /**
    * Add a data series to the chart for rendering.
    *
    * @param name The name of the data series to be plotted.
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    * @param kwArgs               OptionalAn optional keyword arguments object that will be mixed intothe resultant series object.
    */
  def addSeries(name: String, data: js.Object, kwArgs: js.Object): js.Any = js.native
  /**
    * Calculate the geometry of the chart based on the defined axes of
    * a chart.
    *
    */
  def calculateGeometry(): js.Any = js.native
  /**
    * A convenience method to connect a function to a plot.
    *
    * @param name The name of the plot as defined by addPlot.
    * @param object The object to be connected.
    * @param method The function to be executed.
    */
  def connectToPlot(name: String, `object`: js.Object, method: js.Function): js.Any = js.native
  /**
    * Delayed render, which is used to collect multiple updates
    * within a delayInMs time window.
    *
    */
  def delayedRender(): js.Any = js.native
  /**
    * Cleanup when a chart is to be destroyed.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Fires a synthetic event for a series item.
    *
    * @param seriesName Series name.
    * @param eventName Event name to simulate: onmouseover, onmouseout, onclick.
    * @param index Valid data value index for the event.
    */
  def fireEvent(seriesName: String, eventName: String, index: Double): js.Any = js.native
  /**
    *
    * @param element
    * @param label
    * @param labelType
    */
  def formatTruncatedLabel(element: js.Any, label: js.Any, labelType: js.Any): Unit = js.native
  /**
    * Calculate the full geometry of the chart.  This includes passing
    * over all major elements of a chart (plots, axes, series, container)
    * in order to ensure proper rendering.
    *
    */
  def fullGeometry(): js.Any = js.native
  /**
    * Force a full rendering of the chart, including full resets on the chart itself.
    * You should not call this method directly unless absolutely necessary.
    *
    */
  def fullRender(): js.Any = js.native
  /**
    * Get the given axis, by name.
    *
    * @param name The name the axis was defined by.
    */
  def getAxis(name: String): js.Any = js.native
  /**
    * Get the coordinates and dimensions of the containing DOMNode, as
    * returned by dojo.coords.
    *
    */
  def getCoords(): js.Any = js.native
  /**
    * Returns a map of information about all axes in a chart and what they represent
    * in terms of scaling (see dojox.charting.axis2d.Default.getScaler).
    *
    */
  def getGeometry(): js.Any = js.native
  /**
    * Get the given plot, by name.
    *
    * @param name The name the plot was defined by.
    */
  def getPlot(name: String): js.Any = js.native
  /**
    * Returns an array of plot names in the current order
    * (the top-most plot is the first).
    *
    */
  def getPlotOrder(): js.Any = js.native
  /**
    * Get the given series, by name.
    *
    * @param name The name the series was defined by.
    */
  def getSeries(name: String): js.Any = js.native
  /**
    * Returns an array of series names in the current order
    * (the top-most series is the first) within a plot.
    *
    * @param plotName Plot's name.
    */
  def getSeriesOrder(plotName: String): js.Any = js.native
  /**
    * Moves a given plot to back.
    *
    * @param name Plot's name to move.
    */
  def movePlotToBack(name: String): js.Any = js.native
  /**
    * Moves a given plot to front.
    *
    * @param name Plot's name to move.
    */
  def movePlotToFront(name: String): js.Any = js.native
  /**
    * Moves a given series to back of a plot.
    *
    * @param name Series' name to move.
    */
  def moveSeriesToBack(name: String): js.Any = js.native
  /**
    * Moves a given series to front of a plot.
    *
    * @param name Series' name to move.
    */
  def moveSeriesToFront(name: String): js.Any = js.native
  /**
    * Remove the axis that was defined using name.
    *
    * @param name The axis name, as defined in addAxis.
    */
  def removeAxis(name: String): js.Any = js.native
  /**
    * Remove the plot defined using name from the chart's plot stack.
    *
    * @param name The name of the plot as defined using addPlot.
    */
  def removePlot(name: String): js.Any = js.native
  /**
    * Remove the series defined by name from the chart.
    *
    * @param name The name of the series as defined by addSeries.
    */
  def removeSeries(name: String): js.Any = js.native
  /**
    * Render the chart according to the current information defined.  This should
    * be the last call made when defining/creating a chart, or if data within the
    * chart has been changed.
    *
    */
  def render(): js.Any = js.native
  /**
    * Resize the chart to the dimensions of width and height.
    * Resize the chart and its surface to the width and height dimensions.
    * If a single argument of the form {w: value1, h: value2} is provided take that argument as the dimensions to use.
    * Finally if no argument is provided, resize the surface to the marginBox of the chart.
    *
    * @param width               OptionalThe new width of the chart or the box definition.
    * @param height               OptionalThe new height of the chart.
    */
  def resize(width: js.Object, height: Double): js.Any = js.native
  /**
    * Resize the chart to the dimensions of width and height.
    * Resize the chart and its surface to the width and height dimensions.
    * If a single argument of the form {w: value1, h: value2} is provided take that argument as the dimensions to use.
    * Finally if no argument is provided, resize the surface to the marginBox of the chart.
    *
    * @param width               OptionalThe new width of the chart or the box definition.
    * @param height               OptionalThe new height of the chart.
    */
  def resize(width: Double, height: Double): js.Any = js.native
  /**
    * Zooms an axis and all dependent plots. Can be used to zoom in 1D.
    *
    * @param name The name of the axis as defined by addAxis.
    * @param scale The scale on the target axis.
    * @param offset Any offest, as measured by axis tick
    * @param zoom               OptionalThe chart zooming animation trigger.  This is null by default,e.g. {duration: 1200}, or just set true.
    */
  def setAxisWindow(name: String, scale: Double, offset: Double, zoom: js.Object): js.Any = js.native
  /**
    * Zooms an axis and all dependent plots. Can be used to zoom in 1D.
    *
    * @param name The name of the axis as defined by addAxis.
    * @param scale The scale on the target axis.
    * @param offset Any offest, as measured by axis tick
    * @param zoom               OptionalThe chart zooming animation trigger.  This is null by default,e.g. {duration: 1200}, or just set true.
    */
  def setAxisWindow(name: String, scale: Double, offset: Double, zoom: Boolean): js.Any = js.native
  /**
    *
    * @param dir
    */
  def setDir(dir: js.Any): js.Function = js.native
  /**
    * Sets new order of plots. newOrder cannot add or remove
    * plots. Wrong names, or dups are ignored.
    *
    * @param newOrder Array of plot names compatible with getPlotOrder().
    */
  def setPlotOrder(newOrder: js.Array[_]): js.Any = js.native
  /**
    * Sets new order of series within a plot. newOrder cannot add
    * or remove series. Wrong names, or dups are ignored.
    *
    * @param newOrder Array of series names compatible with getPlotOrder(). Allseries should belong to the same plot.
    */
  def setSeriesOrder(newOrder: js.Array[_]): js.Any = js.native
  /**
    * Set a theme of the chart.
    *
    * @param theme The theme to be used for visual rendering.
    */
  def setTheme(theme: SimpleTheme): js.Any = js.native
  /**
    * Zooms in or out any plots in two dimensions.
    *
    * @param sx The scale for the x axis.
    * @param sy The scale for the y axis.
    * @param dx The pixel offset on the x axis.
    * @param dy The pixel offset on the y axis.
    * @param zoom               OptionalThe chart zooming animation trigger.  This is null by default,e.g. {duration: 1200}, or just set true.
    */
  def setWindow(sx: Double, sy: Double, dx: Double, dy: Double, zoom: js.Object): js.Any = js.native
  /**
    * Zooms in or out any plots in two dimensions.
    *
    * @param sx The scale for the x axis.
    * @param sy The scale for the y axis.
    * @param dx The pixel offset on the x axis.
    * @param dy The pixel offset on the y axis.
    * @param zoom               OptionalThe chart zooming animation trigger.  This is null by default,e.g. {duration: 1200}, or just set true.
    */
  def setWindow(sx: Double, sy: Double, dx: Double, dy: Double, zoom: Boolean): js.Any = js.native
  /**
    * Update the given series with a new set of data points.
    *
    * @param name The name of the series as defined in addSeries.
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    * @param offsets               OptionalIf true recomputes the offsets of the chart based on the newdata. This is useful if the range of data is drastically changingand offsets need to be recomputed.
    */
  def updateSeries(name: String, data: js.Array[_], offsets: Boolean): js.Any = js.native
  /**
    * Update the given series with a new set of data points.
    *
    * @param name The name of the series as defined in addSeries.
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    * @param offsets               OptionalIf true recomputes the offsets of the chart based on the newdata. This is useful if the range of data is drastically changingand offsets need to be recomputed.
    */
  def updateSeries(name: String, data: js.Object, offsets: Boolean): js.Any = js.native
  /**
    * Zoom the chart to a specific range on one axis.  This calls render()
    * directly as a convenience method.
    *
    * @param name The name of the axis as defined by addAxis.
    * @param range The end points of the zoom range, measured in axis ticks.
    * @param delayed
    */
  def zoomIn(name: String, range: js.Array[_], delayed: js.Any): Unit = js.native
}

