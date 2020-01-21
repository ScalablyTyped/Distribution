package typings.dojo.dojox.mvc.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_base.StatefulSeries.html
  *
  * Chart data plugin ("series") that watches for properties specified in dojox/mvc/at handles in the given data.
  * At initialization, and when the properties are updated, creates the data from data given and updates the chart.
  *
  * @param items
  */
@JSGlobal("dojox.mvc._base.StatefulSeries")
@js.native
class StatefulSeries protected () extends js.Object {
  def this(items: js.Array[_]) = this()
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param series
    */
  def setSeriesObject(series: js.Any): Unit = js.native
}

