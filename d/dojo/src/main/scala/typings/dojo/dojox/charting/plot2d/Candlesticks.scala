package typings.dojo.dojox.charting.plot2d

import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.charting.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/Candlesticks.html
  *
  * A plot that represents typical candlesticks (financial reporting, primarily).
  * Unlike most charts, the Candlestick expects data points to be represented by
  * an object of the form { x?, open, close, high, low, mid? }, where both
  * x and mid are optional parameters.  If x is not provided, the index of the
  * data array is used.
  *
  * @param chart The chart this plot belongs to.
  * @param kwArgs       OptionalAn optional keyword arguments object to help define the plot.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.charting.plot2d._PlotEvents because Inheritance from two classes. Inlined connect, connect, destroy, events, fireEvent, plotEvent, raiseEvent, resetEvents */ @JSGlobal("dojox.charting.plot2d.Candlesticks")
@js.native
class Candlesticks protected () extends CartesianBase {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    *
    */
  var defaultParams: js.Object = js.native
  /**
    *
    */
  var optionalParams: js.Object = js.native
  /**
    * Collect all statistics for drawing this chart.  Since the common
    * functionality only assumes x and y, Candlesticks must create it's own
    * stats (since data has no y value, but open/close/high/low instead).
    *
    * @param series The data series array to be drawn on this plot.
    */
  def collectStats(series: Series): js.Any = js.native
  /**
    * Helper function to connect any object's method to our plotEvent.
    *
    * @param object The object to connect to.
    * @param method The method to fire when our plotEvent is fired.
    */
  def connect(`object`: js.Object, method: String): js.Any = js.native
  /**
    * Helper function to connect any object's method to our plotEvent.
    *
    * @param object The object to connect to.
    * @param method The method to fire when our plotEvent is fired.
    */
  def connect(`object`: js.Object, method: js.Function): js.Any = js.native
  /**
    * Find out if any event handlers have been connected to our plotEvent.
    *
    */
  def events(): js.Any = js.native
  /**
    * Emulates firing an event for a given data value (specified by
    * an index) of a given series.
    *
    * @param seriesName Series name.
    * @param eventName Event name to emulate.
    * @param index Valid data value index used to raise an event.
    * @param eventObject               OptionalOptional event object. Especially useful for synthetic events.Default: null.
    */
  def fireEvent(seriesName: String, eventName: String, index: Double, eventObject: js.Object): Unit = js.native
  /**
    * Stub function for use by specific plots.
    *
    * @param o An object intended to represent event parameters.
    */
  def plotEvent(o: js.Object): Unit = js.native
  /**
    * Raises events in predefined order
    *
    * @param o An object intended to represent event parameters.
    */
  def raiseEvent(o: js.Object): Unit = js.native
  /**
    * Reset all events attached to our plotEvent (i.e. disconnect).
    *
    */
  def resetEvents(): Unit = js.native
  /**
    *
    * @param o
    */
  def tooltipFunc(o: js.Any): String = js.native
}

