package typings.dojo.dojox.charting

import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/DataChart.html
  *
  * Extension to the 2D chart that connects to a data store in
  * a simple manner. Convenience methods have been added for
  * connecting store item labels to the chart labels.
  * This code should be considered very experimental and the APIs subject
  * to change. This is currently an alpha version and will need some testing
  * and review.
  *
  * The main reason for this extension is to create animated charts, generally
  * available with scroll=true, and a property field that gets continually updated.
  * The previous property settings are kept in memory and displayed until scrolled
  * off the chart.
  *
  * Although great effort was made to maintain the integrity of the current
  * charting APIs, some things have been added or modified in order to get
  * the store to connect and also to get the data to scroll/animate.
  * "displayRange" in particular is used to force the xaxis to a specific
  * size and keep the chart from stretching or squashing to fit the data.
  *
  * Currently, plot lines can only be set at initialization. Setting
  * a new store query will have no effect (although using setStore
  * may work but its untested).
  *
  * @param node The node to attach the chart to.
  * @param kwArgs xaxis: Object: optional parameters for xaxis (see above)yaxis: Object: optional parameters for yaxis (see above)store: Object: dojo.data store (currently nly supports Persevere)xaxis: Object: First query for storegrid: Object: Options for the grid plotchartPlot: Object: Options for chart elements (lines, bars, etc)
  */
@JSGlobal("dojox.charting.DataChart")
@js.native
class DataChart protected () extends Chart2D {
  def this(node: HTMLElement, kwArgs: js.Object) = this()
  /**
    * The theme to style the chart. Defaults to PlotKit.blue.
    *
    */
  var chartTheme: js.Object = js.native
  /**
    * If false, all items are each their own series.
    * If true, the items are combined into one series
    * so that their charted properties can be compared.
    *
    */
  var comparative: Boolean = js.native
  /**
    * The number of major ticks to show on the xaxis
    *
    */
  var displayRange: Double = js.native
  /**
    * The field in the store item that is getting charted
    *
    */
  var fieldName: String = js.native
  /**
    * The name field of the store item
    * DO NOT SET: Set from store.labelAttribute
    *
    */
  var label: String = js.native
  /**
    * The the smallest the chart height can be
    *
    */
  var minHeight: Double = js.native
  /**
    * The the smallest the chart width can be
    *
    */
  var minWidth: Double = js.native
  /**
    * Used for fetching items. Will vary depending upon store.
    *
    */
  var query: String = js.native
  /**
    * Option used for fetching items
    *
    */
  var queryOptions: String = js.native
  /**
    * Whether live data updates and changes display, like columns moving
    * up and down, or whether it scrolls to the left as data is added
    *
    */
  var scroll: Boolean = js.native
  /**
    * Whether the chart is showing (default) on
    * initialization or hidden.
    *
    */
  var showing: Boolean = js.native
  /**
    * If true, chart is sized to data. If false, chart is a
    * fixed size. Note, is overridden by displayRange.
    * TODO: Stretch for the y-axis?
    *
    */
  var stretchToFit: Boolean = js.native
  /**
    * Convenience method to convert a label array of strings
    * into an array of objects
    *
    * @param axis
    */
  def convertLabels(axis: js.Any): js.Any = js.native
  /**
    * Fetches initial data. Subsequent changes
    * are received via onSet in data store.
    *
    */
  def fetch(): Unit = js.native
  /**
    * The main use of this function is to determine
    * between a single value and an array of values.
    * Other property types included for convenience.
    *
    * @param item
    * @param prop
    */
  def getProperty(item: js.Object, prop: js.Any): js.Any = js.native
  /**
    * If chart is showing, hide it
    * Prevents rendering while hidden
    *
    */
  def hide(): Unit = js.native
  /**
    * Called after a completed fetch
    * or when store items change.
    * On first run, sets the chart data,
    * then updates chart and legends.
    *
    * @param items
    */
  def onData(items: js.Array[_]): Unit = js.native
  /**
    * stub. Fires after data is received but
    * before data is parsed and rendered
    *
    * @param items
    */
  def onDataReceived(items: js.Array[_]): Unit = js.native
  /**
    *
    * @param err
    */
  def onError(err: Error): Unit = js.native
  /**
    * Fired when a store item changes.
    * Collects the item calls and when
    * done (after 200ms), sends item
    * array to onData().
    *
    * @param item
    */
  def onSet(item: js.Object): Unit = js.native
  /**
    * Call this function to change the chart size.
    * Can be connected to a layout widget that calls
    * resize.
    *
    * @param dim
    */
  def resizeChart(dim: js.Object): Unit = js.native
  /**
    * Convenience method that sets series labels based on item labels.
    *
    * @param val
    */
  def seriesLabels(`val`: Double): js.Any = js.native
  /**
    * Sets the chart store and query
    * then does the first fetch and
    * connects to subsequent changes.
    *
    * @param store
    * @param query
    * @param fieldName
    * @param queryOptions
    */
  def setStore(store: js.Object, query: String, fieldName: String, queryOptions: js.Object): Unit = js.native
  /**
    * If chart is hidden, show it
    *
    */
  def show(): Unit = js.native
}

