package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/DataSeries.html
  *
  *
  * @param store A dojo.data store object.
  * @param kwArgs A store-specific keyword parameters used for fetching items.See dojo/data/api/Read.fetch().
  * @param value Function, which takes a store, and an object handle, andproduces an output possibly inspecting the store's item. Ora dictionary object, which tells what names to extract froman object and how to map them to an output. Or a string, whichis a numeric field name to use for plotting. If undefined, nullor empty string (the default), "value" field is extracted.
  */
@JSGlobal("dojox.charting.DataSeries")
@js.native
class DataSeries protected () extends js.Object {
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
    * As stub to process fetch errors. Provide so user can attach to
    * it with dojo.connect(). See dojo/data/api/Read fetch() for
    * details: onError property.
    *
    * @param errorData
    * @param request
    */
  def onFetchError(errorData: js.Any, request: js.Any): Unit = js.native
  /**
    * Sets a dojox.charting.Series object we will be working with.
    *
    * @param series Our interface to the chart.
    */
  def setSeriesObject(series: Series): Unit = js.native
}

