package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/StoreSeries.html
  *
  *
  * @param store A dojo object store.
  * @param kwArgs A store-specific keyword parameters used for querying objects.See dojo.store docs
  * @param value Function, which takes an object handle, andproduces an output possibly inspecting the store's item. Ora dictionary object, which tells what names to extract froman object and how to map them to an output. Or a string, whichis a numeric field name to use for plotting. If undefined, nullor empty string (the default), "value" field is extracted.
  */
@JSGlobal("dojox.charting.StoreSeries")
@js.native
class StoreSeries protected () extends js.Object {
  def this(store: js.Object, kwArgs: js.Object, value: js.Function) = this()
  /**
    * Clean up before GC.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Fetches data from the store and updates a chart.
    *
    */
  def fetch(): Unit = js.native
  /**
    * Sets a dojox.charting.Series object we will be working with.
    *
    * @param series Our interface to the chart.
    */
  def setSeriesObject(series: Series): Unit = js.native
}

