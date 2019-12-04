package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Series.html
  *
  * An object representing a series of data for plotting on a chart.
  *
  * @param chart The chart that this series belongs to.
  * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
  * @param kwArgs       OptionalAn optional keyword arguments object to set details for this series.
  */
@JSGlobal("dojox.charting.Series")
@js.native
class Series protected () extends Element {
  def this(chart: Chart, data: js.Array[_]) = this()
  def this(chart: Chart, data: js.Array[_], kwArgs: js.Object) = this()
  /**
    * Clear the calculated additional parameters set on this series.
    *
    */
  def clear(): Unit = js.native
  /**
    * Set data and make this object dirty, so it can be redrawn.
    *
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    */
  def update(data: js.Array[_]): Unit = js.native
  /**
    * Set data and make this object dirty, so it can be redrawn.
    *
    * @param data The array of data points (either numbers or objects) thatrepresents the data to be drawn. Or it can be an object. Inthe latter case, it should have a property "data" (an array),destroy(), and setSeriesObject().
    */
  def update(data: js.Object): Unit = js.native
}

